using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Midterm_Lab_2___Fractions
{
    class Fraction
    {
        private int fraction1Numerator, fraction2Numerator, fraction1Denominator, fraction2Denominator, finalNumerator, finalDenominator;
        private int reducedNumerator, reducedDenominator;

        public Fraction()
        {
            this.fraction1Numerator = 0;
            this.fraction2Numerator = 0;
            this.fraction1Denominator = 0;
            this.fraction2Denominator = 0;
        }
        public Fraction(int numerator1, int numerator2, int denominator1, int denominator2, string choice)
        {
            this.fraction1Numerator = numerator1;
            this.fraction2Numerator = numerator2;
            this.fraction1Denominator = denominator1;
            this.fraction2Denominator = denominator2;
            switch (choice)
            {
                case "+":
                    Addition();
                    break;
                case "-":
                    Subtraction();
                    break;
                case "*":
                    Multiplication();
                    break;
                case "/":
                    Division();
                    break;
            }
        }
        public int LCD()
        {
            int leastCommonDenominator = 0;
            int tempDenominator1 = fraction1Denominator * 1, tempDenominator2 = fraction2Denominator * 1;
            while (leastCommonDenominator == 0)
            {
                if (tempDenominator1 == tempDenominator2)
                    leastCommonDenominator = tempDenominator1;
                else if (tempDenominator1 < tempDenominator2)
                    tempDenominator1 += fraction1Denominator;
                else if (tempDenominator1 > tempDenominator2)
                    tempDenominator2 += fraction2Denominator;
            }
            return leastCommonDenominator;
        }
        public void Addition()
        {
            int lcd = LCD();
            int tempNumerator1 = (lcd / fraction1Denominator) * fraction1Numerator;
            int tempNumerator2 = (lcd / fraction2Denominator) * fraction2Numerator;
            finalNumerator = tempNumerator1 + tempNumerator2;
            finalDenominator = lcd;
        }
        public void Subtraction()
        {
            int lcd = LCD();
            int tempNumerator1 = (lcd / fraction1Denominator) * fraction1Numerator;
            int tempNumerator2 = (lcd / fraction2Denominator) * fraction2Numerator;
            finalNumerator = tempNumerator1 - tempNumerator2;
            finalDenominator = lcd;
        }
        public void Multiplication()
        {
            finalNumerator = fraction1Numerator * fraction2Numerator;
            finalDenominator = fraction1Denominator * fraction2Denominator;
        }
        public void Division()
        {
            finalNumerator = fraction1Numerator * fraction2Denominator;
            finalDenominator = fraction1Denominator * fraction2Numerator;
        }
        public int GetFinalNumerator()
        {
            return finalNumerator;
        }
        public int GetFinalDenominator()
        {
            return finalDenominator;
        }
        public int GetReducedNumerator()
        {
            return reducedNumerator;
        }
        public int GetReducedDenominator()
        {
            return reducedDenominator;
        }
        public float AnswerInDecimalForm()
        {
            float temp1 = GetFinalNumerator();
            float temp2 = GetFinalDenominator();
            float tempDecimalAnswer = temp1 / temp2;
            return tempDecimalAnswer;
        }
        public int gcd(int answerNumerator, int answerDenominator)
        {
            int x = Math.Abs(answerNumerator);
            int y = Math.Abs(answerDenominator);
            int m;
            if (x > y)
                m = y;
            else
                m = x;
            for (int i = m; i >= 1; i--)
            {
                if (x % i == 0 && y % i == 0)
                {
                    return i;
                }
            }

            return 1;
        }

        public void Reduce(int answerNumerator, int answerDenominator)
        {
            try
            {
                int gcdNum = gcd(answerNumerator, answerDenominator);
                if (gcdNum != 0)
                {
                    answerNumerator = answerNumerator / gcdNum;
                    answerDenominator = answerDenominator / gcdNum;
                }

                if (answerDenominator < 0)
                {
                    answerDenominator = answerDenominator * -1;
                    answerNumerator = answerNumerator * -1;
                }
            }
            catch (Exception exp)
            {
                throw new InvalidOperationException("Cannot reduce Fraction: " + exp.Message);
            }
            reducedNumerator = answerNumerator; 
            reducedDenominator = answerDenominator;
        }
    }
}
