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
    public partial class ConsultationForm : Form
    {
        private OleDbConnection dataConnect = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\-A-J-X-B-\Desktop\XAN\CODES\APPSDEV22.accdb;Persist Security Info=False;");

        public ConsultationForm()
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

            if (ConsultationNumTextBox.Text.All(char.IsDigit) && ImmunizationNoTextBox.Text.All(char.IsDigit) && BodyTempTextBox.Text.All(char.IsDigit) && WeightTextBox.Text.All(char.IsDigit) && HeightTextBox.Text.All(char.IsDigit))
            {
                try
                {
                    OleDbCommand command = new OleDbCommand();
                    command.Connection = dataConnect;
                    OleDbCommand command2 = new OleDbCommand();
                    command2.Connection = dataConnect;
                    OleDbCommand command3 = new OleDbCommand();
                    command3.Connection = dataConnect;

                    command.CommandText = "SELECT * FROM CONSULTATIONHEADERFILE WHERE CONHNO = '" + ConsultationNumTextBox.Text + "'";
                    OleDbDataReader reader = command.ExecuteReader();
                    Boolean found = false;
                    while (reader.Read())
                        found = true;

                    if (found)
                    {
                        command2.CommandText = "UPDATE CONSULTATIONHEADERFILE SET CONHIMMUREF = '" + ImmunizationNoTextBox.Text + "', CONHDATE = '" + ConsultationDatePicker.Text + "', CONHPATIENTCODE = '" + PatientCodeTextBox.Text + "', CONHPATIENTWEIGHT = '" + WeightTextBox.Text + "', CONHPATIENTHEIGHT = '" + HeightTextBox.Text + "', CONHPATIENTBODYTEMP = '" + BodyTempTextBox.Text + "' WHERE CONHNO = '" + ConsultationNumTextBox.Text + "'";
                        command2.ExecuteNonQuery();
                        MessageBox.Show("Patient record has been updated.");
                    }
                    else
                    {
                        command3.CommandText = "INSERT INTO CONSULTATIONHEADERFILE (CONHNO, CONHIMMUREF, CONHDATE, CONHPATIENTCODE, CONHPATIENTWEIGHT, CONHPATIENTHEIGHT, CONHPATIENTBODYTEMP) VALUES ('" + ConsultationNumTextBox.Text + "', '" + ImmunizationNoTextBox.Text + "', '" + ConsultationDatePicker.Text + "', '" + PatientCodeTextBox.Text + "', '" + WeightTextBox.Text + "', '" + HeightTextBox.Text + "', '" + BodyTempTextBox.Text + "')";
                        command3.ExecuteNonQuery();
                        MessageBox.Show("Patient record has been added.");
                    }
                }
                catch (Exception a)
                {
                    MessageBox.Show("INPUT ERROR: Missing or Mismatched Inputs Detected. " + a);
                }
            } else
                MessageBox.Show("INPUT ERROR: Missing or Mismatched Inputs Detected.");
            Clear();

            dataConnect.Close();
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
            BodyTempTextBox.Text = null;
            DiagnosisCodeTextBox.Text = null;
            PhysicianNotesTextBox.Text = null;
        }

        private void ClearButton_Click(object sender, EventArgs e)
        {
            Clear();
        }

        private void TransferButton_Click(object sender, EventArgs e)
        {
            dataConnect.Close();
            dataConnect.Dispose();
            this.Hide();
            ImmunizationEntry ImmEntry = new ImmunizationEntry();
            ImmEntry.ShowDialog();
            this.Dispose();
        }
    }
}
