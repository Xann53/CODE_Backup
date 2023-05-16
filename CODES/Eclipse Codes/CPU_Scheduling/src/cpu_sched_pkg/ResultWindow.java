package cpu_sched_pkg;

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
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ResultWindow extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	Container pane = new Container();
	JLabel averageTTLabel, averageWTLabel;
	JTextField averageTTOutput, averageWTOutput;
	JScrollPane scrollPane;
	JTable table;
	JButton backButton;
	SchedulingOperations operations;
	
	public ResultWindow(String[][] finalResult, double averageTT, double averageWT, SchedulingOperations operations) {
		this.operations = operations;
		String[] column = {"Process ID", "Turnaround", "Waiting"};
		
		frame.setTitle("CPU Scheduling Simulator");
		
		table =new JTable(finalResult, column);
		table.setRowHeight(20);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    table.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    
	    try {
			TableColumnModel columnModel = table.getColumnModel();
			int totalCulomn = columnModel.getColumnCount();
			for(int i = 0; i < totalCulomn; i++) {
				TableColumn allColumn = columnModel.getColumn(i);
				allColumn.setPreferredWidth(79);
			}
			TableColumn allColumn = columnModel.getColumn(0);
			allColumn.setPreferredWidth(100);
	    } catch(Exception a) {}
	    
	    scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 261, 136);
	    scrollPane.setViewportView(table);
	    
	    averageTTLabel = new JLabel("Average Turnaround Time:");
	    averageTTLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    averageTTLabel.setBounds(10, 158, 183, 24);
	    
	    averageWTLabel = new JLabel("Average Waiting Time:");
	    averageWTLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    averageWTLabel.setBounds(10, 193, 183, 24);
	    
	    averageTTOutput = new JTextField(40);
	    averageTTOutput.setText(averageTT + "");
	    averageTTOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    averageTTOutput.setEditable(false);
		averageTTOutput.setBounds(203, 159, 68, 23);
		
		averageWTOutput = new JTextField(40);
	    averageWTOutput.setText(averageWT + "");
		averageWTOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		averageWTOutput.setEditable(false);
		averageWTOutput.setBounds(203, 194, 68, 23);
		
		backButton = new JButton("BACK");
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		backButton.setBounds(180, 233, 91, 29);
		backButton.setBackground(new Color(0x4DAADD));
		backButton.setForeground(Color.white);
		backButton.setFocusable(false);
		backButton.addActionListener(this);
		
		frame.add(pane);
		
		pane.add(scrollPane);
		pane.add(averageTTLabel);
		pane.add(averageWTLabel);
		pane.add(averageTTOutput);
		pane.add(averageWTOutput);
		pane.add(backButton);
		
		frame.setBounds(100, 100, 289, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==backButton)
			frame.dispose();
	}
}
