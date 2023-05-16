import java.util.Scanner;
public class second_check
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double value=input.nextDouble();
        double ans = toMilesPerHour(value);
        printConversion(value, ans);
    }
    public static double toMilesPerHour(double KilometerPerHour)
    {
        double MPH = KilometerPerHour / 1.609;
        return MPH;
    }
    public static void printConversion(double KilometerPerHour, double MilesPerHour)
    {
        System.out.println("The conversion of " + KilometerPerHour + " is equals to " + String.format("%.2f", MilesPerHour));
    }
}