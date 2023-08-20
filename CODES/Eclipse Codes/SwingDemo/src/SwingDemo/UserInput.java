package SwingDemo;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class UserInput {
	public static void main(String[] args) {
		RadioDemo obj = new RadioDemo();
	}
}

class RadioDemo extends JFrame {
	
	JTextField t1;
	JButton b;
	JRadioButton r1, r2;
	JLabel l;
	JCheckBox c1, c2;
	
	public RadioDemo() {
		
		t1 = new JTextField(15);
		b = new JButton("OK");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		l = new JLabel("Greeting");
		c1 = new JCheckBox("Drawing");
		c2 = new JCheckBox("Painting");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b);
		add(l);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				
				String name = t1.getText();
				
				if(r1.isSelected())
					name = "Howdy, mister " + name + ".";
				else if(r2.isSelected())
					name = "M'lady " + name + ".";
				if(c1.isSelected())
					name = name + " The sketch artist.";
				if(c2.isSelected())
					name = name + " The painter.";
				l.setText(name);
			}
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}