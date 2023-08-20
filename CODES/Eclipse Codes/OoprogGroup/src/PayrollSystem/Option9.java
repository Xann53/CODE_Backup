package PayrollSystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Option9 extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    Container pane = new Container();
    JLabel pTitle, id, ln, fn, mi, nod, g, d;
    JButton backButton;
    EmployeeOperations operation;
    JScrollPane scrollPane;
    JTextArea textArea;
    JTable table;
    
    public Option9(EmployeeOperations operation) {
        this.operation = operation;
        String[][] employees = operation.displayAll();
        String column[]={"LASTNAME","FIRSTNAME","MIDDLE INITIAL","ID NUMBER","GENDER","DIVISION"};
        
        frame.setTitle("Payroll System");
        
        pTitle = new JLabel("VIEW ALL EMPLOYEES");
        pTitle.setFont(new Font("Arial", Font.BOLD, 30));    
        pTitle.setForeground(new Color(0x0253B3));
        pTitle.setBounds(230, 8, 500, 50);
        
        backButton = new JButton("RETURN");
        backButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        backButton.setBounds(330, 350, 120, 25);
        backButton.setBackground(new Color(0x4DAADD));
        backButton.setForeground(Color.white);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        
        scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 55, 713, 285);
		
		table =new JTable(employees, column);
		table.setRowHeight(30);
	    table.setFont(new Font("", Font.PLAIN, 13)); 
	    scrollPane.setViewportView(table);
        
        frame.add(pane);
        
        pane.add(pTitle);
        pane.add(backButton);
        pane.add(scrollPane);
        
        frame.setSize(800, 420);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton) {
            frame.dispose();
            new GUI(operation);
        }
    }
}