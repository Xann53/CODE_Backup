using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VBAutoCenter
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        private double accessories = 0;
        private double finish = 0;

        private double carSalesPrice;
        private double tradeInAllowance;

        private double addOns;
        private double subTotal;
        private double salesTax;
        private double total;
        private double amountDue;

        protected void calculateButton_Click(object sender, EventArgs e)
        {
            try
            {
                CheckBoxInput();
                RadioBoxInput();
                TextBoxInput();

                addOns = accessories + finish;
                subTotal = addOns + carSalesPrice;
                salesTax = 0.08 * subTotal;
                total = salesTax + subTotal;
                amountDue = total - tradeInAllowance;

                ClearOutputOnly();
                TextBoxOutput();
            }
            catch (Exception a)
            {
                ClearEverything();
                accAndFinTextBox.Text = "Invalid Input!";
                subTotalTextBox.Text = "Invalid Input!";
                salesTaxTextBox.Text = "Invalid Input!";
                totalTextBox.Text = "Invalid Input!";
                amountOrDueTextBox.Text = "Invalid Input!";
            }
        }
        protected void CheckBoxInput()
        {
            if (checkBox1.Checked == true)
                accessories += 425.76;
            if (checkBox2.Checked == true)
                accessories += 987.41;
            if (checkBox3.Checked == true)
                accessories += 1741.23;
        }
        protected void RadioBoxInput()
        {
            if (radioButton1.Checked == true)
                finish += 0;
            else if (radioButton2.Checked == true)
                finish += 345.72;
            else if (radioButton3.Checked == true)
                finish += 599.99;
        }
        protected void TextBoxInput()
        {
            carSalesPrice = double.Parse(carSalesTextBox.Text);
            tradeInAllowance = double.Parse(tradeInTextBox.Text);
        }
        protected void TextBoxOutput()
        {
            accAndFinTextBox.Text = addOns.ToString();
            subTotalTextBox.Text = subTotal.ToString();
            salesTaxTextBox.Text = salesTax.ToString();
            totalTextBox.Text = total.ToString();
            amountOrDueTextBox.Text = amountDue.ToString();
        }
        protected void clearButton_Click(object sender, EventArgs e)
        {
            ClearEverything();
        }
        protected void ClearEverything()
        {
            checkBox1.Checked = false;
            checkBox2.Checked = false;
            checkBox3.Checked = false;
            radioButton1.Checked = false;
            radioButton2.Checked = false;
            radioButton3.Checked = false;
            carSalesTextBox.Text = null;
            tradeInTextBox.Text = null;
            accAndFinTextBox.Text = null;
            subTotalTextBox.Text = null;
            salesTaxTextBox.Text = null;
            totalTextBox.Text = null;
            amountOrDueTextBox.Text = null;
        }
        protected void ClearOutputOnly()
        {
            accAndFinTextBox.Text = null;
            subTotalTextBox.Text = null;
            salesTaxTextBox.Text = null;
            totalTextBox.Text = null;
            amountOrDueTextBox.Text = null;
        }
    }
}