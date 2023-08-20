package SwingDemo;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.crypto.AEADBadTagException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class AddGUI {
	
	public static void main(String[] args) {
		Addition obj = new Addition();
	}
}

class Addition extends JFrame /*implements ActionListener*/{
	JTextField t1, t2;
	JButton b;
	JLabel l;
	
	public Addition() {
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("OK");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		b.addActionListener(ae -> 
		{
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
		
			int value = num1 + num2;
			l.setText(value + "");
		});
		/*ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int value = num1 + num2;
				l.setText(value + "");
			}
		};
		b.addActionListener(al);*/
		/*b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int value = num1 + num2;
				l.setText(value + "");
			}
		});*/
		//b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*public void actionPerformed(ActionEvent ae) {
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		int value = num1 + num2;
		l.setText(value + "");
	}*/
}