using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentGrades
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();

            const int NUM_STUDS = 100; // number of students
            bool[] failing = new bool[NUM_STUDS];
            bool[] passing = new bool[NUM_STUDS];
            int[] score = new int[NUM_STUDS];
            int grade, passed, failed;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
        }

        public void Components(bool[] passing, bool[] failing, int index, int score)
        {
            if (score < 60)
            {
                failing[index] = true;
                passing[index] = false;
            }
            else
            {
                failing[index] = false;
                passing[index] = true;
            }
        }

        public void PassTally(bool[] passing, int passed, int failed)
        {
            passed = 0; failed = 0;
            for (int i = 0; i < passing.Length; i++)
            {
                if (passing[i] == true)
                    passed++;
                else
                    failed++;
            }
        }

        public bool Error(bool[] passing, bool[] failing)
        {
            for (int i = 0; i < passing.Length; i++)
            {
                if (passing[i] == failing[i])
                    return true;
            }
            return false;
        }

        public int HowMany(int[] score, int grade)
        {
            int counter = 0;
            for (int i = 0; i < score.Length; i++)
            {
                if (score[i] >= grade)
                    counter++;
            }
            return counter;
        }

        public void Reversed(ref int[] score)
        {
            int[] reverseScore = new int[score.Length];
            for (int i = score.Length; i >= 0; i--)
            {
                reverseScore[score.Length - i - 1] = score[i];
            }
            score = reverseScore;
        }
    }
}
