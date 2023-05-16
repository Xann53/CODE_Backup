import java.util.Scanner;
public class TESTING2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        
        int[] array = {num1, num2, num3, num4, num5};
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "   ");
        }
    }
}