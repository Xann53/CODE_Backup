import java.util.Scanner;
public class Nesting
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String sub_menu;
        
        System.out.println("Choose a group:");
        System.out.println("A for Vegetables or Fruits");
        System.out.println("B for Trees or Mountains");
        System.out.println("C for Animals or Nationality");
        
        char menu=input.next().charAt(0);
        
        if(menu == 'a' || menu == 'A')
        {
            System.out.println("\nChoose among Vegetables or Fruits. Enter your choice:");
            sub_menu=input.next();
            
            if(sub_menu.equalsIgnoreCase("vegetables"))
            {
                System.out.println("\n  Okra");
                System.out.println("  Malunggay");
                System.out.println("  Eggplant");
            }
            else if(sub_menu.equalsIgnoreCase("fruits"))
            {
                System.out.println("\n  Orange");
                System.out.println("  Apple");
                System.out.println("  Grapes");
            }
            else
            {
                System.out.println("\n  Invalid");
            }
        }
        else if(menu == 'b' || menu == 'B')
        {
            System.out.println("\nChoose among Trees or Mountain. Enter your choice:");
            sub_menu=input.next();
            
            if(sub_menu.equalsIgnoreCase("trees"))
            {
                System.out.println("\n  Narra");
                System.out.println("  Acacia");
                System.out.println("  Mahogany");
            }
            else if(sub_menu.equalsIgnoreCase("mountain"))
            {
                System.out.println("\n  Mt. Apo");
                System.out.println("  Mt. Everest");
                System.out.println("  Mt. Fuji");
            }
            else
            {
                System.out.println("\n  Invalid");
            }
        }
        else if(menu == 'c' || menu == 'C')
        {
            System.out.println("\nChoose among Animals or Nationality. Enter your choice:");
            sub_menu=input.next();
            
            if(sub_menu.equalsIgnoreCase("animals"))
            {
                System.out.println("\n  Lion");
                System.out.println("  Cat");
                System.out.println("  Dog");
            }
            else if(sub_menu.equalsIgnoreCase("nationality"))
            {
                System.out.println("\n  Korean");
                System.out.println("  Americans");
                System.out.println("  Pinoy");
            }
            else
            {
                System.out.println("\n  Invalid");
            }
        }
        else
        {
            System.out.println("\n  Invalid");
        }
    }
}