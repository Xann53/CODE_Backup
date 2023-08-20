namespace Simple_Calculator
{
    partial class Base
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
            this.OutputTxt = new System.Windows.Forms.TextBox();
            this.CalculateButton = new System.Windows.Forms.Button();
            this.InputTxt = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // OutputTxt
            // 
            this.OutputTxt.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.OutputTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.OutputTxt.Location = new System.Drawing.Point(12, 29);
            this.OutputTxt.Name = "OutputTxt";
            this.OutputTxt.ReadOnly = true;
            this.OutputTxt.Size = new System.Drawing.Size(200, 35);
            this.OutputTxt.TabIndex = 0;
            this.OutputTxt.TabStop = false;
            this.OutputTxt.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // CalculateButton
            // 
            this.CalculateButton.BackColor = System.Drawing.Color.LightSkyBlue;
            this.CalculateButton.Font = new System.Drawing.Font("Microsoft YaHei UI", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CalculateButton.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.CalculateButton.Location = new System.Drawing.Point(42, 158);
            this.CalculateButton.Name = "CalculateButton";
            this.CalculateButton.Size = new System.Drawing.Size(134, 41);
            this.CalculateButton.TabIndex = 1;
            this.CalculateButton.Text = "Calculate";
            this.CalculateButton.UseVisualStyleBackColor = false;
            this.CalculateButton.Click += new System.EventHandler(this.CalculateButton_Click);
            // 
            // InputTxt
            // 
            this.InputTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.InputTxt.Location = new System.Drawing.Point(12, 99);
            this.InputTxt.Name = "InputTxt";
            this.InputTxt.Size = new System.Drawing.Size(200, 35);
            this.InputTxt.TabIndex = 2;
            this.InputTxt.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // Base
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.AliceBlue;
            this.ClientSize = new System.Drawing.Size(225, 222);
            this.Controls.Add(this.InputTxt);
            this.Controls.Add(this.CalculateButton);
            this.Controls.Add(this.OutputTxt);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "Base";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Simple Calculator";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox OutputTxt;
        private System.Windows.Forms.Button CalculateButton;
        private System.Windows.Forms.TextBox InputTxt;
    }
}

