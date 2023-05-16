import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    Container pane = new Container();
    JLabel pTitle;
    JButton Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, exitButton;
    EmployeeOperations operation;
    
    public GUI(EmployeeOperations operation) {
        this.operation = operation;
        
        frame.setTitle("Payroll System");
        
        pTitle = new JLabel("PAYROLL SYSTEM");
        pTitle.setFont(new Font("Arial", Font.BOLD, 30));    
        pTitle.setForeground(new Color(0x0253B3));
        pTitle.setBounds(265, 8, 500, 50);
        
        Button1 = new JButton("REGISTER EMPLOYEE");
        Button1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button1.setBounds(30, 70, 330, 40);
        Button1.setBackground(new Color(0x4DAADD));
        Button1.setForeground(Color.white);
        Button1.setFocusable(false);
        Button1.addActionListener(this);
        
        Button2 = new JButton("ADD PAYROLL");
        Button2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button2.setBounds(30, 130, 330, 40);
        Button2.setBackground(new Color(0x4DAADD));
        Button2.setForeground(Color.white);
        Button2.setFocusable(false);
        Button2.addActionListener(this);
        
        Button3 = new JButton("UPDATE EMPLOYEE'S PROFILE");
        Button3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button3.setBounds(30, 190, 330, 40);
        Button3.setBackground(new Color(0x4DAADD));
        Button3.setForeground(Color.white);
        Button3.setFocusable(false);
        Button3.addActionListener(this);
        
        Button4 = new JButton("UPDATE PAYROLL");
        Button4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button4.setBounds(30, 250, 330, 40);
        Button4.setBackground(new Color(0x4DAADD));
        Button4.setForeground(Color.white);
        Button4.setFocusable(false);
        Button4.addActionListener(this);
        
        Button5 = new JButton("VIEW EMPLOYEE'S PROFILE");
        Button5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button5.setBounds(30, 310, 330, 40);
        Button5.setBackground(new Color(0x4DAADD));
        Button5.setForeground(Color.white);
        Button5.setFocusable(false);
        Button5.addActionListener(this);
        
        Button6 = new JButton("VIEW PAYROLL BY EMPLOYEE");
        Button6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button6.setBounds(430, 70, 330, 40);
        Button6.setBackground(new Color(0x4DAADD));
        Button6.setForeground(Color.white);
        Button6.setFocusable(false);
        Button6.addActionListener(this);
        
        Button7 = new JButton("VIEW PAYROLL BY DATE");
        Button7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button7.setBounds(430, 130, 330, 40);
        Button7.setBackground(new Color(0x4DAADD));
        Button7.setForeground(Color.white);
        Button7.setFocusable(false);
        Button7.addActionListener(this);
        
        Button8 = new JButton("VIEW PAYROLL SUMMARY");
        Button8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button8.setBounds(430, 190, 330, 40);
        Button8.setBackground(new Color(0x4DAADD));
        Button8.setForeground(Color.white);
        Button8.setFocusable(false);
        Button8.addActionListener(this);
        
        Button9 = new JButton("VIEW ALL EMPLOYEES");
        Button9.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        Button9.setBounds(430, 250, 330, 40);
        Button9.setBackground(new Color(0x4DAADD));
        Button9.setForeground(Color.white);
        Button9.setFocusable(false);
        Button9.addActionListener(this);
        
        exitButton = new JButton("EXIT");
        exitButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        exitButton.setBounds(430, 310, 330, 40);
        exitButton.setBackground(new Color(0x4DAADD));
        exitButton.setForeground(Color.white);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        
        frame.add(pane);
        
        pane.add(pTitle);
        pane.add(Button1);
        pane.add(Button2);
        pane.add(Button3);
        pane.add(Button4);
        pane.add(Button5);
        pane.add(Button6);
        pane.add(Button7);
        pane.add(Button8);
        pane.add(Button9);
        pane.add(exitButton);
        
        frame.setSize(800, 420);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Button1) {
            frame.dispose();
            new Option1(operation);
        }
        if(e.getSource()==Button2) {
            
        }
        if(e.getSource()==Button3) {
            frame.dispose();
            new Option3(operation);
        }
        if(e.getSource()==Button4) {
            
        }
        if(e.getSource()==Button5) {
            frame.dispose();
            new Option5(operation);
        }
        if(e.getSource()==Button6) {
            
        }
        if(e.getSource()==Button7) {
            
        }
        if(e.getSource()==Button8) {
            
        }
        if(e.getSource()==Button9) {
            
        }
        if(e.getSource()==exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        EmployeeOperations operation = new EmployeeOperations();
        new GUI(operation);
    }

}