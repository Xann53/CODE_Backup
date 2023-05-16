import java.util.Scanner;
public class MainRectangle
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        
        Rectangle alpha = new Rectangle(length, width);
       
        double area = alpha.computeArea();
        double perimeter = alpha.computePerimeter();
       
        System.out.println("The entered length is: " + alpha.getLength());
        System.out.println("The entered width is: " + alpha.getWidth());
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}