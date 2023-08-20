using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Monthly_Payments
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void ComputeButton_Click(object sender, EventArgs e)
        {
            try
            {
                decimal pValue = decimal.Parse(PValueInput.Text);
                decimal years = decimal.Parse(NPerList.Text);
                decimal first = decimal.Parse(FirstRateList.Text);
                decimal last = decimal.Parse(LastRateList.Text);
                for (; first <= last; first++) {
                    decimal payment = PMT(first, years, pValue);
                    OutputListBox.Items.Add("..................." + first + ".00%......................." + payment.ToString("0.##") + "...............................");
                }
            }
            catch (Exception a) {}
        }

        public decimal PMT(decimal iRate, decimal nPer, decimal pValue) 
        {
            decimal rate = iRate / 100 / 12;
            decimal nPeriods = nPer * 12;
            decimal payment = rate * (0 + pValue * (decimal)Math.Pow((double)(1 + rate), (double)nPeriods)) / ((decimal)(Math.Pow((double)(1 + rate), (double)(nPeriods)) - 1) * (1 + rate * 1)); ;
            return payment;
        }
    }
}