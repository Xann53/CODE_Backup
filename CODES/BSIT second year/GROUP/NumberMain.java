import java.util.Scanner;
import java.util.*;
public class NumberMain
{
    final static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        boolean continueLoop = true;
        while(continueLoop == true)
        {
            try
            {
                Number alpha = new Number();
                Number charlie = new Number();
                System.out.println("OBJECT ALPHA IS SET TO DEFAULT VALUES...");
                
                System.out.println("\nPLEASE SET VALUES FOR OBJECT BETA");
                System.out.print("Enter a whole number: ");
                int num1 = input.nextInt();
                System.out.print("Enter a decimal fraction: ");
                double num2 = input.nextDouble();
                Number beta = new Number(num1, num2);
                
                System.out.println("\nPLEASE SET VALUES FOR OBJECT CHARLIE");
                System.out.print("Enter a whole number: ");
                num1 = input.nextInt();
                System.out.print("Enter a decimal fraction: ");
                num2 = input.nextDouble();
                charlie.setFirstNum(num1);
                charlie.setSecondNum(num2);
                
                System.out.println();
                System.out.println("VALUES OF OBJECT ALPHA:");
                System.out.println("First Number: "+ alpha.getFirstNum());
                System.out.println("Second Number: " + alpha.getSecondNum());
                System.out.println("Sum: " + alpha.sum());
                System.out.println("Average: " + alpha.average());
                System.out.println("Binary: " + alpha.convertToBinary());
                System.out.println("Hexadecimal: " + alpha.convertToHexa());
                
                System.out.println();
                System.out.println("VALUES OF OBJECT BETA:");
                System.out.println("First Number: "+ beta.getFirstNum());
                System.out.println("Second Number: " + beta.getSecondNum());
                System.out.println("Sum: " + beta.sum());
                System.out.println("Average: " + beta.average());
                System.out.println("Binary: " + beta.convertToBinary());
                System.out.println("Hexadecimal: " + beta.convertToHexa());
                
                System.out.println();
                System.out.println("VALUES OF OBJECT CHARLIE:");
                System.out.println("First Number: "+ charlie.getFirstNum());
                System.out.println("Second Number: " + charlie.getSecondNum());
                System.out.println("Sum: " + charlie.sum());
                System.out.println("Average: " + charlie.average());
                System.out.println("Binary: " + charlie.convertToBinary());
                System.out.println("Hexadecimal: " + charlie.convertToHexa());
                
                System.out.print("\nWould you like to continue?(yes or no):");
                input.nextLine();
                String choice = input.nextLine();
                if(choice.equalsIgnoreCase("No"))
                    continueLoop = false;
                else
                    System.out.print("\f");
            }
            catch(InputMismatchException e)
            {
                System.out.println("\fInvalid Input\n");
                input.next();
            }
        }
        System.out.print("\f");
    }
}