/**
 * Write a description of class TwoDArraySample01 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TwoDArraySample01 {
    static Scanner scan = new Scanner (System.in);
    public static void main () {
        double [][] sales = new double [4][3];
        double [] sumRows = new double [sales.length];
        double [] sumCols = new double [sales.length];
       
        inputValues (sales);                        
        displayValues (sales);
       
        sumOfRowValues (sales, sumRows);
        sumOfColValues (sales, sumCols);
    }
   
    public static void inputValues (double [][] s) {
       
        System.out.println ("\fInput sales: ");
        for (int row=0; row < s.length; row++) {
            for (int col=0; col < s[row].length; col++) {
                System.out.print ("Sales [" + row + "][" + col +"]: ");
                //s[row][col] = scan.nextDouble();
                s[row][col] = ((Math.random() * (100)));
                System.out.println (s[row][col]);
            }
        }
    }//end of inputValues method
   
    public static void displayValues (double [][] s) {
       
        System.out.println ("\n\nSales Values: ");
        for (int row=0; row < s.length; row++) {
            for (int col=0; col < s[row].length; col++) {
                System.out.printf ("%-7.2f ", s[row][col]);
            }
            System.out.println ();
        }
    }//end of displayValues method
    
    public static void sumOfRowValues (double [][] s, double [] sumRows) {
        for (int row = 0; row < s.length; row++){
            double temp = 0;
            for (int col = 0; col < s[row].length; col++){
                temp += s[row][col];                
            }
            sumRows[row] = temp;
            System.out.print("Sum of row " + (row+1) + " " + sumRows[row]);
            System.out.println();
        }
    }
    
    public static void sumOfColValues (double [][] s, double [] sumCols) {
        for (int col = 0; col < s[col].length; col++){
            double temp = 0;
            for (int row = 0; row < s.length; row++){
                temp += s[row][col];                
            }
            sumCols[col] = temp;
            System.out.print("Sum of col " + (col+1) + " " + sumCols[col]);
            System.out.println();
        }
    }
}