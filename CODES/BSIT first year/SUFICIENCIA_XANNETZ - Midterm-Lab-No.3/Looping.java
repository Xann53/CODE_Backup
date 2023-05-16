import java.util.Scanner;
public class Looping
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String retry;
        
        do
        {
            System.out.print("\f");
            System.out.print("Enter loop range: ");
            long range = input.nextLong();
            long exponent = 1;
            long exponent_r = range / 2;
            long totalSumOdd = 0, totalSumEven = 0;
            
            for(long ctr=1; ctr <= range; ctr++)
            {
                if(ctr % 2 != 0)
                {
                    long base = ctr;

                    long result = 1;

                    for (long exponent_ctr=0; exponent_ctr < exponent; exponent_ctr++)
                    {
                        result *= base;
                    }
                    
                    System.out.println(base + "^" + exponent + " = " + result);
                    exponent++;
                    totalSumOdd += result;
                }
                else if(ctr % 2 == 0)
                {
                    long base = ctr;

                    long result = 1;

                    for (long exponent_ctr=0; exponent_ctr < exponent_r; exponent_ctr++)
                    {
                        result *= base;
                    }

                    System.out.println(base + "^" + exponent_r + " = " + result);
                    exponent_r--;
                    totalSumEven += result;
                }
            }
            
            System.out.println("\nThe sum of ODD increasing power is: " + totalSumOdd);
            System.out.println("The sum of EVEN increasing power is: " + totalSumEven);
            
            System.out.println("\nWould you like to try again? yes or no");
            retry = input.next();
        }
        while(retry.equalsIgnoreCase("yes"));
        
        System.out.print("\f");
    }
}