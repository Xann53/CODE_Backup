import java.util.Scanner;
public class Check
{
    public static void main(String [] args)
    {
        Scanner inpt = new Scanner(System.in);
        
        double kilogram, meter, mile, feet, kilometer;
        
        System.out.print("Enter a value in Kilogram: ");
        kilogram=inpt.nextDouble();
        System.out.print("Enter a value in Meter: ");
        meter=inpt.nextDouble();
        System.out.print("Enter a value in Mile: ");
        mile=inpt.nextDouble();
        System.out.print("Enter a value in Feet: ");
        feet=inpt.nextDouble();
        System.out.print("Enter a value in Kilometer: ");
        kilometer=inpt.nextDouble();
        
        System.out.println("\nThe conversion of kilogram/s to gram/s is "+ String.format("%.2f", KilogramToGram(kilogram)));
    }
    public static double KilogramToGram(double kilogram)
    {
        double gram;
        gram = kilogram * 1000;
        
        return gram;
    }
}