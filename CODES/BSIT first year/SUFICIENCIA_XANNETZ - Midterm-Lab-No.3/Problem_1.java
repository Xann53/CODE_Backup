import java.util.Scanner;
public class Problem_1
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of terms of series: ");
        int inpt = input.nextInt();
        int result = 1;
        System.out.println("\nFibonacci Series: ");
        
        if(inpt > 0)
        {
            for(int ctr = 0; ctr < inpt; ctr++)
            {
                int num1 = result;
                int num2 = num1;
                result = num1 + num2;
                
                System.out.print(result + " ");
            }
        }
    }
}