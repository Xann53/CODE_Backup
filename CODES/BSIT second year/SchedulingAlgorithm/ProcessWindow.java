import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProcessWindow extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	Container pane = new Container();
	JLabel arrivalTimeLabel, burstTimeLabel, priorityLabel;
	JTextField arrivalTField, burstTField, priorityTField, pTitleTField;
	JButton nextButton, mainButton;
	
    int arrivalTime, burstTime, priority, ctr;
    String[] processID;
    SchedulingOperations operations;
	
	public ProcessWindow(int i, String[] process, SchedulingOperations operations) {
		this.ctr = i;
		this.processID = process;
		this.operations = operations;
		
		frame.setTitle("Process Values");
		
		pTitleTField = new JTextField(40);
		pTitleTField.setText(processID[i]);
		pTitleTField.setFont(new Font("Tahoma", Font.BOLD, 45));
		pTitleTField.setEditable(false);
		pTitleTField.setBounds(0, 0, 91, 73);
		
		arrivalTimeLabel = new JLabel("Enter the Arrival Time:");
		arrivalTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		arrivalTimeLabel.setBounds(101, 22, 155, 24);
		
		burstTimeLabel = new JLabel("Enter the Burst Time:");
		burstTimeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		burstTimeLabel.setBounds(101, 57, 155, 24);
		
		priorityLabel = new JLabel("Enter the Priority:");
		priorityLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		priorityLabel.setBounds(101, 92, 124, 24);
		
		arrivalTField = new JTextField(40);
		arrivalTField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		arrivalTField.setBounds(254, 23, 52, 23);
		
		burstTField = new JTextField(40);
		burstTField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		burstTField.setBounds(254, 57, 52, 23);
		
		priorityTField = new JTextField(40);
		priorityTField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		priorityTField.setBounds(222, 92, 52, 23);
		
		nextButton = new JButton("NEXT");
		nextButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		nextButton.setBounds(215, 127, 91, 29);
		nextButton.setBackground(new Color(0x4DAADD));
		nextButton.setForeground(Color.white);
		nextButton.setFocusable(false);
		nextButton.addActionListener(this);
		
		mainButton = new JButton("RETURN");
		mainButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		mainButton.setBounds(101, 127, 101, 29);
		mainButton.setBackground(new Color(0x4DAADD));
		mainButton.setForeground(Color.white);
		mainButton.setFocusable(false);
		mainButton.addActionListener(this);

        frame.add(pane);
		
		pane.add(pTitleTField);
		pane.add(arrivalTimeLabel);
		pane.add(burstTimeLabel);
		pane.add(priorityLabel);
		pane.add(arrivalTField);
		pane.add(burstTField);
		pane.add(priorityTField);
		pane.add(nextButton);
		pane.add(mainButton);
		
		frame.setBounds(100, 100, 329, 198);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public void ClearInput() {
		arrivalTField.setText(null);
		burstTField.setText(null);
		priorityTField.setText(null);
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
	public boolean IsNotEmpty(String val) {
		if(val != null)
			return true;
		else
			return false;
	}
	public boolean CheckSubInput() {
		try {
			String tempATime = arrivalTField.getText();
			String tempBTime = burstTField.getText();
			String tempPLevel = priorityTField.getText();
			if((IsNotEmpty(tempATime) && isNumber(tempATime)) && (IsNotEmpty(tempBTime) && isNumber(tempBTime)) && (IsNotEmpty(tempPLevel) && isNumber(tempPLevel)))
				return true;
			else
				return false;
			} catch(Exception a) {
				return false;
			}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nextButton) {
			int tempATime = 0;
			int tempBTime = 0;
			int tempPLevel = 0;
			if(CheckSubInput()) {
				tempATime = Integer.parseInt(arrivalTField.getText());
				tempBTime = Integer.parseInt(burstTField.getText());
				tempPLevel = Integer.parseInt(priorityTField.getText());
				if(tempBTime > 0) {
					ctr++;
					operations.InputValuesLoop(ctr, tempATime, tempBTime, tempPLevel, operations);
					frame.dispose();
				}
			} else
				ClearInput();
		}
		if(e.getSource()==mainButton) {
			new MainGUI(operations);
			frame.dispose();
		}
	}
}
