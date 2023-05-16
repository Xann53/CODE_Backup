import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class ContactInterface implements ActionListener{
    private static JTextField txtIdNo, txtLName, txtFName, txtContact, txtLocation;
    private static JButton btnAdd, btnSubmit, btnCancel, btnDispAll, btnExit;
    private static JFrame frame;
    private static JPanel panel, panelAdd;
    private static JLabel lblTitle;

    public static void main(String[] args){
        frame=new JFrame();
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel=new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JLabel lblTitle=new JLabel("CONTACT MANAGEMENT SYSTEM");
        lblTitle.setFont(new Font("ARIAL",Font.BOLD,16));
        lblTitle.setBounds(115, 10, 300, 20);
        panel.add(lblTitle);

        JButton btnAdd=new JButton("Add Contact");
        btnAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelAdd=new JPanel();
                    panelAdd.setLayout(null);
                    frame.add(panelAdd);

                    JLabel lblTitle=new JLabel("CONTACT MANAGEMENT SYSTEM");
                    lblTitle.setFont(new Font("ARIAL",Font.BOLD,16));
                    lblTitle.setBounds(115, 10, 300, 20);
                    panelAdd.add(lblTitle);

                    JLabel lblIdNo=new JLabel("ID No.");
                    lblIdNo.setFont(new Font("ARIAL",Font.PLAIN,14));
                    lblIdNo.setBounds(120, 35, 100, 80);
                    panelAdd.add(lblIdNo);

                    txtIdNo=new JTextField();
                    txtIdNo.setBounds(220, 60, 160, 25);
                    panelAdd.add(txtIdNo);

                    JLabel lblLName=new JLabel("Last Name");
                    lblLName.setFont(new Font("ARIAL",Font.PLAIN,14));
                    lblLName.setBounds(120, 75, 100, 80);
                    panelAdd.add(lblLName);

                    txtLName=new JTextField();
                    txtLName.setBounds(220, 100, 160, 25);
                    panelAdd.add(txtLName);

                    JLabel lblFName=new JLabel("First Name");
                    lblFName.setFont(new Font("ARIAL",Font.PLAIN,14));
                    lblFName.setBounds(120, 115, 100, 80);
                    panelAdd.add(lblFName);

                    txtFName=new JTextField();
                    txtFName.setBounds(220, 140, 160, 25);
                    panelAdd.add(txtFName);

                    JLabel lblContact=new JLabel("Contact No. ");
                    lblContact.setFont(new Font("ARIAL",Font.PLAIN,14));
                    lblContact.setBounds(120, 155, 100, 80);
                    panelAdd.add(lblContact);

                    txtContact=new JTextField();
                    txtContact.setBounds(220, 180, 160, 25);
                    panelAdd.add(txtContact);

                    JLabel lblLocation=new JLabel("Location");
                    lblLocation.setFont(new Font("ARIAL",Font.PLAIN,14));
                    lblLocation.setBounds(120, 190, 100, 80);
                    panelAdd.add(lblLocation);

                    txtLocation=new JTextField();
                    txtLocation.setBounds(220, 220, 160, 25);
                    panelAdd.add(txtLocation);

                    btnSubmit=new JButton("Submit");
                    btnSubmit.setBounds(115, 280, 125, 30);
                    btnSubmit.addActionListener(new ContactInterface());
                    panelAdd.add(btnSubmit);

                    JButton btnCancel=new JButton("Cancel");
                    btnCancel.setBounds(255, 280, 125, 30);
                    btnCancel.addActionListener(new ContactInterface());
                    panelAdd.add(btnCancel);

                    panel.setVisible(false);
                    panelAdd.setVisible(true);

                    btnCancel.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                panel.setVisible(true);
                                panelAdd.setVisible(false);
                            }
                        });
                }
            });

        btnAdd.setBounds(155, 60, 200, 35);
        panel.add(btnAdd);

        JButton btnSearch=new JButton("Search Contact");
        btnSearch.setBounds(155, 105, 200, 35);
        //btnSearch.addActionListener(new ContactInterface());
        panel.add(btnSearch);

        JButton btnUpdate=new JButton("Update Contact");
        btnUpdate.setBounds(155, 150, 200, 35);
        //btnUpdate.addActionListener(new ContactInterface());
        panel.add(btnUpdate);

        JButton btnDelete=new JButton("Delete Contact");
        btnDelete.setBounds(155, 195, 200, 35);
        //btnDelete.addActionListener(new ContactInterface());
        panel.add(btnDelete);

        btnDispAll=new JButton("Diplay All Contact");
        btnDispAll.setBounds(155, 240, 200, 35);
        btnDispAll.addActionListener(new ContactInterface());
        panel.add(btnDispAll);

        btnExit=new JButton("EXIT");
        btnExit.setBounds(155, 300, 200, 35);
        btnExit.addActionListener(new ContactInterface());
        panel.add(btnExit);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnExit){
            System.exit(0);
        }

        if(e.getSource()==btnSubmit){
            CMSModules cms=new CMSModules();
            String idno, lastname, firstname, contact, location;
            if(txtIdNo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter ID No.","Error",JOptionPane.WARNING_MESSAGE);
                txtIdNo.requestFocus();
            }
            else if(txtLName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Last Name","Error",JOptionPane.WARNING_MESSAGE);
                txtLName.requestFocus();
            }
            else if(txtFName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter First Name","Error",JOptionPane.WARNING_MESSAGE);
                txtFName.requestFocus();
            }
            else if(txtContact.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Contact","Error",JOptionPane.WARNING_MESSAGE);
                txtContact.requestFocus();
            }
            else if(txtLocation.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Location","Error",JOptionPane.WARNING_MESSAGE);
                txtLocation.requestFocus();
            }
            else{

                idno = txtIdNo.getText();
                lastname = txtLName.getText();
                firstname = txtFName.getText();
                contact = txtContact.getText();
                location = txtLocation.getText();
                cms.addData(idno, lastname, firstname, contact, location);

                txtIdNo.setText("");
                txtLName.setText("");
                txtFName.setText("");
                txtContact.setText("");
                txtLocation.setText("");
            }

            if(e.getSource()==btnDispAll){
                //String data = cms.displayAll();
            }
        }

    }
}

