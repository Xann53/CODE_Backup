import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Option1 extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    Container pane = new Container();
    JLabel pTitle, id, ln, fn, mi, nod, g, d;
    JTextField idNum, lName, fName, mInn, numOfDep;
    JButton submitButton, clearButton, backButton;
    JRadioButton mGender, fGender, xGender;
    JCheckBox acc, hr, cshr, edp, admin, lo, xDivision;
    EmployeeOperations operation;
    
    public Option1(EmployeeOperations operation) {
        this.operation = operation;
        
        frame.setTitle("Payroll System");
        
        pTitle = new JLabel("EMPLOYEE REGISTRATION");
        pTitle.setFont(new Font("Arial", Font.BOLD, 30));    
        pTitle.setForeground(new Color(0x0253B3));
        pTitle.setBounds(195, 8, 500, 50);
        
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
        
        d = new JLabel("SELECT DIVISION:");
        d.setFont(new Font("Arial", Font.ITALIC, 18));    
        d.setForeground(new Color(0x0253B3));
        d.setBounds(420, 190, 500, 50);
        
        idNum = new JTextField(40);
        idNum.setBounds(150, 80, 240, 30);
        
        lName = new JTextField(40);
        lName.setBounds(150, 140, 240, 30);
        
        fName = new JTextField(40);
        fName.setBounds(152, 200, 238, 30);
        
        mInn = new JTextField(40);
        mInn.setBounds(190, 260, 200, 30);
        
        numOfDep = new JTextField(40);
        numOfDep.setBounds(626, 80, 133, 30);
        
        mGender = new JRadioButton("Male");
        mGender.setFont(new Font("Arial", Font.ITALIC, 18));
        mGender.setBounds(530, 140, 80, 30);
        
        fGender = new JRadioButton("Female");
        fGender.setFont(new Font("Arial", Font.ITALIC, 18));
        fGender.setBounds(630, 140, 100, 30);
        
        xGender = new JRadioButton();
        
        acc = new JCheckBox("Accounting");
        acc.setFont(new Font("Arial", Font.ITALIC, 16));
        acc.setBounds(420, 230, 110, 25);
        
        hr = new JCheckBox("HR");
        hr.setFont(new Font("Arial", Font.ITALIC, 16));
        hr.setBounds(563, 230, 50, 25);
        
        cshr = new JCheckBox("Cashier");
        cshr.setFont(new Font("Arial", Font.ITALIC, 16));
        cshr.setBounds(650, 230, 100, 25);
        
        edp = new JCheckBox("EDP");
        edp.setFont(new Font("Arial", Font.ITALIC, 16));
        edp.setBounds(563, 255, 60, 25);
        
        admin = new JCheckBox("Administrator");
        admin.setFont(new Font("Arial", Font.ITALIC, 16));
        admin.setBounds(420, 255, 120, 25);
        
        lo = new JCheckBox("Legal Office");
        lo.setFont(new Font("Arial", Font.ITALIC, 16));
        lo.setBounds(650, 255, 120, 25);
        
        xDivision = new JCheckBox();

        ButtonGroup gender = new ButtonGroup();
        gender.add(mGender);
        gender.add(fGender);
        gender.add(xGender);
        
        ButtonGroup division = new ButtonGroup();
        division.add(acc);
        division.add(hr);
        division.add(cshr);
        division.add(edp);
        division.add(admin);
        division.add(lo);
        division.add(xDivision);
        
        submitButton = new JButton("SUBMIT");
        submitButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        submitButton.setBounds(190, 320, 120, 25);
        submitButton.setBackground(new Color(0x4DAADD));
        submitButton.setForeground(Color.white);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);
        
        clearButton = new JButton("CLEAR");
        clearButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        clearButton.setBounds(340, 320, 120, 25);
        clearButton.setBackground(new Color(0x4DAADD));
        clearButton.setForeground(Color.white);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);
        
        backButton = new JButton("RETURN");
        backButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15)); 
        backButton.setBounds(490, 320, 120, 25);
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
        pane.add(mGender);
        pane.add(fGender);
        pane.add(acc);
        pane.add(hr);
        pane.add(cshr);
        pane.add(edp);
        pane.add(admin);
        pane.add(lo);
        pane.add(submitButton);
        pane.add(clearButton);
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
    
    public void clear() {
        idNum.setText(null);
        lName.setText(null);
        fName.setText(null);
        mInn.setText(null);
        numOfDep.setText(null);
        mGender.setSelected(false);
        fGender.setSelected(false);
        xGender.setSelected(true);
        acc.setSelected(false);
        hr.setSelected(false);
        cshr.setSelected(false);
        edp.setSelected(false);
        admin.setSelected(false);
        lo.setSelected(false);
        xDivision.setSelected(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitButton) {
            
            String ID = idNum.getText();
            String LastName = lName.getText();
            String FirstName = fName.getText();
            String MiddleName = mInn.getText();
            String Dependents = numOfDep.getText();
            String Gender = null, Division = null;
            
            if(mGender.isSelected()) {
                Gender = "Male";
            } else if(fGender.isSelected()) {
                Gender = "Female";
            }
            
            if(acc.isSelected()) {
                Division = "Accounting";
            } else if(hr.isSelected()) {
                Division = "Human Resources";
            } else if(cshr.isSelected()) {
                Division = "Cashier";
            } else if(edp.isSelected()) {
                Division = "EDP";
            } else if(admin.isSelected()) {
                Division = "Administrator";
            } else if(lo.isSelected()) {
                Division = "Legal Office";
            }
            
            if(isNumber(ID) && isNumber(Dependents)) {
                if(LastName != null && FirstName != null && MiddleName != null && Gender != null && Division != null) {
                    operation.addEmployee(ID, LastName, FirstName, MiddleName, Dependents, Gender, Division);
                    frame.dispose();
                    new GUI(operation);
                } else {
                    clear();
                }
            } else {
                clear();
            }
        }
        if(e.getSource()==clearButton) {
            clear();
        }
        if(e.getSource()==backButton) {
            frame.dispose();
            new GUI(operation);
        }
    }
}