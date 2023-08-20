using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.OleDb;

namespace APR19_2022
{
    public partial class ImmunizationEntry : Form
    {
        private OleDbConnection dataConnect = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\-A-J-X-B-\Desktop\XAN\CODES\APPSDEV22.accdb;Persist Security Info=False;");

        public ImmunizationEntry()
        {
            InitializeComponent();
        }

        private void PatientCodeTextBox_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == (char)Keys.Enter)
            {
                dataConnect.Open();
                
                OleDbCommand command = new OleDbCommand("select * from PATIENTFILE where PATIENTCODE='" + PatientCodeTextBox.Text + "'", dataConnect);
                OleDbDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    if (reader["PATIENTCODE"].ToString().Trim() == PatientCodeTextBox.Text.Trim())
                    {
                        string tempFName = reader["PATIENTFIRSTNAME"].ToString();
                        string tempLName = reader["PATIENTLASTNAME"].ToString();
                        PatientFullNameTextBox.Text = tempFName + " " + tempLName;
                        PatientAddressTextBox.Text = reader["PATIENTADDRESS"].ToString();
                        TelephoneTextBox.Text = reader["PATIENTTELNO"].ToString();
                        FatherNameTextBox.Text = reader["PATIENTFATHERSNAME"].ToString();
                        MotherNameTextBox.Text = reader["PATIENTMOTHERSNAME"].ToString();
                        GenderTextBox.Text = reader["PATIENTGENDER"].ToString();
                        BDayDatePicker.Text = reader["PATIENTBIRTHDAY"].ToString();
                        AgeTextBox.Text = reader["PATIENTAGE"].ToString();
                        WeightTextBox.Text = reader["PATIENTWEIGHT"].ToString();
                        HeightTextBox.Text = reader["PATIENTHEIGHT"].ToString();
                    }
                }
                
                dataConnect.Close();
            }
        }

        private void SaveButton_Click(object sender, EventArgs e)
        {
            dataConnect.Open();

            if (ImmunizationNoTextBox.Text.All(char.IsDigit) && ShotNumTextBox.Text.All(char.IsDigit) && WeightTextBox.Text.All(char.IsDigit) && HeightTextBox.Text.All(char.IsDigit))
            {
                try
                {
                    OleDbCommand command = new OleDbCommand();
                    command.Connection = dataConnect;
                    OleDbCommand command2 = new OleDbCommand();
                    command2.Connection = dataConnect;
                    OleDbCommand command3 = new OleDbCommand();
                    command3.Connection = dataConnect;

                    command3.CommandText = "SELECT * FROM VACCINEFILE WHERE VACCODE = '"+ VaccineCodeTextBox.Text + "'";
                    OleDbDataReader reader = command3.ExecuteReader();
                    Boolean found = false;
                    while (reader.Read())
                        found = true;

                    if (found) {
                        command.CommandText = "UPDATE PATIENTFILE SET PATIENTWEIGHT = '" + WeightTextBox.Text + "', PATIENTHEIGHT = '" + HeightTextBox.Text + "' WHERE PATIENTCODE = '" + PatientCodeTextBox.Text + "'";
                        command.ExecuteNonQuery();
                        command2.CommandText = "INSERT INTO IMMUNIZATIONFILE (IMMNUM, PATIENTCODE, VACCODE, PREPAREDBY, IMMUNIZEDBY, SHOTNUM, REACTION, IMMDATE, PATIENTWEIGHT, PATIENTHEIGHT) VALUES('" + ImmunizationNoTextBox.Text + "','" + PatientCodeTextBox.Text + "','" + VaccineCodeTextBox.Text + "','" + PreparedByTextBox.Text + "','" + ImmunizedByTextBox.Text + "','" + ShotNumTextBox.Text + "','" + ReactionTextBox.Text + "','" + ImmunizationDatePicker.Text + "','" + WeightTextBox.Text + "','" + HeightTextBox.Text + "')";
                        command2.ExecuteNonQuery();
                        MessageBox.Show("Patient records have been added and updated.");
                        dataConnect.Close();
                        ShowVaccineFile();
                    } else
                        MessageBox.Show("ERROR: Invalid Vaccine Code.");
                }
                catch (Exception a)
                {
                    MessageBox.Show("INPUT ERROR: Missing or Mismatched Inputs Detected.");
                }
            }
            
            dataConnect.Close();
        }

        private void ShowVaccineFile()
        {
            dataConnect.Open();

            OleDbCommand command = new OleDbCommand();
            command.Connection = dataConnect;
            command.CommandText = "SELECT * FROM VACCINEFILE WHERE VACCODE = '" + VaccineCodeTextBox.Text + "'";

            OleDbDataAdapter dataAdapter = new OleDbDataAdapter(command);
            DataTable dataTable = new DataTable();
            dataAdapter.Fill(dataTable);
            VaccineTable.DataSource = dataTable;

            dataConnect.Close();
        }

        private void ClearButton_Click(object sender, EventArgs e)
        {
            Clear();
        }

        private void Clear()
        {
            PatientCodeTextBox.Text = null;
            PatientFullNameTextBox.Text = null;
            PatientAddressTextBox.Text = null;
            FatherNameTextBox.Text = null;
            MotherNameTextBox.Text = null;
            TelephoneTextBox.Text = null;
            AgeTextBox.Text = null;
            GenderTextBox.Text = null;
            WeightTextBox.Text = null;
            HeightTextBox.Text = null;
            ImmunizationNoTextBox.Text = null;
            VaccineCodeTextBox.Text = null;
            ShotNumTextBox.Text = null;
            ReactionTextBox.Text = null;
            PreparedByTextBox.Text = null;
            ImmunizedByTextBox.Text = null;
        }

        private void TransferButton_Click(object sender, EventArgs e)
        {
            dataConnect.Close();
            dataConnect.Dispose();
            this.Hide();
            PatientRegistration Rgstr = new PatientRegistration();
            Rgstr.ShowDialog();
            this.Dispose();
        }

        private void TransferButton2_Click(object sender, EventArgs e)
        {
            dataConnect.Close();
            dataConnect.Dispose();
            this.Hide();
            ConsultationForm Consult = new ConsultationForm();
            Consult.ShowDialog();
            this.Dispose();
        }
    }
}
