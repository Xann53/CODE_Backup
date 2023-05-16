import java.util.Scanner;
public class TwoDArraySample02
{
    static Scanner scan = new Scanner (System.in);
    public static void main () {
        double [][] sales = new double [6][6];
        double [] sumRows = new double [sales.length];
        double [] sumCols = new double [sales.length];
        double temp1 = 0, temp2 = 0, temp3 = 0;
        inputValues (sales);                        
        displayValues (sales);
        System.out.println();
        sumOfRowValues (sales, sumRows);
        System.out.println();
        sumOfColValues (sales, sumCols);
        System.out.println();
        temp1 = LRDiagonal (sales);
        temp2 = RLDiagonal (sales);
        System.out.printf("Sum of the two diagonals: " + "%-7.2f ", (temp1 + temp2));
        System.out.println("\n");
        smallest (sales);
        System.out.println();
        largest (sales);
    }
    public static void inputValues (double [][] s) {
        System.out.println ("\fInput sales: ");
        for (int row=0; row < s.length; row++) {
            for (int col=0; col < s[row].length; col++) {
                System.out.print ("Sales [" + row + "][" + col +"]: ");
                s[row][col] = ((Math.random() * (100)));
                System.out.printf ("%-7.2f ", s[row][col]);
                System.out.println();
            }
        }
    }
    public static void displayValues (double [][] s) {
        System.out.println ("\n\nSales Values: ");
        for (int row=0; row < s.length; row++) {
            for (int col=0; col < s[row].length; col++) {
                System.out.printf ("%-7.2f ", s[row][col]);
            }
            System.out.println ();
        }
    }
    public static void sumOfRowValues (double [][] s, double [] sumRows) {
        for (int row = 0; row < s.length; row++){
            double temp = 0;
            for (int col = 0; col < s[row].length; col++){
                temp += s[row][col];                
            }
            sumRows[row] = temp;
            System.out.printf("Sum of row " + (row+1) + ": " + "%-7.2f ", sumRows[row]);
            System.out.println();
        }
    }
    public static void sumOfColValues (double [][] s, double [] sumCols) {
        for (int col = 0; col < s[0].length; col++){
            double temp = 0;
            for (int row = 0; row < s.length; row++){
                temp += s[row][col];                
            }
            sumCols[col] = temp;
            System.out.printf("Sum of col " + (col+1) + ": " + "%-7.2f ", sumCols[col]);
            System.out.println();
        }
    }
    public static double LRDiagonal (double [][] s) {
        double temp = 0;
        for (int row = 0; row < s.length; row++){
            for (int col = 0; col < s[row].length; col++){
                if(row == col)
                    temp += s[row][col];
            }
        }
        System.out.printf("Left to right diagonal: " + "%-7.2f ", temp);
        System.out.println();
        return temp;
    }
    public static double RLDiagonal (double [][] s) {
        double temp = 0;
        for (int row = 0; row < s.length; row++){
            for (int col = 0; col < s[row].length; col++){
                if(row + col == (s[row].length - 1))
                    temp += s[row][col];
            }
        }
        System.out.printf("Right to left diagonal: " + "%-7.2f ", temp);
        System.out.println();
        return temp;
    }
    public static void smallest (double [][] s) {
        for (int row = 0; row < s.length; row++){
            double temp = s[row][0];
            for (int col = 0; col < s[row].length; col++){
                if(temp > s[row][col])
                    temp = s[row][col];
            }
            System.out.printf("Smallest in row " + (row+1) + ": " + "%-7.2f ", temp);
            System.out.println();
        }
    }
    public static void largest (double [][] s) {
        for (int col = 0; col < s[0].length; col++){
            double temp = 0;
            for (int row = 0; row < s.length; row++){
                if(temp < s[row][col])
                    temp = s[row][col];             
            }
            System.out.printf("Largest in col " + (col+1) + ": " + "%-7.2f ", temp);
            System.out.println();
        }
    }
}