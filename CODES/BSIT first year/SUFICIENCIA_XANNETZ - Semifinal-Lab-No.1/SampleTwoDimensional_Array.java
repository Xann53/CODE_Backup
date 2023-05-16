import java.util.Scanner;
public class SampleTwoDimensional_Array
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int x = input.nextInt();
        System.out.print("Enter number of columns: ");
        int y = input.nextInt();
        int arr[][] = new int[x][y];
        
        System.out.println("Input array values:");
        for(int m = 0; m < arr.length; m++)
        {
            for(int n = 0; n < arr[m].length; n++)
            {
                arr[m][n] = input.nextInt();
            }
        }
        for(int m = 0; m < arr.length; m++)
        {
            for(int n = 0; n < arr[m].length; n++)
            {
                System.out.print(arr[m][n] + " ");
            }
            System.out.println();
        }
    }
}