import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main implements ActionListener{
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    
    public Main() {
        panel.setLayout(null);
        panel.setBackground(Color.white);
        
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
    
    }
    public static void main(String [] args) {
        new Main();
    }
}