import java.util.Scanner;
public class Sample
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row size: ");
        int row = input.nextInt();
        System.out.print("Enter column size: ");
        int col = input.nextInt();
        
        int table[][] = new int[row][col];
        int num = 0, num2 = 0;
        System.out.println("\nThe generated values are");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                table[i][j] = num + num2;
                System.out.print(table[i][j] + "\t");
                num++;
            }
            num2 = num2 + 10;
            num = 0;
            System.out.println("");
        }
    }
}