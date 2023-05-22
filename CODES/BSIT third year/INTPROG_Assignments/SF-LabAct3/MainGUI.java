import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class MainGUI implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel titleLbl, txt1Lbl;
    private JTextField urlTxtFld;
    private JTextArea outputTxtArea;
    private JScrollPane outputPane;
    private JButton loadBtn, exitBtn;
    
    public MainGUI() {
        panel.setLayout(null);
        
        titleLbl = new JLabel("URL TEXT EXTRACTOR");
        titleLbl.setFont(new Font("Arial",Font.BOLD,14));
        titleLbl.setBounds(263, 15, 300, 15);
        
        txt1Lbl = new JLabel("Type URL Link");
        txt1Lbl.setFont(new Font("Arial",Font.BOLD,11));
        txt1Lbl.setBounds(60, 50, 150, 12);
        
        urlTxtFld = new JTextField();
        urlTxtFld.setBounds(150, 46, 390, 20);
        
        outputTxtArea = new JTextArea();
        outputTxtArea.setEditable(false);
        outputTxtArea.setLineWrap(true);
        outputTxtArea.setWrapStyleWord(true);
        
        outputPane = new JScrollPane(outputTxtArea);
        outputPane.setBounds(60, 90, 574, 340);
        
        loadBtn = new JButton("LOAD");
        loadBtn.setBounds(540, 46, 93, 20);
        loadBtn.addActionListener(this);
        
        exitBtn = new JButton("EXIT");
        exitBtn.setBounds(310, 450, 93, 20);
        exitBtn.addActionListener(this);
        
        panel.add(titleLbl);
        panel.add(txt1Lbl);
        panel.add(urlTxtFld);
        panel.add(outputPane);
        panel.add(loadBtn);
        panel.add(exitBtn);
        
        frame.add(panel);
        frame.setSize(710, 520);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String ReadOutput() {
    	String tempOut = null, tempFinal = null;
    	try {
        	FileReader readFile = new FileReader("data.txt");
    		BufferedReader lineReader = new BufferedReader(readFile);
    		tempOut = lineReader.readLine();
    		while(tempOut != null) {
    			tempFinal = tempFinal + "/n" + tempOut;
    			tempOut = lineReader.readLine();
    		}
    		lineReader.close();
    	} catch(Exception a) {
    		a.getStackTrace();
    	}
    	return tempFinal;
    }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==exitBtn){
            System.exit(0);
        }
    	if(e.getSource()==loadBtn) {
    		try {
                BufferedWriter output = new BufferedWriter(new FileWriter("data.txt"));
                String tempURL = urlTxtFld.getText();
                URL url = new URL(tempURL);

                URLConnection connection = url.openConnection();

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                	output.write(line + "\n");
                }
                reader.close();
                output.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    		outputTxtArea.setText(ReadOutput());
    	}
    }
    public static void main(String[] args) {
        new MainGUI();
    }
}