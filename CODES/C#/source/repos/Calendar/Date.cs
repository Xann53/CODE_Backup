using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calendar
{
    class Date
    {
        private string currentMonth;
        private int currentDay;
        private int currentYear;
        private int currentMonthNum;
        private string nextMonth;
        private int nextDay;
        private int nextYear;
        private int nextMonthNum;

        public Date()
        {
            this.currentMonth = null;
            this.currentDay = 0;
            this.currentYear = 0;
            this.nextMonth = null;
            this.nextDay = 0;
            this.nextYear = 0;
            this.currentMonthNum = 0;
        }

        public Date(string month, int day, int year)
        {
            this.currentMonth = month;
            this.currentDay = day;
            this.currentYear = year;
            MonthToNumber();
        }

        public void MonthToNumber()
        {
            if (currentMonth == "january")
                this.currentMonthNum = 1;
            else if (currentMonth == "february")
                this.currentMonthNum = 2;
            else if (currentMonth == "march")
                this.currentMonthNum = 3;
            else if (currentMonth == "april")
                this.currentMonthNum = 4;
            else if (currentMonth == "may")
                this.currentMonthNum = 5;
            else if (currentMonth == "june")
                this.currentMonthNum = 6;
            else if (currentMonth == "july")
                this.currentMonthNum = 7;
            else if (currentMonth == "august")
                this.currentMonthNum = 8;
            else if (currentMonth == "september")
                this.currentMonthNum = 9;
            else if (currentMonth == "october")
                this.currentMonthNum = 10;
            else if (currentMonth == "november")
                this.currentMonthNum = 11;
            else if (currentMonth == "december")
                this.currentMonthNum = 12;
        }

        public void SetMonth(string month)
        {
            this.currentMonth = month;
            MonthToNumber();
        }

        public void SetDay(int day)
        {
            this.currentDay = day;
        }

        public void SetYear(int year)
        {
            this.currentYear = year;
        }

        public string GetMonth()
        {
            return nextMonth;
        }

        public int GetDay()
        {
            return nextDay;
        }

        public int GetYear()
        {
            return nextYear;
        }

        private bool CheckYear()
        {
            int year = currentYear;
            if (year % 400 == 0)
                return true;
            else if (year % 4 == 0)
                return true;
            else if (year % 100 == 0)
                return false;
            else
                return false;
        }

        public void NumberToMonth()
        {
            if (nextMonthNum == 1)
                this.nextMonth = "JANUARY";
            else if (nextMonthNum == 2)
                this.nextMonth = "FEBRUARY";
            else if (nextMonthNum == 3)
                this.nextMonth = "MARCH";
            else if (nextMonthNum == 4)
                this.nextMonth = "APRIL";
            else if (nextMonthNum == 5)
                this.nextMonth = "MAY";
            else if (nextMonthNum == 6)
                this.nextMonth = "JUNE";
            else if (nextMonthNum == 7)
                this.nextMonth = "JULY";
            else if (nextMonthNum == 8)
                this.nextMonth = "AUGUST";
            else if (nextMonthNum == 9)
                this.nextMonth = "SEPTEMBER";
            else if (nextMonthNum == 10)
                this.nextMonth = "OCTOBER";
            else if (nextMonthNum == 11)
                this.nextMonth = "NOVEMBER";
            else if (nextMonthNum == 12)
                this.nextMonth = "DECEMBER";
        }

        public string GetAnser()
        {
            NextDay();
            NumberToMonth();
            string answer = nextMonth + " " + nextDay.ToString() + ", " + nextYear.ToString();
            return answer;
        }

        public void CheckIfNxtYear()
        {
            if (nextMonthNum > 12)
            {
                nextMonthNum = 1;
                nextYear = currentYear + 1;
            }
            else
                nextYear = currentYear;
        }

        public void NextDay()
        {
            nextDay = currentDay + 1;
            if (currentMonthNum == 1 || currentMonthNum == 3 || currentMonthNum == 5 || currentMonthNum == 7 ||
                currentMonthNum == 8 || currentMonthNum == 10 || currentMonthNum == 12)
            {
                if (nextDay > 31)
                {
                    nextDay = 1;
                    nextMonthNum = currentMonthNum + 1;
                    CheckIfNxtYear();
                }
                else
                {
                    nextMonthNum = currentMonthNum;
                    nextYear = currentYear;
                }
            }
            else if (currentMonthNum == 4 || currentMonthNum == 6 || currentMonthNum == 9 || currentMonthNum == 11)
            {
                if (nextDay > 30)
                {
                    nextDay = 1;
                    nextMonthNum = currentMonthNum + 1;
                    CheckIfNxtYear();
                }
                else
                {
                    nextMonthNum = currentMonthNum;
                    nextYear = currentYear;
                }
            }
            else if (currentMonthNum == 2)
            {
                if (CheckYear())
                {
                    if (nextDay > 29)
                    {
                        nextDay = 1;
                        nextMonthNum = currentMonthNum + 1;
                        CheckIfNxtYear();
                    }
                    else
                    {
                        nextMonthNum = currentMonthNum;
                        nextYear = currentYear;
                    }
                }
                else if (!CheckYear())
                {
                    if (nextDay > 28)
                    {
                        nextDay = 1;
                        nextMonthNum = currentMonthNum + 1;
                        CheckIfNxtYear();
                    }
                    else
                    {
                        nextMonthNum = currentMonthNum;
                        nextYear = currentYear;
                    }
                }
            }
        }
    }
}
