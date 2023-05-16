package cmtemplate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ContactInterface implements ActionListener {
	private CMSModules cms = new CMSModules();
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JPanel addPanel = new JPanel();
	private JPanel searchPanel = new JPanel();
	private JPanel displayPanel = new JPanel();
	private JLabel titleLbl, addTitleLbl, searchTitleLbl, displayTitleLbl;
	private JLabel idNoLbl1, lNameLbl1, fNameLbl1, contLbl1, locLbl1;
	private JLabel idNoLbl2, lNameLbl2, fNameLbl2, contLbl2, locLbl2;
	private JTextField txtIdNo1, txtLName1, txtFName1, txtContact1, txtLocation1;
	private JTextField txtIdNo2, txtLName2, txtFName2, txtContact2, txtLocation2;
	private JButton addBtn, searchBtn, displayAllBtn, exitBtn, submitBtn1, cancelBtn1, submitBtn2, cancelBtn2, cancelBtn3;
	private JTable table;
	
	public ContactInterface() {
		panel.setLayout(null);
		addPanel.setLayout(null);
		searchPanel.setLayout(null);
		displayPanel.setLayout(null);
        
        //MAIN MENU----------------------------------------------
		
		titleLbl = new JLabel("CONTACT MANAGEMENT SYSTEM");
        titleLbl.setFont(new Font("ARIAL",Font.BOLD,16));
        titleLbl.setBounds(115, 10, 300, 20);
        
        addBtn = new JButton("Add Contact");
        addBtn.setBounds(150, 60, 200, 35);
        addBtn.addActionListener(this);
        
        searchBtn = new JButton("Search Contact");
        searchBtn.setBounds(150, 105, 200, 35);
        searchBtn.addActionListener(this);
        
        displayAllBtn = new JButton("Display All Contact");
        displayAllBtn.setBounds(150, 150, 200, 35);
        displayAllBtn.addActionListener(this);
        
        exitBtn = new JButton("EXIT");
        exitBtn.setBounds(150, 195, 200, 35);
        exitBtn.addActionListener(this);
		
        panel.add(titleLbl);
        panel.add(addBtn);
        panel.add(searchBtn);
        panel.add(displayAllBtn);
        panel.add(exitBtn);
        
        
        //ADD CONTACT MENU----------------------------------------
        
        addTitleLbl = new JLabel("CONTACT MANAGEMENT SYSTEM");
        addTitleLbl.setFont(new Font("ARIAL",Font.BOLD,16));
        addTitleLbl.setBounds(115, 10, 300, 20);
        
        idNoLbl1 = new JLabel("ID No.");
        idNoLbl1.setFont(new Font("ARIAL",Font.PLAIN,14));
        idNoLbl1.setBounds(120, 35, 100, 80);

        txtIdNo1 = new JTextField();
        txtIdNo1.setBounds(220, 60, 160, 25);

        lNameLbl1 = new JLabel("Last Name");
        lNameLbl1.setFont(new Font("ARIAL",Font.PLAIN,14));
        lNameLbl1.setBounds(120, 75, 100, 80);
        
        txtLName1 = new JTextField();
        txtLName1.setBounds(220, 100, 160, 25);

        fNameLbl1 = new JLabel("First Name");
        fNameLbl1.setFont(new Font("ARIAL",Font.PLAIN,14));
        fNameLbl1.setBounds(120, 115, 100, 80);

        txtFName1 = new JTextField();
        txtFName1.setBounds(220, 140, 160, 25);

        contLbl1 = new JLabel("Contact No. ");
        contLbl1.setFont(new Font("ARIAL",Font.PLAIN,14));
        contLbl1.setBounds(120, 155, 100, 80);

        txtContact1 = new JTextField();
        txtContact1.setBounds(220, 180, 160, 25);
        
        locLbl1 = new JLabel("Location");
        locLbl1.setFont(new Font("ARIAL",Font.PLAIN,14));
        locLbl1.setBounds(120, 190, 100, 80);

        txtLocation1 = new JTextField();
        txtLocation1.setBounds(220, 220, 160, 25);

        submitBtn1 = new JButton("Submit");
        submitBtn1.setBounds(115, 280, 125, 30);
        submitBtn1.addActionListener(this);

        cancelBtn1 = new JButton("Cancel");
        cancelBtn1.setBounds(255, 280, 125, 30);
        cancelBtn1.addActionListener(this);
        
        addPanel.add(addTitleLbl);
        addPanel.add(idNoLbl1);
        addPanel.add(lNameLbl1);
        addPanel.add(fNameLbl1);
        addPanel.add(contLbl1);
        addPanel.add(locLbl1);
        addPanel.add(txtIdNo1);
        addPanel.add(txtLName1);
        addPanel.add(txtFName1);
        addPanel.add(txtContact1);
        addPanel.add(txtLocation1);
        addPanel.add(submitBtn1);
        addPanel.add(cancelBtn1);
        
        
        //SEARCH CONTACT MENU----------------------------------------
        
        searchTitleLbl = new JLabel("CONTACT MANAGEMENT SYSTEM");
        searchTitleLbl.setFont(new Font("ARIAL",Font.BOLD,16));
        searchTitleLbl.setBounds(115, 10, 300, 20);
        
        idNoLbl2 = new JLabel("ID No.");
        idNoLbl2.setFont(new Font("ARIAL",Font.PLAIN,14));
        idNoLbl2.setBounds(120, 35, 100, 80);

        txtIdNo2 = new JTextField();
        txtIdNo2.setBounds(220, 60, 160, 25);

        lNameLbl2 = new JLabel("Last Name");
        lNameLbl2.setFont(new Font("ARIAL",Font.PLAIN,14));
        lNameLbl2.setBounds(120, 75, 100, 80);
        
        txtLName2 = new JTextField();
        txtLName2.setBounds(220, 100, 160, 25);
        txtLName2.setEditable(false);

        fNameLbl2 = new JLabel("First Name");
        fNameLbl2.setFont(new Font("ARIAL",Font.PLAIN,14));
        fNameLbl2.setBounds(120, 115, 100, 80);

        txtFName2 = new JTextField();
        txtFName2.setBounds(220, 140, 160, 25);
        txtFName2.setEditable(false);

        contLbl2 = new JLabel("Contact No. ");
        contLbl2.setFont(new Font("ARIAL",Font.PLAIN,14));
        contLbl2.setBounds(120, 155, 100, 80);

        txtContact2 = new JTextField();
        txtContact2.setBounds(220, 180, 160, 25);
        txtContact2.setEditable(false);
        
        locLbl2 = new JLabel("Location");
        locLbl2.setFont(new Font("ARIAL",Font.PLAIN,14));
        locLbl2.setBounds(120, 190, 100, 80);

        txtLocation2 = new JTextField();
        txtLocation2.setBounds(220, 220, 160, 25);
        txtLocation2.setEditable(false);

        submitBtn2 = new JButton("Submit");
        submitBtn2.setBounds(115, 280, 125, 30);
        submitBtn2.addActionListener(this);

        cancelBtn2 = new JButton("Cancel");
        cancelBtn2.setBounds(255, 280, 125, 30);
        cancelBtn2.addActionListener(this);
        
        searchPanel.add(searchTitleLbl);
        searchPanel.add(idNoLbl2);
        searchPanel.add(lNameLbl2);
        searchPanel.add(fNameLbl2);
        searchPanel.add(contLbl2);
        searchPanel.add(locLbl2);
        searchPanel.add(txtIdNo2);
        searchPanel.add(txtLName2);
        searchPanel.add(txtFName2);
        searchPanel.add(txtContact2);
        searchPanel.add(txtLocation2);
        searchPanel.add(submitBtn2);
        searchPanel.add(cancelBtn2);
        
        
        //DISPLAY ALL MENU--------------------------------------------
        
        displayTitleLbl = new JLabel("CONTACT MANAGEMENT SYSTEM");
        displayTitleLbl.setFont(new Font("ARIAL",Font.BOLD,16));
        displayTitleLbl.setBounds(115, 10, 300, 20);
        
        cancelBtn3 = new JButton("Cancel");
        cancelBtn3.setBounds(190, 325, 125, 30);
        cancelBtn3.addActionListener(this);
        
        displayPanel.add(displayTitleLbl);
        displayPanel.add(cancelBtn3);
        
        
        frame.add(panel);
        frame.setSize(520, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void ClearTxtBox() {
		txtIdNo1.setText(null);
        txtLName1.setText(null);
        txtFName1.setText(null);
        txtContact1.setText(null);
        txtLocation1.setText(null);

        txtIdNo2.setText(null);
        txtLName2.setText(null);
        txtFName2.setText(null);
        txtContact2.setText(null);
        txtLocation2.setText(null);
	}
	
	public void Cancel() {
		ClearTxtBox();
		addPanel.setVisible(false);
		searchPanel.setVisible(false);
		displayPanel.setVisible(false);
		panel.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitBtn){
            System.exit(0);
        } else if(e.getSource()==addBtn) {
        	panel.setVisible(false);
        	frame.add(addPanel);
        	addPanel.setVisible(true);
        } else if(e.getSource()==searchBtn) {
        	panel.setVisible(false);
        	frame.add(searchPanel);
        	searchPanel.setVisible(true);
        } else if(e.getSource()==displayAllBtn) {
        	String[] columnName = {"ID No.", "Last Name", "First Name", "Contact No.", "Address"};
        	String[][] tempColumnData = cms.DisplayAll();
        	String[][] columnData = new String[tempColumnData.length][tempColumnData[0].length];
        	
        	for(int i = 0; i < columnData.length; i++) {
        		for(int j = 0; j < columnData[i].length; j++) {
            		columnData[i][j] = tempColumnData[i][j].replaceAll("_", "\s");
            	}
        	}
        	
        	table = new JTable(columnData, columnName);
            table.setBounds(4, 35, 495, 285);
            table.setRowHeight(20);
            table.getColumnModel().getColumn(0).setPreferredWidth(60);
            table.getColumnModel().getColumn(1).setPreferredWidth(130);
            table.getColumnModel().getColumn(2).setPreferredWidth(130);
            table.getColumnModel().getColumn(3).setPreferredWidth(110);
            table.getColumnModel().getColumn(4).setPreferredWidth(200);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.getTableHeader().setResizingAllowed(false);
            
            JScrollPane tableScroll = new JScrollPane(table);
            tableScroll.setBounds(4, 35, 495, 285);
            
            displayPanel.add(tableScroll);
            
        	panel.setVisible(false);
        	frame.add(displayPanel);
        	displayPanel.setVisible(true);
        }
		
		if(e.getSource()==cancelBtn1 || e.getSource()==cancelBtn2 || e.getSource()==cancelBtn3) {
			Cancel();
		}
		if(e.getSource()==submitBtn1){
            String idno, lastname, firstname, contact, location, temp;
            if(txtIdNo1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter ID No.","Error",JOptionPane.WARNING_MESSAGE);
                txtIdNo1.requestFocus();
            } else if(txtLName1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Last Name","Error",JOptionPane.WARNING_MESSAGE);
                txtLName1.requestFocus();
            } else if(txtFName1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter First Name","Error",JOptionPane.WARNING_MESSAGE);
                txtFName1.requestFocus();
            } else if(txtContact1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Contact","Error",JOptionPane.WARNING_MESSAGE);
                txtContact1.requestFocus();
            } else if(txtLocation1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Location","Error",JOptionPane.WARNING_MESSAGE);
                txtLocation1.requestFocus();
            } else{
            	temp = txtIdNo1.getText();
            	temp = temp.trim();
            	idno = temp.replaceAll("\\s+", "_");
                
            	temp = txtLName1.getText();
            	temp = temp.trim();
            	lastname = temp.replaceAll("\\s+", "_");
            	
            	temp = txtFName1.getText();
            	temp = temp.trim();
            	firstname = temp.replaceAll("\\s+", "_");
            	
            	temp = txtContact1.getText();
            	temp = temp.trim();
            	contact = temp.replaceAll("\\s+", "_");
            	
            	temp = txtLocation1.getText();
            	temp = temp.trim();
            	location = temp.replaceAll("\\s+", "_");
            	
            	cms.addData(idno, lastname, firstname, contact, location);
            	
            	ClearTxtBox();
            	Cancel();
            }
		}
		if(e.getSource()==submitBtn2){
			String idno, temp;
            if(txtIdNo2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter ID No.","Error",JOptionPane.WARNING_MESSAGE);
                txtIdNo2.requestFocus();
            } else {
            	temp = txtIdNo2.getText();
            	temp = temp.trim();
            	idno = temp.replaceAll("\\s+", "_");
            	
            	temp = cms.DisplayOne(idno);
            	String tempArr[] = temp.split("\\s+");
            	
            	txtLName2.setText(tempArr[1].replaceAll("_", "\s"));
                txtFName2.setText(tempArr[2].replaceAll("_", "\s"));
                txtContact2.setText(tempArr[3].replaceAll("_", "\s"));
                txtLocation2.setText(tempArr[4].replaceAll("_", "\s"));
            }
		}
	}
	
	public static void main(String[] args) {
		new ContactInterface();
	}

}
