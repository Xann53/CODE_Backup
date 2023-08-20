using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calendar
{
    public partial class Calculator : Form
    {
        public Calculator()
        {
            InitializeComponent();
        }

        private void Month_SelectedIndexChanged(object sender, EventArgs e)
        {
            SetDays();
        }

        private void Year_SelectedIndexChanged(object sender, EventArgs e)
        {
            SetDays();
        }

        private bool CheckMonth()
        {
            if (string.Equals(Month.Text, "january", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "february", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "march", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "april", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "may", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "june", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "july", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "august", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "september", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "october", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "november", StringComparison.OrdinalIgnoreCase) ||
                    string.Equals(Month.Text, "december", StringComparison.OrdinalIgnoreCase))
                return true;
            else
                return false;
        }

        private bool CheckMonthInput()
        {
            if (CheckMonth())
                return true;
            else if (Month.Text != "" && !CheckMonth())
            {
                MessageBox.Show("Invalid month input!", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                Month.Text = "";
            }
            return false;
        }

        private bool CheckDayInput()
        {
            try
            {
                if (!(int.Parse(Day.Text) < 1) && !(int.Parse(Day.Text) > 31))
                    return true;
                else
                {
                    MessageBox.Show("Invalid day input!", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    Day.Text = "";
                    return false;
                }
            }
            catch (Exception a)
            {
                String inv = a.Message;
                if (Day.Text != "")
                {
                    MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    Day.Text = "";
                }
                return false;
            }
        }

        private bool CheckYearInput()
        {
            try
            {
                if (!(int.Parse(Year.Text) < 1))
                    return true;
                else
                {
                    MessageBox.Show("Invalid year input!", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    Year.Text = "";
                    return false;
                }
            }
            catch (Exception a)
            {
                String inv = a.Message;
                if (Year.Text != "")
                {
                    MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    Year.Text = "";
                }
                return false;
            }
        }

        private void ChangeDays(int endDay)
        {
            Day.Items.Clear();
            for (int i = 1; i <= endDay; i++)
            {
                if(i < 10)
                    Day.Items.Add("0" + i);
                else
                    Day.Items.Add(i);
            }
            if (int.Parse(Day.Text) > endDay)
                Day.Text = "";
        }

        private void SetDays()
        {
            if (string.Equals(Month.Text, "january", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
            else if (string.Equals(Month.Text, "february", StringComparison.OrdinalIgnoreCase) && Year.Text == "")
                ChangeDays(28);
            else if (string.Equals(Month.Text, "february", StringComparison.OrdinalIgnoreCase) && !CheckYear(Year.Text))
                ChangeDays(28);
            else if (string.Equals(Month.Text, "february", StringComparison.OrdinalIgnoreCase) && CheckYear(Year.Text))
                ChangeDays(29);
            else if (string.Equals(Month.Text, "march", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
            else if (string.Equals(Month.Text, "april", StringComparison.OrdinalIgnoreCase))
                ChangeDays(30);
            else if (string.Equals(Month.Text, "may", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
            else if (string.Equals(Month.Text, "june", StringComparison.OrdinalIgnoreCase))
                ChangeDays(30);
            else if (string.Equals(Month.Text, "july", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
            else if (string.Equals(Month.Text, "august", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
            else if (string.Equals(Month.Text, "september", StringComparison.OrdinalIgnoreCase))
                ChangeDays(30);
            else if (string.Equals(Month.Text, "october", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
            else if (string.Equals(Month.Text, "november", StringComparison.OrdinalIgnoreCase))
                ChangeDays(30);
            else if (string.Equals(Month.Text, "december", StringComparison.OrdinalIgnoreCase))
                ChangeDays(31);
        }

        private bool CheckYear(string tempYear)
        {
            int year = int.Parse(tempYear);
            if (year % 400 == 0)
                return true;
            else if (year % 4 == 0)
                return true;
            else if (year % 100 == 0)
                return false;
            else
                return false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Date OBJ = new Date();
            textBox1.Text = null;
            if (CheckMonthInput() && CheckDayInput() && CheckYearInput())
            {
                OBJ.SetMonth(Month.Text.ToLower());
                OBJ.SetDay(int.Parse(Day.Text));
                OBJ.SetYear(int.Parse(Year.Text));
            }
            textBox1.Text = OBJ.GetAnser();
        }
    }
}
