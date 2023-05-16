import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUI implements ActionListener{
    private static JTextField txtIdNo, txtLName, txtFName, txtContact, txtLocation;
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
                
        JPanel panel=new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        JLabel lblTitle=new JLabel("CONTACT MANAGEMENT SYSTEM");
        lblTitle.setFont(new Font("ARIAL",Font.BOLD,16));
        lblTitle.setBounds(110, 10, 300, 20);
        panel.add(lblTitle);
        
        JLabel lblIdNo=new JLabel("ID No.");
        lblIdNo.setFont(new Font("ARIAL",Font.PLAIN,14));
        lblIdNo.setBounds(110, 50, 80, 20);
        panel.add(lblIdNo);
        
        txtIdNo=new JTextField();
        txtIdNo.setBounds(220, 50, 180, 25);
        panel.add(txtIdNo);
        
        JLabel lblLName=new JLabel("Last Name");
        lblLName.setFont(new Font("ARIAL",Font.PLAIN,14));
        lblLName.setBounds(110, 80, 80, 20);
        panel.add(lblLName);
        
        txtLName=new JTextField();
        txtLName.setBounds(220, 80, 180, 25);
        panel.add(txtLName);
        
        JLabel lblFName=new JLabel("First Name");
        lblFName.setFont(new Font("ARIAL",Font.PLAIN,14));
        lblFName.setBounds(110, 110, 80, 20);
        panel.add(lblFName);
        
        txtFName=new JTextField();
        txtFName.setBounds(220, 110, 180, 25);
        panel.add(txtFName);
        
        JLabel lblContact=new JLabel("Contact");
        lblContact.setFont(new Font("ARIAL",Font.PLAIN,14));
        lblContact.setBounds(110, 140, 80, 20);
        panel.add(lblContact);
        
        txtContact=new JTextField();
        txtContact.setBounds(220, 140, 180, 25);
        panel.add(txtContact);
        
        JLabel lblLocation=new JLabel("Location");
        lblLocation.setFont(new Font("ARIAL",Font.PLAIN,14));
        lblLocation.setBounds(110, 170, 80, 20);
        panel.add(lblLocation);
        
        txtLocation=new JTextField();
        txtLocation.setBounds(220, 170, 180, 25);
        panel.add(txtLocation);
        
        JButton btnSubmit=new JButton("Submit");
        btnSubmit.addActionListener(new ContactUI());
        btnSubmit.setBounds(110, 240, 120, 40);
        panel.add(btnSubmit);
        
        JButton btnCancel=new JButton("Cancel");
        btnCancel.setBounds(280, 240, 120, 40);
        panel.add(btnCancel);
        
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        CMSModules cms=new CMSModules();
        String idno, lastname, firstname, contact, location;
        idno=txtIdNo.getText();
        lastname=txtLName.getText();
        firstname=txtFName.getText();
        contact=txtContact.getText();
        location=txtLocation.getText();
        cms.addData(idno, lastname,firstname,contact,location);
        
        txtIdNo.setText("");
        txtLName.setText("");
        txtFName.setText("");
        txtContact.setText("");
        txtLocation.setText("");
    }
}
