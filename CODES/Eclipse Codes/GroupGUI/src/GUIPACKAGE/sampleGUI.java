package GUIPACKAGE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sampleGUI {
	public static void main(String[] args) {
		Info obj = new Info();
	}
}

class Info extends JFrame{
	
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3;
	JRadioButton r1, r2;
	JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JPanel panel, panel2;
	
	public Info() {
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		t4 = new JTextField(25);
		t5 = new JTextField(25);
		b1 = new JButton("PRINT");
		b2 = new JButton("CLEAR");
		b3 = new JButton("EXIT");
		r1 = new JRadioButton("male");
		r2 = new JRadioButton("female");
		c1 = new JCheckBox("Filipino");
		c2 = new JCheckBox("Dual Citizenship");
		c3 = new JCheckBox("by birth");
		c4 = new JCheckBox("by naturalization");
		c5 = new JCheckBox("Single");
		c6 = new JCheckBox("Married");
		c7 = new JCheckBox("Widowed");
		c8 = new JCheckBox("Separated");
		c9 = new JCheckBox("Other/s: ");
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();
		
		//panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		//setLayout(new GridLayout(28, 0));
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(r1);
		gender.add(r2);
		
		ButtonGroup citizenship = new ButtonGroup();
		citizenship.add(c1);
		citizenship.add(c2);
		
		ButtonGroup dualCitizenship = new ButtonGroup();
		dualCitizenship.add(c3);
		dualCitizenship.add(c4);
		
		ButtonGroup civilStatus = new ButtonGroup();
		civilStatus.add(c5);
		civilStatus.add(c6);
		civilStatus.add(c7);
		civilStatus.add(c8);
		civilStatus.add(c9);
		
		/*Container mainContainer = this.getContentPane();
		mainContainer.setLayout(new BorderLayout(100, 100));
		panel = new JPanel();
		panel.setLayout(new FlowLayout(15));
		mainContainer.add(panel, BorderLayout.NORTH);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(15));
		mainContainer.add(panel2, BorderLayout.CENTER);*/
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(r1);
		add(r2);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				
				String lName = t1.getText();
				l1.setText(lName);
				
				String fName = t2.getText();
				l2.setText(fName);
				
				String mName = t3.getText();
				l3.setText(mName);
				
				String address = t4.getText();
				l4.setText(address);
				
				if(c1.isSelected())
					l5.setText("Filipino");
				else if(c2.isSelected()) {
					if(c3.isSelected())
						l5.setText("Dual Citizenship by Birth");
					else if(c4.isSelected())
						l5.setText("Dual Citizenship by Naturalization");
					else
						l5.setText("Dual Citizenship");				
				}
				
				String bPlace = t5.getText();
				l7.setText(bPlace);
				
				if(r1.isSelected())
					l8.setText("male");
				else if(r2.isSelected())
					l8.setText("female");
				
				if(c5.isSelected())
					l9.setText("Single");
				else if(c6.isSelected())
					l9.setText("Married");
				else if(c7.isSelected())
					l9.setText("Widowed");
				else if(c8.isSelected())
					l9.setText("Separated");
				else if(c9.isSelected())
					l9.setText("Other/s: ");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				
				l1.setText("");
				l2.setText("");
				l3.setText("");
				l4.setText("");
				l5.setText("");
				l6.setText("");
				l7.setText("");
				l8.setText("");
				l9.setText("");
				
			}
		});
	}
}