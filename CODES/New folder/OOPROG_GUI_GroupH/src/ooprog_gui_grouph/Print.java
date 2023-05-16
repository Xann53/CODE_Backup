
package ooprog_gui_grouph;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Print extends JFrame implements ActionListener  
{
    
    JLabel Name, add, bDate, PoB, gen, cStat, ctzn,
           tName,tAdd, tbDate, tPoB, tGen, tCiStat,tCtzn;
    JButton back, x;
    JPanel pan = new JPanel();
    JProgressBar p;
    int i ;
    Timer t;
    public Print(){
        setTitle("Personal Information - Print");
        
        Name = new JLabel("Name:");
        Name.setBounds(10, 20, 80, 25);
        tName = new JLabel();
        tName.setBounds(80, 20, 165, 25);
        String finalName = Personal_Info.tLName.getText()+" "+Personal_Info.tFName.getText()+
                   " "+Personal_Info.tMName.getText();
        tName.setText(finalName);
        System.out.println(tName.getText());
        
        
        add = new JLabel("Address:");
        add.setBounds(10, 70, 80, 25);
        tAdd = new JLabel();
        tAdd.setBounds(80, 70, 165, 25);
        String finalAdd = Personal_Info.tAdd.getText();
        tAdd.setText(finalAdd);
        System.out.println(tAdd.getText());
        
        bDate = new JLabel("Birth Date:   ");
        bDate.setBounds(10, 120, 80, 25);
        tbDate = new JLabel();
        tbDate.setBounds(80, 120, 165, 25);
        String finalBDate = ""+Personal_Info.month.getSelectedItem()+" "+
                            Personal_Info.day.getSelectedItem()+ ", "+
                            Personal_Info.year.getSelectedItem();
        tbDate.setText(finalBDate);
        System.out.println(tbDate.getText());
        
        gen = new JLabel("Gender:");
        gen.setBounds(10, 170, 80, 25);
        tGen = new JLabel();
        tGen.setBounds(80, 170, 165, 25);
        String finalGender = null;
        if (Personal_Info.m.isSelected()) {
            finalGender = "Male";
        }
        if (Personal_Info.fm.isSelected()) {
            finalGender = "Female";
        }
        tGen.setText(finalGender);
        System.out.println(tGen.getText());
        
        PoB = new JLabel("Place of Birth:");
        PoB.setBounds(350, 20, 80, 25); 
        tPoB = new JLabel();
        tPoB.setBounds(450, 20, 165, 25);
        String finalPoB = ""+Personal_Info.tPoB.getText();
        tPoB.setText(finalPoB);
        System.out.println(tPoB.getText());
        
        cStat = new JLabel("Civil Status:");
        cStat.setBounds(350, 70, 80, 25);
        tCiStat =new JLabel();
        tCiStat.setBounds(450, 70, 165, 25);
        String finalCiStat = null;
        if (Personal_Info.sgl.isSelected()) {
            finalCiStat = "Single";
        }
        if (Personal_Info.mrd.isSelected()) {
            finalCiStat = "Married";
        }
        if (Personal_Info.wdwd.isSelected()) {
            finalCiStat = "Widowed";
        }
        if (Personal_Info.sprt.isSelected()) {
            finalCiStat = "Separate";
        }
        if (Personal_Info.ot.isSelected()) {
            finalCiStat = Personal_Info.tOt.getText();
        }
        tCiStat.setText(finalCiStat);
        System.out.println(tCiStat.getText());
        
        ctzn = new JLabel("Citizenship:");//filC, dualC, bBirth, bNat;
        ctzn.setBounds(350, 120, 80, 25);
        tCtzn = new JLabel();
        tCtzn.setBounds(450, 120, 165, 25);
        String finalCtzn = "";
        if (Personal_Info.filC.isSelected()) {
            finalCtzn = "Filipino";
        }
        if (Personal_Info.dualC.isSelected()) {
            finalCtzn = "Dual Citizenship";
        }
        if (Personal_Info.bBirth.isSelected()) {
            finalCtzn = finalCtzn + " (By Birth)";
        }
        if (Personal_Info.bNat.isSelected()) {
            finalCtzn = finalCtzn + " (By Nationalization)";
        }
        tCtzn.setText(finalCtzn);
        System.out.println(tCtzn.getText());
        
        back = new JButton("Back");
        back.setBounds(220, 220, 85, 25);
        
        x = new JButton("Exit");
        x.setBounds(350, 220, 85, 25);
        
        p = new JProgressBar(0,20);
        p.setBounds(245, 255, 165, 5);
        
        add(pan);          pan.add(p);
        pan.add(Name);    pan.add(tName); 
        pan.add(add);      pan.add(tAdd);
        pan.add(bDate);    pan.add(tbDate);
        pan.add(gen);      pan.add(tGen);
        pan.add(PoB);      pan.add(tPoB);
        pan.add(cStat);    pan.add(tCiStat);
        pan.add(ctzn);     pan.add(tCtzn);
        
        pan.add(back);       pan.add(x);
        
        Timer t = new Timer(100,this );
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });
        
        x.addActionListener(function ->{
            setVisible(false);
            dispose();
        });
        
        
        
        pan.setLayout(null);
        setVisible(true);
        setSize(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }

    
public void actionPerformed(ActionEvent e) {
        if (i == 20) {
            new Personal_Info();
            dispose();
        }
        i++;
        p.setValue(i);
    }

}

    
    
    

