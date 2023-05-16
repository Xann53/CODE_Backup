import java.util.Scanner;
public class Input_values
{
    public static void main(String [] args)
    {
        Scanner inpt = new Scanner(System.in);
        
        String retry, operator;
        int value[];
        
        do
        {
            System.out.print("\f");
            
            System.out.print("How many values would you like to input?: ");
            int n = inpt.nextInt();
            value = new int[n];
            
            System.out.println("\nEnter values: ");
            for(int i = 0; i < value.length; i++)
            {
                value[i] = inpt.nextInt();
            }
            
            System.out.println("\nOperations:");
            System.out.println("Addition");
            System.out.println("Subtraction");
            System.out.println("Multiplication");
            System.out.println("Division");
            System.out.print("\nSelect an operation: ");
            operator = inpt.next();
            
            if(operator.equalsIgnoreCase("Addition"))
            {
                int answer = 0;
                for(int i: value)
                {
                    answer = answer + i;
                }
                System.out.println("\nThe total is: " + answer);
            }
            else if(operator.equalsIgnoreCase("Subtraction"))
            {
                int answer = value[0];
                for(int i = 1; i < value.length; i++)
                {
                    answer = answer - value[i];
                }
                System.out.println("\nThe total is: " + answer);
            }
            else if(operator.equalsIgnoreCase("Multiplication"))
            {
                int answer = 1;
                for(int i: value)
                {
                    answer = answer * i;
                }
                System.out.println("\nThe total is: " + answer);
            }
            else if(operator.equalsIgnoreCase("Division"))
            {
                double answer = value[0];
                for(int i = 1; i < value.length; i++)
                {
                    answer = answer / value[i];
                }
                System.out.println("\nThe total is: " + answer);
            }
            
            System.out.println("\nWould you like to try again? yes or no");
            retry = inpt.next();
        }
        while(retry.equalsIgnoreCase("yes"));
        
        System.out.print("\f");
    }
}