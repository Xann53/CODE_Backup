import java.util.Scanner;
public class Items
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n, code[], quantity[];
        String itemName[], description[], retry;
        double price[], itemTotal[], totalAll = 0;
        do
        {
            totalAll = 0;
            System.out.print("\f");
            
            System.out.print("How many items would you like to enter?: ");
            n = input.nextInt();
            itemName = new String[n];
            description = new String[n];
            code = new int[n];
            price = new double[n];
            itemTotal = new double[n];
            quantity = new int[n];
            
            for(int i = 0; i < itemName.length; i++)
            {
                System.out.print("\nEnter item name: ");
                input.nextLine();
                itemName[i] = input.nextLine();
                System.out.print("Enter item description: ");
                description[i] = input.nextLine();
                System.out.print("Enter item code no.: ");
                code[i] = input.nextInt();
                System.out.print("Enter item unit price: ");
                price[i] = input.nextDouble();
                System.out.print("Enter item quantity: ");
                quantity[i] = input.nextInt();
            }
        
            System.out.print("\n\n\t\t---DISPLAY---");
            for(int i = 0; i < itemName.length; i++)
            {
                System.out.print("\nItem name: " + itemName[i]);
                System.out.print("\nItem description: " + description[i]);
                System.out.print("\nItem code no.: " + code[i]);
                System.out.print("\nItem unit price: " + String.format("%.2f", price[i]));
                System.out.print("\nItem quantity: " + quantity[i]);
                itemTotal[i] = price[i] * quantity[i];
                System.out.print("\nTotal item price: " + String.format("%.2f", itemTotal[i]) + "\n");
            }
            
            for(int i = 0; i < itemName.length; i++)
            {
                totalAll = totalAll + itemTotal[i];
            }
            System.out.print("\nOVERALL TOTAL PRICE: " + totalAll + "\n\n");
            System.out.print("\nWould you like to try again?(yes or no): ");
            retry = input.next();
        }
        while(retry.equalsIgnoreCase("YES"));
        System.out.print("\f");
    }
}