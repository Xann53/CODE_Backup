import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.IOException;
import java.io.File;

public class MainGUI implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel titleLbl, txt1Lbl;
    private JTextField pathTxtFld;
    private JTextArea outputTxtArea;
    private JScrollPane outputPane;
    private JButton loadBtn, exitBtn;
    
    public MainGUI() {
        panel.setLayout(null);
        
        titleLbl = new JLabel("LIST OF FILES");
        titleLbl.setFont(new Font("Arial",Font.BOLD,14));
        titleLbl.setBounds(305, 15, 300, 15);
        
        txt1Lbl = new JLabel("Type File Path");
        txt1Lbl.setFont(new Font("Arial",Font.BOLD,11));
        txt1Lbl.setBounds(60, 50, 150, 12);
        
        pathTxtFld = new JTextField();
        pathTxtFld.setBounds(140, 46, 400, 20);
        
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
        panel.add(pathTxtFld);
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
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitBtn){
            System.exit(0);
        }
        if(e.getSource()==loadBtn) {
            try {
                String tempPath = pathTxtFld.getText();
                File directoryPath = new File(tempPath);
                File filesList[] = directoryPath.listFiles();
                outputTxtArea.setText("List of files and directories in the specified directory:\n\n");
                for(File file : filesList) {
                    outputTxtArea.setText(outputTxtArea.getText() + "File name: "+file.getName() + "\n");
                    outputTxtArea.setText(outputTxtArea.getText() + "File path: "+file.getAbsolutePath() + "\n");
                    outputTxtArea.setText(outputTxtArea.getText() + "Size :"+file.getTotalSpace() + "\n\n");
                }
            } catch(Exception a) {
                outputTxtArea.setText("No Directory Path Entered!");
            }
        }
    }
    public static void main(String[] args) {
        new MainGUI();
    }
}