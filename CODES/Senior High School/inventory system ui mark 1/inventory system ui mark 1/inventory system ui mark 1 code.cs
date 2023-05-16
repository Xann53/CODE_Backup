using System;
using System.Data.OleDb;

public class Class1
{
	public Class1()
	{
		private OleDbConnection mycon;

		private OleDbDataReader dr = null;

		private OleDbCommand cmd = null;
	}
}
mycon = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=inventory.accdb");

mycon.Open();
 
            string cmdstr = "SELECT Password FROM admin WHERE ID ='" + textBox1.Text + "' ";

cmd = new OleDbCommand(cmdstr, mycon);

dr = cmd.ExecuteReader();
 
            string[] login = new string[3];
 
            while (dr.Read())
 
            {
 
                login[1] = (dr["Password"].ToString());
 
            }
 
            dr.Close();
 
            mycon.Close();
 
//This code presents a confirmation message if the password typed //inside the maskedTextBox matches with the one in the database and an //error message if not
 
            if (maskedTextBox1.Text == login[1])
 
            {
 
                MessageBox.Show("LOG-IN SUCCESFUL!", "Confirmation Message");
 
                Form control = new Form2();

control.Show();


                this.Hide();


            }
 
            else
 
            {
 
                MessageBox.Show("LOG-IN FAILED!", "Confirmation Message");
 
            }