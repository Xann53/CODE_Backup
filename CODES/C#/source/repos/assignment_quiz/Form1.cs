using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace assignment_quiz
{
    public partial class Form1 : Form
    {
        String answer;
        public Form1()
        {
            InitializeComponent();
        }

        public void displayAnswer()
        {
            MessageBox.Show(answer);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            answer = "";

            double[,] values = {{ 1.2, 9.0, 3.2, -1.8 }, { 9.2, 0.5, 1.5, -1.2}, { 7.3, 7.9, 4.8,-6.9}};
            double val = values.GetUpperBound(0);
            MessageBox.Show(val.ToString());

            /*double[][] things = { new double[3]{1.2, 9.0,7.2},
                                new double[4] {9.2, 0.5,6.1, 5.0},
                                new double [2] { 7.9, 3.9 } };
            MessageBox.Show(things[2].Length.ToString());

            /*int[] arr = new int[] { 1, 2, 3, 4, 5 };
             fun(ref arr);

             /*string str = "";
             int i;
             int[] anArray = new int[5];
             for (i = 0; i < anArray.Length; i++)
                 anArray[i] = 2 * i;
             for (i = 0; i < anArray.Length; i++)
                 str = str + anArray[i] + " ";
             MessageBox.Show(str.ToString());

             /*int[][] a = new int[2][];
             a[0] = new int[4] { 6, 1, 4, 3 };
             a[1] = new int[3] { 9, 2, 7 };
             foreach (int[] i in a)
             {
                 foreach (int j in i)
                     listBox1.Items.Add(j);
             }

             /*string str = "";
             int[] myArray = { 4, 10, 19, 7, 5};
             DoIt(myArray);
             for (int j = 0; j < myArray.Length; j++)
                 str += myArray[j] + " ";
             MessageBox.Show(str);

             /*int[][] a = new int[2][];
             a[0] = new int[4] { 6, 1, 4, 3 };
             a[1] = new int[3] { 9, 2, 7 };
             MessageBox.Show(a[1].GetUpperBound(0).ToString());

             /*string str = "";
             int i, j;
             int[,] arr = new int[2, 2];
             for (i = 0; i < 2; ++i)
             {
                 for (j = 0; j < 2; ++j)
                 {
                     arr[i, j] = 1 * 17 + 1 * 17;
                     str += arr[i, j] + " ";
                 }
             }
             MessageBox.Show(str);

             /*string str = "";
             int[] myArray = { 1, 2, 3, 4, 5 };
             DoIt(myArray);
             for (int j = 0; j < myArray.Length; j++)
                 str = str + myArray[j] + "";
             MessageBox.Show(str);

             /*int[,,] a = new int[3, 2, 3];
             textBox1.Text = a.Length.ToString();

             /*String m = "20";
             SampleClass myCircle = new SampleClass();
             myCircle.Set(Double.Parse(m));
             answer = myCircle.Area().ToString();
             displayAnswer();

             /*String m = "20";
             SampleClass hisCircle = new SampleClass();
             double r = Convert.ToDouble(m);
             hisCircle.Set(r);
             answer = hisCircle.Area().ToString();
             displayAnswer();

             /*String m = "20";
             double rad = Double.Parse(m);
             SampleClass theirCircle = new SampleClass(rad);
             answer = theirCircle.Area().ToString();
             displayAnswer();

             /*SampleClass obj = new SampleClass();
             int n = obj.SomeMethodName();

             /*SampleClass yourTime = new SampleClass();
             yourTime.SetTime(12, 30);
             SampleClass theirTime = new SampleClass();
             theirTime.SetTime(5, 10);

             /*SampleClass rectangle3 = new SampleClass();
             rectangle3.Set(5, 2.3);

             /*answer = x(3).ToString();
             displayAnswer();

             /*int i, s = 0;
             for (i = 0; i < 5; i++)
             {
                 s = 3 + s * i;
                 MessageBox.Show(s.ToString());
             }

             /*int val;
             string result = " ", str = "";
             for (val = -3; val <= 3; val++)
             {
                 switch (val)
                 {
                     case 0:
                         str = str + " Sharp";
                         break;
                 }
                 result = (val > 0) ? "C" : (val < 0) ? "U" : "";
                 result = result + " " + str;
             }
             answer = result;
             displayAnswer();

                     /*for (int iCounter = 5; iCounter <= 1; iCounter += 1)
                     {
                         answer = iCounter.ToString();
                         displayAnswer();
                     }

                     /*int i = 0;
                     string str = "";
                     for (i = 0; i < 20; i++)
                     {
                         switch (i)
                         {
                             case 0:
                                 i += 5;
                                 break;
                             case 1:
                                 i += 2;
                                 break;
                             case 5:
                                 i += 5;
                                 break;
                             default:
                                 i += 4;
                                 break;
                         }
                             str = str + " " + i;
                     }
                     answer = str;
                     displayAnswer();

                             /*string str = "";
                             int i = 10;
                             for (; ; )
                             {
                                 str = str + " " + i;

                                 if (i > -10)
                                     i -= 4;
                                 else
                                     break;
                             }
                             answer = str; ;
                             displayAnswer();

                             /*answer = foo(123, 10).ToString();
                             displayAnswer();

                             /*char ch = Convert.ToChar('a' | 'b' | 'c') ;
                             switch (ch)
                             {
                                 case 'A':
                                 case 'a':
                                     MessageBox.Show("case A | case a");
                                     break;
                                 case 'B':
                                 case 'b':
                                     MessageBox.Show("case B | case b");
                                     break;
                                 case 'C': case 'c':
                                 case 'D': case 'd':
                                     MessageBox.Show("case D | case d");
                                     break;
                             }

                             /*int j, i = 5;
                             fun5(ref i);
                             fun6(out j);
                             answer = i.ToString() + "," + j.ToString();
                             displayAnswer();

                             //Method2(5);

                             /*int i;
                             answer += fun4(out i);
                             displayAnswer();

                             /*int n = 345, r = 10;
                             answer += Method(n, r);
                             displayAnswer();

                             /*int a = 5;
                             int s = 0, c = 0;
                             Procedure(a, ref s, ref c);
                             answer += s.ToString() + " " + c.ToString();
                             displayAnswer();

                             //DoSomething(10.0,20.0,30.1);

                            /* object k = 4.0;
                             answer += k;
                             displayAnswer();

                             /*object o = new object[] { "1", 4.0, "Eivan", 'B' };
                             Fun(o);
                             displayAnswer();

                             /*int n = 20;
                             Func(n);
                             displayAnswer();

                             /*int x = 4, y = 3;
                             int temp = recFun(x, y);
                             answer += temp;
                             displayAnswer();

                             /*int num = 2;
                             func1(num);
                             answer = answer + "\n" + num;
                             func2(ref num);
                             answer = answer + "\n" + num;
                             displayAnswer();
                             */
        }

        //------------------------------------------------------------------------------------------------------------------------------------------------------

        /*public static void fun(ref int[] a)
        {
            string str = "";
            for (int i = 0; i < a.Length; i++)
            {
                a[i] = a[i] * 5;
                str = str + a[i] + " ";
            }
            MessageBox.Show(str);
        }

        public void DoIt(int[] z)
        {
            z[0] = z[z.Length - 1];
        }
        
        /*private bool x(int n)
        {
            int i;
            for (i = 2; i <= n - 1; i++)
            {
                if (n % i == 0)
                    break;
            }
            if (i == n)
                return true;
                return false;
        }

        /*public static int foo(int n, int r)
        {
            if (n > 0) 
                return (n % r + foo(n / r, r));
            else
                return 0;     
        }

        /*public void DoSomething(params double[] item)
        { }*/

        /*public static int Fun(int x, int y)
        {
            return (y == 0) 20 : x + Fun(x, y - 1);
        }
        public static int Fun2(int a, int b)
        {
            if (b == 0) return 1; else return Fun(a, Fun2(a, b - 1));
        }

        /*public static void fun5(ref int x)
        {
            x = x * x;
        }
        public static void fun6(out int x)
        {
            x = 6;
            x = x * x;
        }

        public static void Method2(int n)
        {
            string str = " ";
            int i = 0;
            if (n > 1)
                Method2(n - 1);
            for (i = 0; i < n; i++)
                str += "*";
            MessageBox.Show(str);
        }

        public static int fun4(out int i)
        {
            int s = 1;
            i = 5;

            for (int j = 1; j <= i; j++)
                s = s * j;
            
            return s;
        }

        public static int Method(int n, int r)
        {
            if (n > 0)
                return (n % r + Method(n / r, r));
            else
                return 0;
        }

        public static void Procedure(int x, ref int ss, ref int cc)
        {
            ss = x * x;
            cc = x * x * x;
        }

        public void Fun(params object[] obj)
        {
            for (int i = 0; i < obj.Length - 1; i++)
                answer += "\n" + obj[i].ToString();
        }

        public void Func(int n)
        {
            if (n > 100)
                return;
            answer += "\n" + n;
            Func(2 * n);
            answer += "\n" + n;
        }

        private static int recFun(int x, int y)
        {
            return (x == 0) ? y : recFun(x - 1, x + y);
        }

        public void func1(int num)
        {
            num = num + 10;
            answer = answer + "\n" + num;
        }

        public void func2(ref int num)
        {
            num = num + 10;
            answer = answer + "\n" + num;
        }*/
    }
}
