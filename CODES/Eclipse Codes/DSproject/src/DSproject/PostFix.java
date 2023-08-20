package DSproject;


import java.awt.Color;

import java.awt.Container;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;


public class PostFix extends JFrame {


    JFrame frame = new JFrame();

    Container pane = getContentPane();

    Container pane1 = getContentPane();

    JLabel titleL, inputL, resultL;

    JTextField inputTF, resultTF;

    JButton evaluateb, clearb, exitb;

    EvaluateButtonHandler evaluateBH;

    ClearButtonHandler clearBH;

    ExitButtonHandler exitBH;

   

    public PostFix() {

        frame.setTitle("Postfix Calculator");

       

        titleL = new JLabel("Postfix Calculator");

        titleL.setFont(new Font("Arial", Font.BOLD, 18));    

        titleL.setForeground(new Color(0x2f5c50));

        titleL.setBounds(110, 1, 200, 40);

        inputL = new JLabel("Input Postfix Expression");

        inputL.setFont(new Font("Arial", Font.PLAIN, 18));

        inputL.setForeground(new Color(0x113450));

        inputL.setBounds(10, 50, 300, 40);

       

        resultL = new JLabel("Postfix Evaluation");

        resultL.setFont(new Font("Arial", Font.PLAIN, 18));

        resultL.setForeground(new Color(0x113450));

        resultL.setBounds(10, 200, 200, 40);

       

        inputTF = new JTextField(40);

        inputTF.setBounds(10, 100, 300, 40);

        resultTF = new JTextField(40);

        resultTF.setBounds(10, 250, 300, 40);

       

        evaluateb = new JButton("Evaluate");

        evaluateBH = new EvaluateButtonHandler();

        evaluateb.addActionListener(clearBH);

        evaluateb.setBounds(50, 150, 100, 20);

        evaluateb.setBackground(Color.white);

        evaluateb.setForeground(new Color(0x805924));

        evaluateb.setFocusable(false);

       

        clearb = new JButton("Clear");

        clearBH = new ClearButtonHandler();

        clearb.addActionListener(clearBH);

        clearb.setBounds(170, 150, 100, 20);

        clearb.setBackground(Color.white);

        clearb.setForeground(new Color(0x805924));

        clearb.setFocusable(false);

       

        exitb = new JButton("Exit");

        exitBH = new ExitButtonHandler();

        exitb.addActionListener(exitBH);

        exitb.setBounds(113, 300, 100, 20);

        exitb.setBackground(Color.white);

        exitb.setForeground(new Color(0x805924));

        exitb.setFocusable(false);

       

        frame.add(pane);

       

        pane.setBackground(new Color(0xf2dab8));

        //pane.setBackground(new Color(0xc0cbff));

       

        pane.add(titleL);

        pane.add(inputL);

        pane.add(inputTF);

       

        pane1.add(evaluateb);

        pane1.add(clearb);

        pane.add(resultL);

        pane.add(resultTF);

        pane.add(exitb);

       

        pane.setLayout(null);

       

        frame.setSize(400, 500);

        frame.setVisible(true);

        frame.setResizable(false);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

       

    }



    private class EvaluateButtonHandler implements ActionListener {


        public void actionPerformed(ActionEvent e) {


            Main postEval = new Main();

             String exp;

             

                exp = inputTF.getText();


                 try {

                     if(!postEval.isValid(exp)) { //check if the expression is valid

                         inputTF.setText(null);

                         resultTF.setText(null);

                 }

                     else

                         resultTF.setText("" + postEval.evaluatePostfix(exp));

                      }

                 catch (Exception ae) {

                         inputTF.setText(null);

                         resultTF.setText(null);

                 }


        }

    }


    private class ClearButtonHandler implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            inputTF.setText(null);

            resultTF.setText(null);

        }

    }


    private class ExitButtonHandler implements ActionListener {

       

        public void actionPerformed(ActionEvent e) {

            System.exit(0);

        }

    }


    public static void main(String[] args) {

        PostFix postfix = new PostFix();

    }

}