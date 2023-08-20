using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Midterm_Lab_2___Fractions
{
    public partial class FractionForm : Form
    {
        public FractionForm()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                int numerator1 = int.Parse(Fraction1Numerator.Text);
                int numerator2 = int.Parse(Fraction2Numerator.Text);
                int denominator1 = int.Parse(Fraction1Denominator.Text);
                int denominator2 = int.Parse(Fraction2Denominator.Text);
                string choice = Operation.Text;
                Fraction OBJ = new Fraction(numerator1, numerator2, denominator1, denominator2, choice);
                int tempNumerator = OBJ.GetFinalNumerator();
                int tempDenominator = OBJ.GetFinalDenominator();
                OBJ.Reduce(tempNumerator, tempDenominator);
                AnswerNumerator.Text = OBJ.GetFinalNumerator().ToString();
                AnswerDenominator.Text = OBJ.GetFinalDenominator().ToString();
                AnswerNumerator2.Text = OBJ.GetReducedNumerator().ToString();
                AnswerDenominator2.Text = OBJ.GetReducedDenominator().ToString();
                DecimalAnswer.Text = OBJ.AnswerInDecimalForm().ToString();
            }
            catch (Exception a)
            {
                String inv = a.Message;
                MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }
    }
}
