import java.util.Scanner;
public class Midterm_Lab1_sample
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String option, retry;
        double r, a;
        do
        {
            System.out.print("\f");
            System.out.println("Choose one below:");
            System.out.println("Circle");
            System.out.println("Square");
            System.out.print("\nEnter a choice: ");
            String choise = input.next();
        
            if(choise.equalsIgnoreCase("circle"))
            {
                System.out.println("\nSelect an option below:");
                System.out.println("Circumference");
                System.out.println("Area");
                System.out.println("Diameter");
                System.out.print("\nEnter an option: ");
                option = input.next();
                
                if(option.equalsIgnoreCase("circumference"))
                {
                    System.out.print("\nEnter the value of r: ");
                    r = input.nextDouble();
                    System.out.println("The Circumference of a Circle is = " + (2 * 3.14159 * r));
                }
                else if(option.equalsIgnoreCase("area"))
                {
                    System.out.print("\nEnter the value of r: ");
                    r = input.nextDouble();
                    System.out.println("The Area of a Circle is = " + (3.14159 * (r * r)));
                }
                else if(option.equalsIgnoreCase("diameter"))
                {
                    System.out.print("\nEnter the value of r: ");
                    r = input.nextDouble();
                    System.out.println("The Diameter of a Circle is = " + (2 * r));
                }
                else
                {
                    System.out.println("\nInvalid option");
                }
            }
            else if(choise.equalsIgnoreCase("square"))
            {
                System.out.println("\nSelect an option below:");
                System.out.println("Area");
                System.out.println("Perimeter");
                System.out.print("\nEnter an option:");
                option = input.next();
             
                if(option.equalsIgnoreCase("area"))
                {
                    System.out.print("\nEnter the value of a: ");
                    a = input.nextDouble();
                    System.out.println("The Area of a Square is = " + (a * a));
                }
                else if(option.equalsIgnoreCase("perimeter"))
                {
                    System.out.print("\nEnter the value of a: ");
                    a = input.nextDouble();
                    System.out.println("The Perimeter of a Square is = " + (4 * a));
                }
                else
                {
                    System.out.println("\nInvalid option");
                }
            }
            else
            {
                System.out.println("\nInvalid choice");
            }
            
            System.out.println("\nWould you like to try again? yes or no");
            retry = input.next();
            System.out.println("\n");
        
        }while(retry.equalsIgnoreCase("yes"));
        System.out.print("\f");
    }
}
