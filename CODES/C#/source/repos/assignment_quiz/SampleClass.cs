using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace assignment_quiz
{
    public class SampleClass
    {
        private double radius;
        public SampleClass() {}
        public SampleClass(double r) { radius = r; }
        public void Set(double r)
        {
            radius = r;
        }
        public double Area()
        {
            return 3.14 * radius * radius;
        }
        public double Circumference()
        {
            return 2 * 3.14 * radius;
        }

        /*int hour, minute;
         public void SetTime(int h, int m)
        {
            this.hour = h; this.minute = m;
        }

        /*public int x = 10;
        public static int SomeMethodName()
        {
          x = x + 1; 
         return x;
        }

    /*private double length;
    private double width;
    public void SetLength(double length)
    {
        this.length = length;
    }
    public void SetWidth(double width)
    {
        this.width = width;
    }
    public void Set(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double Area()
    {
        return length * width;
    }
    public double Perimeter()
    {
        return 2 + length + 2 + width;
    }*/
}
}
