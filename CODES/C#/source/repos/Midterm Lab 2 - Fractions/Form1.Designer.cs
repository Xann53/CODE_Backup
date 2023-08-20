namespace Midterm_Lab_2___Fractions
{
    partial class FractionForm
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
            this.Fraction1Numerator = new System.Windows.Forms.TextBox();
            this.Fraction1Denominator = new System.Windows.Forms.TextBox();
            this.Fraction2Denominator = new System.Windows.Forms.TextBox();
            this.Fraction2Numerator = new System.Windows.Forms.TextBox();
            this.barline1 = new System.Windows.Forms.Label();
            this.barline2 = new System.Windows.Forms.Label();
            this.Operation = new System.Windows.Forms.ComboBox();
            this.equalsSign = new System.Windows.Forms.Label();
            this.barline3 = new System.Windows.Forms.Label();
            this.AnswerDenominator = new System.Windows.Forms.TextBox();
            this.AnswerNumerator = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.DecimalAnswer = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.barline4 = new System.Windows.Forms.Label();
            this.AnswerDenominator2 = new System.Windows.Forms.TextBox();
            this.AnswerNumerator2 = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Fraction1Numerator
            // 
            this.Fraction1Numerator.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Fraction1Numerator.Location = new System.Drawing.Point(12, 36);
            this.Fraction1Numerator.Name = "Fraction1Numerator";
            this.Fraction1Numerator.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.Fraction1Numerator.Size = new System.Drawing.Size(55, 26);
            this.Fraction1Numerator.TabIndex = 0;
            // 
            // Fraction1Denominator
            // 
            this.Fraction1Denominator.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Fraction1Denominator.Location = new System.Drawing.Point(12, 101);
            this.Fraction1Denominator.Name = "Fraction1Denominator";
            this.Fraction1Denominator.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.Fraction1Denominator.Size = new System.Drawing.Size(55, 26);
            this.Fraction1Denominator.TabIndex = 1;
            // 
            // Fraction2Denominator
            // 
            this.Fraction2Denominator.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Fraction2Denominator.Location = new System.Drawing.Point(145, 101);
            this.Fraction2Denominator.Name = "Fraction2Denominator";
            this.Fraction2Denominator.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.Fraction2Denominator.Size = new System.Drawing.Size(55, 26);
            this.Fraction2Denominator.TabIndex = 3;
            // 
            // Fraction2Numerator
            // 
            this.Fraction2Numerator.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Fraction2Numerator.Location = new System.Drawing.Point(145, 36);
            this.Fraction2Numerator.Name = "Fraction2Numerator";
            this.Fraction2Numerator.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.Fraction2Numerator.Size = new System.Drawing.Size(55, 26);
            this.Fraction2Numerator.TabIndex = 2;
            // 
            // barline1
            // 
            this.barline1.AutoSize = true;
            this.barline1.Font = new System.Drawing.Font("Wide Latin", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.barline1.Location = new System.Drawing.Point(8, 65);
            this.barline1.Name = "barline1";
            this.barline1.Size = new System.Drawing.Size(63, 19);
            this.barline1.TabIndex = 4;
            this.barline1.Text = "______";
            // 
            // barline2
            // 
            this.barline2.AutoSize = true;
            this.barline2.Font = new System.Drawing.Font("Wide Latin", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.barline2.Location = new System.Drawing.Point(141, 65);
            this.barline2.Name = "barline2";
            this.barline2.Size = new System.Drawing.Size(63, 19);
            this.barline2.TabIndex = 5;
            this.barline2.Text = "______";
            // 
            // Operation
            // 
            this.Operation.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Operation.FormattingEnabled = true;
            this.Operation.Items.AddRange(new object[] {
            "+",
            "-",
            "*",
            "/"});
            this.Operation.Location = new System.Drawing.Point(88, 70);
            this.Operation.Name = "Operation";
            this.Operation.Size = new System.Drawing.Size(37, 33);
            this.Operation.TabIndex = 6;
            // 
            // equalsSign
            // 
            this.equalsSign.AutoSize = true;
            this.equalsSign.Font = new System.Drawing.Font("Wide Latin", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.equalsSign.Location = new System.Drawing.Point(224, 70);
            this.equalsSign.Name = "equalsSign";
            this.equalsSign.Size = new System.Drawing.Size(21, 23);
            this.equalsSign.TabIndex = 7;
            this.equalsSign.Text = "=";
            // 
            // barline3
            // 
            this.barline3.AutoSize = true;
            this.barline3.Font = new System.Drawing.Font("Wide Latin", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.barline3.Location = new System.Drawing.Point(266, 65);
            this.barline3.Name = "barline3";
            this.barline3.Size = new System.Drawing.Size(63, 19);
            this.barline3.TabIndex = 10;
            this.barline3.Text = "______";
            // 
            // AnswerDenominator
            // 
            this.AnswerDenominator.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.AnswerDenominator.Location = new System.Drawing.Point(270, 101);
            this.AnswerDenominator.Name = "AnswerDenominator";
            this.AnswerDenominator.ReadOnly = true;
            this.AnswerDenominator.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.AnswerDenominator.Size = new System.Drawing.Size(55, 26);
            this.AnswerDenominator.TabIndex = 9;
            // 
            // AnswerNumerator
            // 
            this.AnswerNumerator.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.AnswerNumerator.Location = new System.Drawing.Point(270, 36);
            this.AnswerNumerator.Name = "AnswerNumerator";
            this.AnswerNumerator.ReadOnly = true;
            this.AnswerNumerator.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.AnswerNumerator.Size = new System.Drawing.Size(55, 26);
            this.AnswerNumerator.TabIndex = 8;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(335, 70);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(23, 20);
            this.label1.TabIndex = 11;
            this.label1.Text = "or";
            // 
            // DecimalAnswer
            // 
            this.DecimalAnswer.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.DecimalAnswer.Location = new System.Drawing.Point(474, 65);
            this.DecimalAnswer.Name = "DecimalAnswer";
            this.DecimalAnswer.ReadOnly = true;
            this.DecimalAnswer.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.DecimalAnswer.Size = new System.Drawing.Size(135, 26);
            this.DecimalAnswer.TabIndex = 12;
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.DodgerBlue;
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.button1.Location = new System.Drawing.Point(494, 128);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(115, 36);
            this.button1.TabIndex = 13;
            this.button1.Text = "CALCULATE";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(435, 70);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(23, 20);
            this.label2.TabIndex = 17;
            this.label2.Text = "or";
            // 
            // barline4
            // 
            this.barline4.AutoSize = true;
            this.barline4.Font = new System.Drawing.Font("Wide Latin", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.barline4.Location = new System.Drawing.Point(366, 65);
            this.barline4.Name = "barline4";
            this.barline4.Size = new System.Drawing.Size(63, 19);
            this.barline4.TabIndex = 16;
            this.barline4.Text = "______";
            // 
            // AnswerDenominator2
            // 
            this.AnswerDenominator2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.AnswerDenominator2.Location = new System.Drawing.Point(370, 101);
            this.AnswerDenominator2.Name = "AnswerDenominator2";
            this.AnswerDenominator2.ReadOnly = true;
            this.AnswerDenominator2.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.AnswerDenominator2.Size = new System.Drawing.Size(55, 26);
            this.AnswerDenominator2.TabIndex = 15;
            // 
            // AnswerNumerator2
            // 
            this.AnswerNumerator2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.AnswerNumerator2.Location = new System.Drawing.Point(370, 36);
            this.AnswerNumerator2.Name = "AnswerNumerator2";
            this.AnswerNumerator2.ReadOnly = true;
            this.AnswerNumerator2.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.AnswerNumerator2.Size = new System.Drawing.Size(55, 26);
            this.AnswerNumerator2.TabIndex = 14;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(267, 14);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(42, 13);
            this.label3.TabIndex = 18;
            this.label3.Text = "Original";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(367, 14);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(51, 13);
            this.label4.TabIndex = 19;
            this.label4.Text = "Reduced";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(471, 44);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(45, 13);
            this.label5.TabIndex = 20;
            this.label5.Text = "Decimal";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(12, 14);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(54, 13);
            this.label6.TabIndex = 21;
            this.label6.Text = "Fraction 1";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(142, 14);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(54, 13);
            this.label7.TabIndex = 22;
            this.label7.Text = "Fraction 2";
            // 
            // FractionForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(626, 176);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.barline4);
            this.Controls.Add(this.AnswerDenominator2);
            this.Controls.Add(this.AnswerNumerator2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.DecimalAnswer);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.barline3);
            this.Controls.Add(this.AnswerDenominator);
            this.Controls.Add(this.AnswerNumerator);
            this.Controls.Add(this.equalsSign);
            this.Controls.Add(this.Operation);
            this.Controls.Add(this.barline2);
            this.Controls.Add(this.barline1);
            this.Controls.Add(this.Fraction2Denominator);
            this.Controls.Add(this.Fraction2Numerator);
            this.Controls.Add(this.Fraction1Denominator);
            this.Controls.Add(this.Fraction1Numerator);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "FractionForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Fraction Calculator";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox Fraction1Numerator;
        private System.Windows.Forms.TextBox Fraction1Denominator;
        private System.Windows.Forms.TextBox Fraction2Denominator;
        private System.Windows.Forms.TextBox Fraction2Numerator;
        private System.Windows.Forms.Label barline1;
        private System.Windows.Forms.Label barline2;
        private System.Windows.Forms.ComboBox Operation;
        private System.Windows.Forms.Label equalsSign;
        private System.Windows.Forms.Label barline3;
        private System.Windows.Forms.TextBox AnswerDenominator;
        private System.Windows.Forms.TextBox AnswerNumerator;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox DecimalAnswer;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label barline4;
        private System.Windows.Forms.TextBox AnswerDenominator2;
        private System.Windows.Forms.TextBox AnswerNumerator2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
    }
}

