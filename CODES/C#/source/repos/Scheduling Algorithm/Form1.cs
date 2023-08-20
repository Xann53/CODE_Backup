using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Scheduling_Algorithm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void LoadButton_Click(object sender, EventArgs e)
        {
            this.GanttChart.Series["Process"].Points.AddXY("Max", 3);


            /*this.GanttChart.Series["Process"].Points.Add(5);
            this.GanttChart.Series["Process"].Points[1].Color = Color.Green;
            this.GanttChart.Series["Process"].Points[1].AxisLabel = "Max";
            this.GanttChart.Series["Process"].Points[1].LegendText = "Max";
            this.GanttChart.Series["Process"].Points[1].Label = "5";*/
        }
    }
}
