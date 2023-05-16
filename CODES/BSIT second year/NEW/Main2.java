import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.*;

public class Main2 {
	GUI window = new GUI();
}

class GUI extends JFrame {
	
	JFrame frame;
	JLabel Label1;
	JButton exitbutton;
	
	public GUI() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(1000, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label1 = new JLabel("Input Postfix Expression");
		Label1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		Label1.setBounds(10, 29, 232, 25);
		frame.getContentPane().add(Label1);
		
		exitbutton = new JButton("Exit");
		exitbutton.setBounds(10, 266, 430, 23);
		exitbutton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        frame.dispose();
		    }
			
		});
		frame.getContentPane().add(exitbutton);
	}
}