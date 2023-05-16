 

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class MainGUI extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	Container pane = new Container();
	JLabel titleLabel, processLabel, methodLabel, algorithmLabel, ganttChartLabel, arrivalTimeLabel, burstTimeLabel, priorityLabel;
	JTextField processTField, arrivalTField, burstTField, priorityTField, pTitleTField;
	ButtonGroup methodChoiceGroup;
	JComboBox<String> algorithmComboBox;
	JRadioButton preemptiveMethod, nonpreemptiveMethod, cancelChoiceMethod;
	JScrollPane scrollPane;
	JTable table;
	JButton okayButton, clearButton, nextButton;
	
	String[] process, ganttChart, tempQueueProcess;
    int[] arrivalTime, burstTime, priority, tempQueuePriority, tempQueueBurst;
    int arrivingProcess, runningPriority = 0, runningBurst = 0;
    String runningProcess = "*", schedMethod, choiceAlgorithm;
    ReadyQueue head, end;
	
	public MainGUI() {
		frame.setTitle("CPU Scheduling Simulator");
		
		titleLabel = new JLabel("CPU SCHEDULING");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 15));    
		titleLabel.setForeground(new Color(0x0253B3));
		titleLabel.setBounds(262, 11, 140, 23);
		
		processLabel = new JLabel("Enter number of processes:");
		processLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));    
		processLabel.setForeground(new Color(0x0253B3));
		processLabel.setBounds(10, 47, 191, 23);
		
		methodLabel = new JLabel("Select scheduling method:");
		methodLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));    
		methodLabel.setForeground(new Color(0x0253B3));
		methodLabel.setBounds(10, 81, 191, 23);
		
		algorithmLabel = new JLabel("Select scheduling algorithm:");
		algorithmLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));    
		algorithmLabel.setForeground(new Color(0x0253B3));
		algorithmLabel.setBounds(10, 115, 191, 23);
		
		ganttChartLabel = new JLabel("GANTT CHART");
		ganttChartLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));    
		ganttChartLabel.setForeground(new Color(0x0253B3));
		ganttChartLabel.setBounds(275, 157, 104, 23);
		
		processTField = new JTextField(40);
		processTField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		processTField.setBounds(201, 47, 52, 23);
		
		preemptiveMethod = new JRadioButton("Preemptive");
		preemptiveMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		preemptiveMethod.setBounds(188, 81, 104, 23);
		preemptiveMethod.addActionListener(this);
		
		nonpreemptiveMethod = new JRadioButton("Non-preemptive");
		nonpreemptiveMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nonpreemptiveMethod.setBounds(292, 81, 135, 23);
		nonpreemptiveMethod.addActionListener(this);
		
		cancelChoiceMethod = new JRadioButton();
		
		methodChoiceGroup = new ButtonGroup();
		methodChoiceGroup.add(preemptiveMethod);
		methodChoiceGroup.add(nonpreemptiveMethod);
		methodChoiceGroup.add(cancelChoiceMethod);
		
		algorithmComboBox = new JComboBox<String>();
		algorithmComboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		algorithmComboBox.setSelectedItem("");
		algorithmComboBox.setBounds(201, 115, 191, 22);
		
		table =new JTable();
		table.setRowHeight(20);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    table.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    
	    try {
			TableColumnModel columnModel = table.getColumnModel();
			int totalCulomn = columnModel.getColumnCount();
			for(int i = 0; i < totalCulomn; i++) {
				TableColumn allColumn = columnModel.getColumn(i);
				allColumn.setPreferredWidth(30);
			}
			TableColumn allColumn = columnModel.getColumn(0);
			allColumn.setPreferredWidth(60);
	    } catch(Exception a) {}
	    
	    scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 191, 634, 180);
	    scrollPane.setViewportView(table);
	    
	    clearButton = new JButton("CLEAR");
	    clearButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	    clearButton.setBounds(452, 382, 91, 29);
	    clearButton.setBackground(new Color(0x4DAADD));
	    clearButton.setForeground(Color.white);
	    clearButton.setFocusable(false);
	    clearButton.addActionListener(this);
	    
	    okayButton = new JButton("OKAY");
	    okayButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	    okayButton.setBounds(553, 382, 91, 29);
	    okayButton.setBackground(new Color(0x4DAADD));
	    okayButton.setForeground(Color.white);
	    okayButton.setFocusable(false);
	    okayButton.addActionListener(this);
		
		frame.add(pane);
		
		pane.add(titleLabel);
		pane.add(processLabel);
		pane.add(methodLabel);
		pane.add(algorithmLabel);
		pane.add(ganttChartLabel);
		pane.add(processTField);
		pane.add(preemptiveMethod);
		pane.add(nonpreemptiveMethod);
		pane.add(algorithmComboBox);
		pane.add(scrollPane);
		pane.add(clearButton);
		pane.add(okayButton);
		
		frame.setBounds(100, 100, 662, 449);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBackground(new Color(255, 255, 255));
	}
	public MainGUI(int i, String[] processID) {
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
		
		frame.add(pane);
		
		pane.add(pTitleTField);
		pane.add(arrivalTimeLabel);
		pane.add(burstTimeLabel);
		pane.add(priorityLabel);
		pane.add(arrivalTField);
		pane.add(burstTField);
		pane.add(priorityTField);
		pane.add(nextButton);
		
		frame.setBounds(100, 100, 329, 198);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setBackground(new Color(255, 255, 255));
	}
	public void ChoosePreemptive() {
		algorithmComboBox.removeAllItems();
		algorithmComboBox.addItem("Shortest Job First");
		algorithmComboBox.addItem("Priority Scheduling");
		algorithmComboBox.addItem("Round Robin Scheduling");
		algorithmComboBox.addItem("");
		algorithmComboBox.setSelectedItem("");
	}
	public void ChooseNonpreemptive() {
		algorithmComboBox.removeAllItems();
		algorithmComboBox.addItem("First Come First Serve");
		algorithmComboBox.addItem("Shortest Job First");
		algorithmComboBox.addItem("Priority Scheduling");
		algorithmComboBox.addItem("");
		algorithmComboBox.setSelectedItem("");
	}
	public void ClearInput() {
		processTField.setText(null);
		preemptiveMethod.setSelected(false);
		nonpreemptiveMethod.setSelected(false);
		cancelChoiceMethod.setSelected(true);
		algorithmComboBox.removeAllItems();
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
	public boolean CheckMainInput() {
		try {
		String tempProcessNum = processTField.getText();
		String tempAlgorithm = algorithmComboBox.getSelectedItem().toString();
		if((IsNotEmpty(tempProcessNum) && isNumber(tempProcessNum)) && IsNotEmpty(tempAlgorithm) && algorithmComboBox.getSelectedItem() != "")
			return true;
		else
			return false;
		} catch(Exception a) {
			return false;
		}
	}
	/*public boolean CheckSubInput() {
		
	}*/
	public void InputValues() {
		schedMethod = null;
		choiceAlgorithm = null;
		
		String tempNumOfProcess = processTField.getText();
		choiceAlgorithm = algorithmComboBox.getSelectedItem().toString();
		if(preemptiveMethod.isSelected())
			schedMethod = "Preemptive";
		else if(nonpreemptiveMethod.isSelected())
			schedMethod = "Non-preemptive";
		
		int numOfProcess = Integer.parseInt(tempNumOfProcess);
		process = new String[numOfProcess];
        arrivalTime = new int[numOfProcess];
        burstTime = new int[numOfProcess];
        priority = new int[numOfProcess];
        
        for(int i = 0, tempNum = 1; i < process.length; i++) //Assign the processes their ID
            process[i] = "P" + tempNum++;
        for(int i = 0; i < process.length; i++) { //Assign the AT, BT, and PL of each process
            new MainGUI(i, process);
        }
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==preemptiveMethod)
			ChoosePreemptive();
		if(e.getSource()==nonpreemptiveMethod) 
			ChooseNonpreemptive();
		if(e.getSource()==clearButton)
			ClearInput();
		if(e.getSource()==okayButton) {
			if(CheckMainInput())
				InputValues();
			else
				ClearInput();
		}
		if(e.getSource()==nextButton) {
			frame.dispose();
		}
	}
	public static void main(String[] args) {
		new MainGUI();
	}
}
