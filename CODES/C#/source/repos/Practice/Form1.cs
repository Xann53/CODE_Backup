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

namespace Practice
{
    public partial class PracticeForm : Form
    {
        private OleDbConnection dataConnect = new OleDbConnection(@"Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\-A-J-X-B-\Desktop\XAN\CODES\APPSDEV22.accdb;Persist Security Info=False;");
        public PracticeForm()
        {
            InitializeComponent();
            dataConnect.Open();
        }

        private void SaveButton_Click(object sender, EventArgs e)
        {
            OleDbCommand cmd = new OleDbCommand("select * from PRACTICETABLE where IDNUM = '" + IdNumTextBox.Text + "'" , dataConnect);
            OleDbDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {

            }
        }
    }
}
