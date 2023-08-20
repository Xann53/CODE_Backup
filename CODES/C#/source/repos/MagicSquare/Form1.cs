using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MagicSquare
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        void generateSquare(int n)
        {
            int[,] magicSquare = new int[n, n];
            int i = n / 2;
            int j = n - 1;
            string answer = "";
            bool clear = false;
            try
            {
                for (int num = 1; num <= n * n;)
                {
                    if (i == -1 && j == n)
                    {
                        j = n - 2;
                        i = 0;
                    }
                    else
                    {
                        if (j == n)
                            j = 0;

                        if (i < 0)
                            i = n - 1;
                    }

                    if (magicSquare[i, j] != 0)
                    {
                        j -= 2;
                        i++;
                        continue;
                    }
                    else
                        magicSquare[i, j] = num++;

                    j++;
                    i--;
                }
            }
            catch (Exception e)
            {
                String inv = e.Message;
                MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                clear = true;
            }
            if (!clear)
            {
                listBox1.Items.Clear();
                for (i = 0; i < n; i++)
                {
                    answer = "";
                    for (j = 0; j < n; j++)
                    {
                        answer += magicSquare[i, j].ToString() + "      ";
                    }
                    listBox1.Items.Add(answer);
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int n = 0;
            try
            {
                n = int.Parse(textBox1.Text);
            }
            catch (Exception a)
            {
                String inv = a.Message;
                MessageBox.Show(inv, "Invalid", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            listBox1.Items.Clear();
            generateSquare(n);
        }
    }
}
