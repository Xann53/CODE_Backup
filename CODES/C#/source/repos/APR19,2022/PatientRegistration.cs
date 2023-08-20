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
    public partial class PatientRegistration : Form
    {
        private OleDbConnection dataConnect = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\-A-J-X-B-\Desktop\XAN\CODES\APPSDEV22.accdb;Persist Security Info=False;");
        public PatientRegistration()
        {
            InitializeComponent();
        }

        private void Clear() {
            PatientCodeTextBox.Text = null;
            PatientFirstNameTextBox.Text = null;
            PatientLastNameTextBox.Text = null;
            PatientAddressTextBox.Text = null;
            FatherNameTextBox.Text = null;
            MotherNameTextBox.Text = null;
            TelephoneTextBox.Text = null;
            AgeTextBox.Text = null;
            GenderTextBox.Text = null;
            WeightTextBox.Text = null;
            HeightTextBox.Text = null;
        }

        private void SaveButton_Click(object sender, EventArgs e)
        {
            dataConnect.Open();
            
            if (PatientCodeTextBox.Text.All(char.IsDigit))
            {
                try
                {
                    OleDbCommand command = new OleDbCommand();
                    command.Connection = dataConnect;
                    OleDbCommand command2 = new OleDbCommand();
                    command2.Connection = dataConnect;

                    command.CommandText = "SELECT PATIENTCODE FROM PATIENTFILE WHERE PATIENTCODE = '" + PatientCodeTextBox.Text + "'";
                    OleDbDataReader reader = command.ExecuteReader();
                    Boolean found = false;

                    while (reader.Read())
                        if (reader["PATIENTCODE"].ToString().Trim() == PatientCodeTextBox.Text.Trim())
                            found = true;

                    if (!found)
                    {
                        command2.CommandText = "INSERT INTO PATIENTFILE (PATIENTCODE, PATIENTFIRSTNAME, PATIENTLASTNAME, PATIENTADDRESS, PATIENTTELNO, PATIENTFATHERSNAME, PATIENTMOTHERSNAME, PATIENTGENDER, PATIENTBIRTHDAY, PATIENTAGE, PATIENTWEIGHT, PATIENTHEIGHT) VALUES('" + PatientCodeTextBox.Text + "', '" + PatientFirstNameTextBox.Text + "', '" + PatientLastNameTextBox.Text + "', '" + PatientAddressTextBox.Text + "', '" + TelephoneTextBox.Text + "', '" + FatherNameTextBox.Text + "', '" + MotherNameTextBox.Text + "', '" + GenderTextBox.Text + "', '" + BDayDatePicker.Text + "', '" + AgeTextBox.Text + "', '" + WeightTextBox.Text + "', '" + HeightTextBox.Text + "')";
                        command2.ExecuteNonQuery();
                        MessageBox.Show("Patient record has been added to database.");
                    } else
                        MessageBox.Show("Patient record already exist in database.");
                }
                catch (Exception a)
                {
                    MessageBox.Show("INPUT ERROR: Missing or Mismatched Inputs Detected.");
                }
            }
            Clear();

            dataConnect.Close();
        }

        private void DeleteButton_Click(object sender, EventArgs e)
        {
            dataConnect.Open();

            try
            {
                OleDbCommand command = new OleDbCommand();
                command.Connection = dataConnect;
                OleDbCommand command2 = new OleDbCommand();
                command2.Connection = dataConnect;

                command.CommandText = "SELECT PATIENTCODE FROM PATIENTFILE WHERE PATIENTCODE = '" + PatientCodeTextBox.Text + "'";
                OleDbDataReader reader = command.ExecuteReader();
                Boolean found = false;

                while (reader.Read()) {
                    if (reader["PATIENTCODE"].ToString().Trim() == PatientCodeTextBox.Text.Trim()) {
                        command2.CommandText = "DELETE FROM PATIENTFILE WHERE PATIENTCODE = '" + PatientCodeTextBox.Text + "'";
                        command2.ExecuteNonQuery();
                        MessageBox.Show("Patient record has been deleted from database.");
                        found = true;
                    }
                }
                if(!found)
                    MessageBox.Show("Patient's record does not exist in database.");
            }
            catch (Exception a)
            {
                MessageBox.Show("INPUT ERROR: Missing or Mismatched Inputs Detected.");
            }
            Clear();

            dataConnect.Close();
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
