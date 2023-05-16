package ooprog_gui_grouph;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Personal_Info extends JFrame implements ActionListener {

    public static void main(String[] args) {
        Personal_Info pInfo = new Personal_Info();
    }
    JLabel lName, fName, mName, add, bDate, PoB, gen, cStat, ctzn;
    static JTextField tLName, tFName, tMName, tAdd, tPoB, tOt;
    static JComboBox day, month, year;
    String d[] = new String[31];
    String mt[] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static JCheckBox filC, dualC, bBirth, bNat;
    static JCheckBox sgl, mrd, wdwd, sprt, ot;
    static JRadioButton m, fm;
    JButton prt, clr, x;
    JPanel pan = new JPanel();
    JProgressBar p;
    int i;

    public Personal_Info() {

        ButtonGroup gender = new ButtonGroup();
        ButtonGroup ctzp1 = new ButtonGroup();
        ButtonGroup citizenship2 = new ButtonGroup();
        ButtonGroup cStatus = new ButtonGroup();
        setTitle("Personal Information");
        lName = new JLabel("Last Name:    ");
        lName.setBounds(10, 20, 80, 25);
        fName = new JLabel("First Name:   ");
        fName.setBounds(10, 70, 80, 25);
        mName = new JLabel("Middle Name:  ");
        mName.setBounds(10, 120, 100, 25);
        add = new JLabel("Address:      ");
        add.setBounds(10, 170, 80, 25);
        bDate = new JLabel("Birth Date:   ");
        bDate.setBounds(350, 20, 80, 25);
        PoB = new JLabel("Place of Birth");
        PoB.setBounds(350, 70, 80, 25);
        gen = new JLabel("Gender:       ");
        gen.setBounds(350, 120, 80, 25);
        cStat = new JLabel("Civil Status: ");
        cStat.setBounds(350, 170, 80, 25);
        ctzn = new JLabel("Citizenship:  ");
        ctzn.setBounds(10, 220, 80, 25);
        tLName = new JTextField(15);
        tLName.setBounds(120, 20, 165, 25);
        tFName = new JTextField(15);
        tFName.setBounds(120, 70, 165, 25);
        tMName = new JTextField(15);
        tMName.setBounds(120, 120, 165, 25);
        tAdd = new JTextField(15);
        tAdd.setBounds(120, 170, 165, 25);
        tPoB = new JTextField(15);
        tPoB.setBounds(450, 70, 165, 25);
        tOt = new JTextField(15);
        tOt.setBounds(540, 230, 100, 20);
        year = new JComboBox();
        year.setBounds(600, 20, 60, 25);
        for (int i = 0; i < d.length; i++) {

            String tempD = "" + (i + 1);
            d[i] = tempD;

        }
        Calendar now = Calendar.getInstance();
        int Cy = now.get(Calendar.YEAR);
        Vector v = new Vector();
        for (int i = 1900; i <= Cy; i++) {
            v.add(i);

        }
        year.setModel(new DefaultComboBoxModel(v));
        year.setSelectedItem(Cy);
        day = new JComboBox(d);
        day.setBounds(450, 20, 45, 25);
        month = new JComboBox(mt);
        month.setBounds(500, 20, 95, 25);
        filC = new JCheckBox("Filipino");
        filC.setBounds(115, 220, 70, 25);
        dualC = new JCheckBox("Dual Citizenship");
        dualC.setBounds(190, 220, 165, 25);
        bBirth = new JCheckBox("By Birth");
        bBirth.setBounds(190, 250, 85, 25);
        bNat = new JCheckBox("By Naturalization");
        bNat.setBounds(275, 250, 125, 25);
        sgl = new JCheckBox("Single");
        sgl.setBounds(445, 170, 65, 25);
        mrd = new JCheckBox("Married");
        mrd.setBounds(540, 170, 75, 25);
        wdwd = new JCheckBox("Widowed");
        wdwd.setBounds(445, 200, 80, 25);
        sprt = new JCheckBox("Separate");
        sprt.setBounds(540, 200, 80, 25);
        ot = new JCheckBox("Other/s :");
        ot.setBounds(445, 230, 85, 20);
        m = new JRadioButton("Male");
        m.setBounds(445, 120, 65, 25);
        fm = new JRadioButton("Female");
        fm.setBounds(515, 120, 75, 25);
        prt = new JButton("Print");
        prt.setBounds(185, 300, 85, 25);
        clr = new JButton("Clear");
        clr.setBounds(285, 300, 85, 25);
        x = new JButton("Exit");
        x.setBounds(385, 300, 85, 25);
        p = new JProgressBar(0, 20);
        p.setBounds(245, 350, 165, 5);

        add(pan);
        pan.add(p);
        pan.add(lName);
        pan.add(tLName);
        pan.add(bDate);
        pan.add(day);
        pan.add(month);
        pan.add(year);
        pan.add(fName);
        pan.add(tFName);
        pan.add(PoB);
        pan.add(tPoB);
        pan.add(mName);
        pan.add(tMName);
        pan.add(gen);
        pan.add(m);
        pan.add(fm);
        pan.add(add);
        pan.add(tAdd);
        pan.add(cStat);
        pan.add(sgl);
        pan.add(mrd);
        pan.add(wdwd);
        pan.add(sprt);
        pan.add(ot);
        pan.add(tOt);
        pan.add(ctzn);
        pan.add(filC);
        pan.add(dualC);
        pan.add(bBirth);
        pan.add(bNat);
        pan.add(prt);
        pan.add(clr);
        pan.add(x);

        cStatus.add(sgl);
        cStatus.add(mrd);
        cStatus.add(wdwd);
        cStatus.add(sprt);
        cStatus.add(ot);
        ctzp1.add(filC);
        ctzp1.add(dualC);
        citizenship2.add(bBirth);
        citizenship2.add(bNat);
        gender.add(m);
        gender.add(fm);

        Timer t = new Timer(100, this);
        prt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });

        clr.addActionListener(function -> {
            tLName.setText(null);
            System.out.println(tLName.getText());
            tFName.setText(null);
            System.out.println(tFName.getText());
            tMName.setText(null);
            System.out.println(tMName.getText());
            tAdd.setText(null);
            tPoB.setText(null);
            System.out.println(tPoB.getText());
            tOt.setText(null);
            System.out.println(tOt.getText());
        });
        x.addActionListener(function -> {
            setVisible(false);
        });

        pan.setLayout(null);
        setVisible(true);
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (i == 20) {
            new Print();
            dispose();
        }
        i++;
        p.setValue(i);
    }
}
