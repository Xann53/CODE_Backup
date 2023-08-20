package PayrollSystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Option5 extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    Container pane = new Container();
    JLabel pTitle, id, ln, fn, mi, nod, g, d;
    JTextField idNum, lName, fName, mInn, numOfDep, gender, division;
    JButton searchButton, backButton;
    EmployeeOperations operation;
    
    public Option5(EmployeeOperations operation) {
        this.operation = operation;
        
        pTitle = new JLabel("SEARCH EMPLOYEE");
        pTitle.setFont(new Font("Arial", Font.BOLD, 23));    
        pTitle.setForeground(new Color(0x0253B3));
        pTitle.setBounds(100, 8, 500, 50);
        
        id = new JLabel("ID NUMBER:");
        id.setFont(new Font("Arial", Font.ITALIC, 18));    
        id.setForeground(new Color(0x0253B3));
        id.setBounds(25, 70, 500, 50);
        
        idNum = new JTextField(40);
        idNum.setBounds(150, 80, 240, 30);
        
        searchButton = new JButton("SEARCH");
        searchButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        searchButton.setBounds(70, 135, 120, 25);
        searchButton.setBackground(new Color(0x4DAADD));
        searchButton.setForeground(Color.white);
        searchButton.setFocusable(false);
        searchButton.addActionListener(this);
        
        backButton = new JButton("RETURN");
        backButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        backButton.setBounds(230, 135, 120, 25);
        backButton.setBackground(new Color(0x4DAADD));
        backButton.setForeground(Color.white);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        
        frame.add(pane);
        
        pane.add(pTitle);
        pane.add(id);
        pane.add(idNum);
        pane.add(backButton);
        pane.add(searchButton);
        
        frame.setSize(440, 230);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public Option5(EmployeeOperations operation, String ID) {
        this.operation = operation;
        String LastName = operation.getLastName(ID);
        String FirstName = operation.getFirstName(ID);
        String MiddleInitial = operation.getMiddleInitial(ID);
        String Dependents = operation.getDependents(ID);
        String Gender = operation.getGender(ID);
        String Division = operation.getDivision(ID);
        
        frame.setTitle("Payroll System");
        
        pTitle = new JLabel("VIEW EMPLOYEE PROFILE");
        pTitle.setFont(new Font("Arial", Font.BOLD, 30));    
        pTitle.setForeground(new Color(0x0253B3));
        pTitle.setBounds(194, 8, 500, 50);
        
        id = new JLabel("ID NUMBER:");
        id.setFont(new Font("Arial", Font.ITALIC, 18));    
        id.setForeground(new Color(0x0253B3));
        id.setBounds(30, 70, 500, 50);
        
        ln = new JLabel("LAST NAME:");
        ln.setFont(new Font("Arial", Font.ITALIC, 18));    
        ln.setForeground(new Color(0x0253B3));
        ln.setBounds(30, 130, 500, 50);
        
        fn = new JLabel("FIRST NAME:");
        fn.setFont(new Font("Arial", Font.ITALIC, 18));    
        fn.setForeground(new Color(0x0253B3));
        fn.setBounds(30, 190, 500, 50);
        
        mi = new JLabel("MIDDLE INNITIAL:");
        mi.setFont(new Font("Arial", Font.ITALIC, 18));    
        mi.setForeground(new Color(0x0253B3));
        mi.setBounds(30, 250, 500, 50);
        
        nod = new JLabel("NO. OF DEPENDENTS:");
        nod.setFont(new Font("Arial", Font.ITALIC, 18));    
        nod.setForeground(new Color(0x0253B3));
        nod.setBounds(420, 70, 500, 50);
        
        g = new JLabel("GENDER:");
        g.setFont(new Font("Arial", Font.ITALIC, 18));    
        g.setForeground(new Color(0x0253B3));
        g.setBounds(420, 130, 500, 50);
        
        d = new JLabel("DIVISION:");
        d.setFont(new Font("Arial", Font.ITALIC, 18));    
        d.setForeground(new Color(0x0253B3));
        d.setBounds(420, 190, 500, 50);
        
        idNum = new JTextField(40);
        idNum.setBounds(150, 80, 240, 30);
        idNum.setText(ID);
        idNum.setEditable(false);
        idNum.setFont(new Font("", Font.PLAIN, 16)); 
        
        lName = new JTextField(40);
        lName.setBounds(150, 140, 240, 30);
        lName.setText(LastName);
        lName.setEditable(false);
        lName.setFont(new Font("", Font.PLAIN, 16)); 
        
        fName = new JTextField(40);
        fName.setBounds(152, 200, 238, 30);
        fName.setText(FirstName);
        fName.setEditable(false);
        fName.setFont(new Font("", Font.PLAIN, 16)); 
        
        mInn = new JTextField(40);
        mInn.setBounds(190, 260, 200, 30);
        mInn.setText(MiddleInitial);
        mInn.setEditable(false);
        mInn.setFont(new Font("", Font.PLAIN, 16)); 
        
        numOfDep = new JTextField(40);
        numOfDep.setBounds(626, 80, 133, 30);
        numOfDep.setText(Dependents);
        numOfDep.setEditable(false);
        numOfDep.setFont(new Font("", Font.PLAIN, 16)); 
        
        gender = new JTextField(40);
        gender.setBounds(515, 140, 244, 30);
        gender.setText(Gender);
        gender.setEditable(false);
        gender.setFont(new Font("", Font.PLAIN, 16)); 
        
        division = new JTextField(40);
        division.setBounds(515, 200, 244, 30);
        division.setText(Division);
        division.setEditable(false);
        division.setFont(new Font("", Font.PLAIN, 16)); 
        
        backButton = new JButton("RETURN");
        backButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        backButton.setBounds(340, 320, 120, 25);
        backButton.setBackground(new Color(0x4DAADD));
        backButton.setForeground(Color.white);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        
        frame.add(pane);
        
        pane.add(pTitle);
        pane.add(id);
        pane.add(ln);
        pane.add(fn);
        pane.add(mi);
        pane.add(nod);
        pane.add(g);
        pane.add(d);
        pane.add(idNum);
        pane.add(lName);
        pane.add(fName);
        pane.add(mInn);
        pane.add(numOfDep);
        pane.add(gender);
        pane.add(division);
        pane.add(backButton);
        
        frame.setSize(800, 420);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public boolean isNumber(String val) {
        boolean access = false;
        for(int i = 0; i < val.length(); i++) {
            if(val.charAt(i) >= '0' && val.charAt(i) <= '9')
                access = true;
            else {
                access = false;
                break;
            }
        }
        return access;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==searchButton) {
            String ID = idNum.getText();
            boolean found = operation.searchID(ID);
            if(isNumber(ID) && found) {
                frame.dispose();
                new Option5(operation, ID);
            } else {
                idNum.setText(null);
            }
        }
        if(e.getSource()==backButton) {
            frame.dispose();
            new GUI(operation);
        }
    }
}