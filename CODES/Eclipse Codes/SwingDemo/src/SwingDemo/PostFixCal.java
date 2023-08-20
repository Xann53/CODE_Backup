package SwingDemo;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.*;
import java.util.Stack;

public class PostFixCal {

	private JFrame frame;
	private JTextField inputtext;
	private JTextField outputtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostFixCal window = new PostFixCal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PostFixCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input Postfix Expression");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 29, 232, 25);
		frame.getContentPane().add(lblNewLabel);
		
		inputtext = new JTextField();
		inputtext.setBounds(10, 65, 430, 20);
		frame.getContentPane().add(inputtext);
		inputtext.setColumns(10);
		
		JButton evaluatebutton = new JButton("Evalutate");
		evaluatebutton.setBounds(10, 96, 232, 23);
		evaluatebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				boolean proceed = true;
				String value = inputtext.getText();
				for(int i = 0; i < value.length(); i++) {
					if((value.charAt(i) >= 'a' && value.charAt(i) <= 'z') || (value.charAt(i) >= 'A' && value.charAt(i) <= 'Z')) {
						proceed = false;
						break;
					}
				}
				if(value.equals("")) {
	                outputtext.setText("");
				} else if(!proceed) {
					outputtext.setText("Invalid");
				} else {
					boolean access = false;
			        value = value.trim();
			        value = value.replaceAll("\\s+"," ");
			        
			        String[] array = value.split(" ");
			        Stack<Double> stack=new Stack<>();
			        
			        for(int i = 0; i < array.length; i++) {
			            for(int j = 0; j < array[i].length(); j++) {
			                if(Character.isDigit(array[i].charAt(j))) {
			                    access = true;
			                } else {
			                    access = false;
			                }
			            }
			            if(access) {
			                double y = Double.parseDouble(array[i]);
			                stack.push(y);
			            } else {
			                try {
			                    String c = array[i];
			                    double val1 = stack.pop();
			                    double val2 = stack.pop(); 
			                    switch(c) {
			                        case "+":
			                        stack.push(val2+val1);
			                        break;
			                     
			                        case "-":
			                        stack.push(val2- val1);
			                        break;
			                     
			                        case "/":
			                        stack.push(val2/val1);
			                        break;
			                     
			                        case "*":
			                        stack.push(val2*val1);
			                        break;
			                    }
			                } catch(Exception ae) {
			                }
			            }
			        }
	                String postFix = "" + stack.pop();
	                outputtext.setText(postFix);
				}
				
				
				
				
			}
			
		});
		frame.getContentPane().add(evaluatebutton);
		
		JButton clearbutton = new JButton("Clear");
		clearbutton.setBounds(252, 96, 188, 23);
		clearbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				inputtext.setText(null);
			}
			
		});
		frame.getContentPane().add(clearbutton);
		
		
		JLabel lblNewLabel_1 = new JLabel("Post fix Evaluation");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 177, 232, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		outputtext = new JTextField();
		outputtext.setBounds(10, 225, 430, 20);
		frame.getContentPane().add(outputtext);
		outputtext.setColumns(10);
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.setBounds(10, 266, 430, 23);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
			}
			
		});
		frame.getContentPane().add(exitbutton);
	}

}

