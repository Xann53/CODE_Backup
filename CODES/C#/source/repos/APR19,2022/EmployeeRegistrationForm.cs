using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data;
using System.Data.OleDb;

namespace APR19_2022
{
    public partial class EmployeeRegistrationForm : Form
    {
        private OleDbConnection connection = new OleDbConnection();

        public EmployeeRegistrationForm()
        {
            InitializeComponent();
            connection.ConnectionString = @"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\-A-J-X-B-\Desktop\XAN\CODES\APPSDEV22.accdb;Persist Security Info=False;";
        }

        private void SaveButton_Click(object sender, EventArgs e)
        {
            connection.Open();

            OleDbDataAdapter adapter = new OleDbDataAdapter("select * from EMPLOYEEFILE", connection);
            OleDbCommandBuilder cmdBuild = new OleDbCommandBuilder(adapter);

            DataSet set = new DataSet();
            adapter.Fill(set, "EMPLOYEEFILE");
            DataRow newRow = set.Tables["EMPLOYEEFILE"].NewRow();

            if (EmployeeCodeTxtBox.Text.All(char.IsDigit)) {
                if (newRow != null) {
                    newRow["EMPCODE"] = EmployeeCodeTxtBox.Text;
                    newRow["EMPFIRSTNAME"] = FirstNameTxtBox.Text;
                    newRow["EMPLASTNAME"] = LastNameTxtBox.Text;
                    newRow["EMPADDRESS"] = AddressTxtBox.Text;
                    newRow["EMPPOSITION"] = PositionTxtBox.Text;
                    newRow["EMPSTATUS"] = StatusTxtBox.Text;
                    newRow["EMPDATEHIRED"] = DateHiredPicker.Text;
                    try {
                        newRow["EMPSALARY"] = SalaryTxtBox.Text;
                    } catch (Exception a) {
                        newRow["EMPSALARY"] = 0;
                    }
                    MessageBox.Show("Entries successfully recorded");

                    set.Tables["EMPLOYEEFILE"].Rows.Add(newRow);
                    adapter.Update(set, "EMPLOYEEFILE");
                } else
                    MessageBox.Show("Duplicates found");
            } else
                MessageBox.Show("Employee ID must be in numerical format.");
            
            connection.Close();
        }

        private void VerifyButton_Click(object sender, EventArgs e)
        {
            connection.Open();
            
            OleDbCommand command = new OleDbCommand();
            command.Connection = connection;
            command.CommandText = "select * from EMPLOYEEFILE where EMPCODE='" + EmployeeCodeTxtBox.Text + "' and EMPFIRSTNAME='" + FirstNameTxtBox.Text + "' and EMPLASTNAME='" + LastNameTxtBox.Text + "'";

            OleDbDataReader reader = command.ExecuteReader();
            int count = 0;
            while (reader.Read()) {
                count++;
            } if (count >= 1) {
                MessageBox.Show("Employee is registered in records.");
            } else {
                MessageBox.Show("Employee is not registered in records.");
            }

            connection.Close();
        }
    }
}
