using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Depreciation_Calculator
{
    public partial class Form1 : Form
    {
        private Boolean Validation = true;
        private decimal InAmount = 0, SalvAmount = 0, DepreciationExp = 0, BookVal = 0;
        private int LifeYear = 0;
        private decimal[] DepreciationExpArr;
        String ListFormat = "{0, -15}{1, -30}{2, -30}";
        String ListFormat2 = "{0, -18}{1, -34}{2, -30}";
        String ListFormat3 = "{0, -17}{1, -34}{2, -30}";

        public Form1()
        {
            InitializeComponent();
            listBox1.Items.Add(String.Format(ListFormat, "Year", "Depreciation", "Book Value"));
        }

        public void getAmount()
        {
            try
            {
                InAmount = decimal.Parse(InitialCostTextBox.Text);
                SalvAmount = decimal.Parse(SalvageValueTextBox.Text);
                LifeYear = int.Parse(YearSelect.Text);
                Validation = true;
            }
            catch (Exception a)
            {
                String inv = a.Message;
                MessageBox.Show(inv + "\nPlease use numerical digits only.", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                Validation = false;
            }
        }

        private void UpdateButton_Click(object sender, EventArgs e)
        {
            Boolean noAmount = false;
            if (InitialCostTextBox.Text == "" || SalvageValueTextBox.Text == "" || YearSelect.Text == "")
            {
                MessageBox.Show("Invalid. Lacking Input for (Initial Cost, Salvage Value, or Life)", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                noAmount = true;
            }
            else
                getAmount();

            if (Validation)
            {
                if (StraightLineButton.Checked)
                {
                    clear();
                    StraightLine();
                }
                else if (SumOfYearsButton.Checked)
                {
                    clear();
                    SumOfYears();
                }
                else if (!noAmount)
                    MessageBox.Show("You must choose depreciation option", "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        public void clear()
        {
            InitialCostTextBox.Clear();
            SalvageValueTextBox.Clear();
            YearSelect.Text = null;
            StraightLineButton.Checked = false;
            SumOfYearsButton.Checked = false;
            listBox1.Items.Clear();
            listBox1.Items.Add(String.Format(ListFormat, "Year", "Depreciation", "Book Value"));
        }

        public void StraightLine()
        {
            DepreciationExp = (InAmount - SalvAmount) / LifeYear;
            BookVal = InAmount;
            for (int i = 0; i < LifeYear; i++)
            {
                BookVal -= DepreciationExp;
                if(i+1 < 10)
                    listBox1.Items.Add(String.Format(ListFormat2, i+1, "$" + Math.Round(DepreciationExp, 2), "$" + Math.Round(BookVal, 2)));
                else
                    listBox1.Items.Add(String.Format(ListFormat3, i + 1, "$" + Math.Round(DepreciationExp, 2), "$" + Math.Round(BookVal, 2)));
            }
        }

        public void SumOfYears()
        {
            int tempYear = LifeYear;
            int SumYears = (LifeYear * (LifeYear + 1)) / 2;
            decimal BookValStrt = InAmount - SalvAmount;
            BookVal = InAmount;
            DepreciationExpArr = new decimal[LifeYear];
            for (int i = 0; i < LifeYear; i++)
            {
                decimal temp = (BookValStrt * tempYear) / SumYears;
                DepreciationExpArr[i] = temp;
                tempYear--;
            }
            for(int i = 0; i < LifeYear; i++)
            {
                BookVal -= DepreciationExpArr[i];
                if (i + 1 < 10)
                    listBox1.Items.Add(String.Format(ListFormat2, i + 1, "$" + Math.Round(DepreciationExpArr[i], 2), "$" + Math.Round(BookVal, 2)));
                else
                    listBox1.Items.Add(String.Format(ListFormat3, i + 1, "$" + Math.Round(DepreciationExpArr[i], 2), "$" + Math.Round(BookVal, 2)));
            }
        }

        private void ExitButton_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Are you sure you want to exit application?", "Exit message", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
