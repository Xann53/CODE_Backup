using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Simple_Calculator
{
    public partial class Base : Form
    {
        private double val = 0, rOperand = 0;
        private string operatorSym, input;
        private string[] fiInput;

        public Base()
        {
            InitializeComponent();
            OutputTxt.Text = val.ToString();
        }

        private void CalculateButton_Click(object sender, EventArgs e)
        {
            ScanData();

            switch (operatorSym)
            {
                case "+":
                    val = val + rOperand;
                    break;
                case "-":
                    val = val - rOperand;
                    break;
                case "*":
                    val = val * rOperand;
                    break;
                case "/":
                    val = val / rOperand;
                    break;
                case "^":
                    double x = val;
                    for (int i = 0; i < rOperand; i++)
                    {
                        val = val * x;
                    }
                    break;
                case "q":
                    Application.Exit();
                    break;
                default:
                    MessageBox.Show("Invalid Operator", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    break;
            }
            
            OutputTxt.Text = val.ToString();
            InputTxt.Text = null;
        }

        private void ScanData()
        {
            input = InputTxt.Text;
            input = input.Trim();

            try
            {
                fiInput = new string[2];
                fiInput = input.Split(' ');

                for (int i = 0; i < fiInput.Length; i++)
                {
                    if (i == 0)
                        operatorSym = fiInput[i];
                    else if (i == 1)
                        rOperand = double.Parse(fiInput[i]);
                }
                

            }
            catch (Exception e)
            {
                String inv = e.Message;
                MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
    }
}
