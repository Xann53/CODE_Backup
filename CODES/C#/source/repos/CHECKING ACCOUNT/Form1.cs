// Programmer: Xannetz V. Suficiencia
// Date: March 10, 2022
// Program Name: Checking Account

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CHECKING_ACCOUNT
{
    public partial class Form1 : Form
    {
        private Boolean Validation = true;
        private double Balance = 0;
        private double Amount = 0;
        private int TotalDeposites = 0;
        private double TotalDepositeAmount = 0;
        private int TotalChecks = 0;
        private double TotalCheckAmount = 0;

        public Form1()
        {
            InitializeComponent();
            textBox2.Text = "$ " + Balance.ToString();
        }

        public void getAmount() {
            try {
                Amount = double.Parse(textBox1.Text);
                Validation = true;
            } catch (Exception a) {
                String inv = a.Message;
                MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                Validation = false;
                clear();
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Boolean noAmount = false;
            if (textBox1.Text == "") {
                clear();
                MessageBox.Show("Invalid. No amount entered", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                noAmount = true;
            } else
                getAmount();

            if (Validation) {
                if (radioButton1.Checked) {
                    DepositTran();
                } else if (radioButton2.Checked) {
                    CheckTran();
                } else if (radioButton3.Checked) {
                    ServiceChargeTran();
                } else if(!noAmount)
                    MessageBox.Show("You must choose transaction option", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        private void DepositTran() {
            Balance += Amount;
            TotalDepositeAmount += Amount;
            TotalDeposites++;
            clear();
        }

        private void CheckTran()
        {
            if (Balance - Amount >= 0) {
                Balance -= Amount;
                TotalCheckAmount += Amount;
                TotalChecks++;
            } else {
                Balance -= 10;
                TotalCheckAmount += 10;
                Insufficient();
            }
             clear();
        }

        private void ServiceChargeTran() {
            if (Balance - Amount >= 0)
                Balance -= Amount;
            else
                Insufficient();
            clear();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            clear();
        }

        private void clear() {
            textBox1.Text = null;
            textBox2.Text = "$ " + Balance.ToString();
            radioButton1.Checked = false;
            radioButton2.Checked = false;
            radioButton3.Checked = false;
        }

        private void Insufficient() {
            MessageBox.Show("Invalid. Insufficient funds.", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Are you sure you want to exit application?", "Exit message", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes) {
                Application.Exit();
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            String Summary;
            Summary = "Total number of deposites made: " + TotalDeposites
            + "\nTotal amount of all deposites: $ " + TotalDepositeAmount
            + "\nTotal number of checks made: " + TotalChecks
            + "\nTotal amount of all checks: $ " + TotalCheckAmount;

            MessageBox.Show(Summary, "Summary", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
    }
}
