namespace Depreciation_Calculator
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.ChoiceBox = new System.Windows.Forms.GroupBox();
            this.StraightLineButton = new System.Windows.Forms.RadioButton();
            this.SumOfYearsButton = new System.Windows.Forms.RadioButton();
            this.InitialCostTextBox = new System.Windows.Forms.TextBox();
            this.SalvageValueTextBox = new System.Windows.Forms.TextBox();
            this.listBox1 = new System.Windows.Forms.ListBox();
            this.UpdateButton = new System.Windows.Forms.Button();
            this.ExitButton = new System.Windows.Forms.Button();
            this.YearSelect = new System.Windows.Forms.ComboBox();
            this.ChoiceBox.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(33, 43);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(68, 16);
            this.label1.TabIndex = 0;
            this.label1.Text = "Initial Cost";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(4, 74);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(97, 16);
            this.label2.TabIndex = 1;
            this.label2.Text = "Salvage Value";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(72, 110);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(29, 16);
            this.label3.TabIndex = 2;
            this.label3.Text = "Life";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(72, 136);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(166, 16);
            this.label4.TabIndex = 3;
            this.label4.Text = "Depreciation Schedule";
            // 
            // ChoiceBox
            // 
            this.ChoiceBox.Controls.Add(this.SumOfYearsButton);
            this.ChoiceBox.Controls.Add(this.StraightLineButton);
            this.ChoiceBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ChoiceBox.Location = new System.Drawing.Point(314, 29);
            this.ChoiceBox.Name = "ChoiceBox";
            this.ChoiceBox.Size = new System.Drawing.Size(147, 97);
            this.ChoiceBox.TabIndex = 4;
            this.ChoiceBox.TabStop = false;
            this.ChoiceBox.Text = "Depreciation";
            // 
            // StraightLineButton
            // 
            this.StraightLineButton.AutoSize = true;
            this.StraightLineButton.Location = new System.Drawing.Point(22, 28);
            this.StraightLineButton.Name = "StraightLineButton";
            this.StraightLineButton.Size = new System.Drawing.Size(99, 20);
            this.StraightLineButton.TabIndex = 0;
            this.StraightLineButton.Text = "Straight Line";
            this.StraightLineButton.UseVisualStyleBackColor = true;
            // 
            // SumOfYearsButton
            // 
            this.SumOfYearsButton.AutoSize = true;
            this.SumOfYearsButton.Location = new System.Drawing.Point(22, 61);
            this.SumOfYearsButton.Name = "SumOfYearsButton";
            this.SumOfYearsButton.Size = new System.Drawing.Size(106, 20);
            this.SumOfYearsButton.TabIndex = 1;
            this.SumOfYearsButton.Text = "Sum of Years";
            this.SumOfYearsButton.UseVisualStyleBackColor = true;
            // 
            // InitialCostTextBox
            // 
            this.InitialCostTextBox.Location = new System.Drawing.Point(107, 39);
            this.InitialCostTextBox.Name = "InitialCostTextBox";
            this.InitialCostTextBox.Size = new System.Drawing.Size(179, 20);
            this.InitialCostTextBox.TabIndex = 5;
            // 
            // SalvageValueTextBox
            // 
            this.SalvageValueTextBox.Location = new System.Drawing.Point(107, 73);
            this.SalvageValueTextBox.Name = "SalvageValueTextBox";
            this.SalvageValueTextBox.Size = new System.Drawing.Size(179, 20);
            this.SalvageValueTextBox.TabIndex = 5;
            // 
            // listBox1
            // 
            this.listBox1.FormattingEnabled = true;
            this.listBox1.Location = new System.Drawing.Point(12, 164);
            this.listBox1.Name = "listBox1";
            this.listBox1.Size = new System.Drawing.Size(290, 121);
            this.listBox1.TabIndex = 6;
            // 
            // UpdateButton
            // 
            this.UpdateButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.UpdateButton.Location = new System.Drawing.Point(318, 164);
            this.UpdateButton.Name = "UpdateButton";
            this.UpdateButton.Size = new System.Drawing.Size(143, 29);
            this.UpdateButton.TabIndex = 7;
            this.UpdateButton.Text = "Update Schedule";
            this.UpdateButton.UseVisualStyleBackColor = true;
            this.UpdateButton.Click += new System.EventHandler(this.UpdateButton_Click);
            // 
            // ExitButton
            // 
            this.ExitButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ExitButton.Location = new System.Drawing.Point(318, 199);
            this.ExitButton.Name = "ExitButton";
            this.ExitButton.Size = new System.Drawing.Size(143, 29);
            this.ExitButton.TabIndex = 7;
            this.ExitButton.Text = "Exit";
            this.ExitButton.UseVisualStyleBackColor = true;
            this.ExitButton.Click += new System.EventHandler(this.ExitButton_Click);
            // 
            // YearSelect
            // 
            this.YearSelect.FormattingEnabled = true;
            this.YearSelect.Items.AddRange(new object[] {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31",
            "32",
            "33",
            "34",
            "35",
            "36",
            "37",
            "38",
            "39",
            "40",
            "41",
            "42",
            "43",
            "44",
            "45",
            "46",
            "47",
            "48",
            "49",
            "50",
            "51",
            "52",
            "53",
            "54",
            "55",
            "56",
            "57",
            "58",
            "59",
            "60"});
            this.YearSelect.Location = new System.Drawing.Point(107, 105);
            this.YearSelect.Name = "YearSelect";
            this.YearSelect.Size = new System.Drawing.Size(42, 21);
            this.YearSelect.TabIndex = 8;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(470, 302);
            this.ControlBox = false;
            this.Controls.Add(this.YearSelect);
            this.Controls.Add(this.ExitButton);
            this.Controls.Add(this.UpdateButton);
            this.Controls.Add(this.listBox1);
            this.Controls.Add(this.SalvageValueTextBox);
            this.Controls.Add(this.InitialCostTextBox);
            this.Controls.Add(this.ChoiceBox);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Depreciation Calculator";
            this.ChoiceBox.ResumeLayout(false);
            this.ChoiceBox.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.GroupBox ChoiceBox;
        private System.Windows.Forms.RadioButton SumOfYearsButton;
        private System.Windows.Forms.RadioButton StraightLineButton;
        private System.Windows.Forms.TextBox InitialCostTextBox;
        private System.Windows.Forms.TextBox SalvageValueTextBox;
        private System.Windows.Forms.ListBox listBox1;
        private System.Windows.Forms.Button UpdateButton;
        private System.Windows.Forms.Button ExitButton;
        private System.Windows.Forms.ComboBox YearSelect;
    }
}

