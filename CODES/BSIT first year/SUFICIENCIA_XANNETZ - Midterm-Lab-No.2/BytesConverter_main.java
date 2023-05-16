import java.util.Scanner;
public class BytesConverter_main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        BytesConverter Convert = new BytesConverter();
        
        String retry;
        
        do
        {
            System.out.println("\f");
            System.out.print("Enter value in bytes: ");
            long bytes = input.nextLong();
            System.out.println("\nChoose Conversion:");
            System.out.println("1 - Bytes to Kilobytes");
            System.out.println("2 - Bytes to Megabytes");
            System.out.println("3 - Bytes to Gigabytes");
            System.out.print("\nEnter the number of your choice: ");
            int choice = input.nextInt();
            
            if(bytes >= 0)
            {
                switch (choice)
                {
                    case 1:
                        Convert.convertKilobytes(bytes);
                        break;
                    case 2:
                        Convert.convertMegabytes(bytes);
                        break;
                    case 3:
                        Convert.convertGigabytes(bytes);
                        break;
                    default:
                        System.out.println("\nChoice entered is invalid.");
                }
            }
            else
            {
                System.out.println("\nValue entered is invalid.");
            }
            
            System.out.println("\nWould you like to try again? yes or no");
            retry = input.next();
        }
        while(retry.equalsIgnoreCase("yes"));
        System.out.println("\f");
    }
}