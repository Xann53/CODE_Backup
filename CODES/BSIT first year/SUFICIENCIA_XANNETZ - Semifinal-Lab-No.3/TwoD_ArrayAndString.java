import java.util.Scanner;
public class TwoD_ArrayAndString
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row size: ");
        int row = input.nextInt();
        System.out.print("Enter column size: ");
        int col = input.nextInt();
        int table[][] = new int[row][col];
        
        int lastVal = 0, val = lastVal;
        int astGroup = 0, valGroup = 0, ast = 0, x_num = 0, y_num = 0;
        
        System.out.println("\nThe generate values are:");
        
        for(int x = 0; x < table.length; x++)
        {
            for(int y = 0; y < table[x].length; y++)
            {
                if(val % 2 == 0)
                {
                    if(val < 9)
                    {
                        System.out.print("[");
                        System.out.print("x");
                        x_num = x_num + 1;
                        System.out.print("*");
                        ast = ast + 1;
                        System.out.print(val);
                        System.out.print("]");
                        valGroup = valGroup + 1;
                    }
                    else if(val > 9)
                    {
                        System.out.print("[");
                        System.out.print("y");
                        y_num = y_num + 1;
                        System.out.print(val);
                        System.out.print("]");
                        valGroup = valGroup + 1;
                    }
                }
                else if(val % 2 != 0)
                {
                    System.out.print("[");
                    System.out.print("***");
                    ast = ast+ 3;
                    System.out.print("]");
                    astGroup = astGroup + 1;
                }
                System.out.print("\t");
                val++;
            }
            System.out.println();
            lastVal = val;
        }
        System.out.println("\nThere are " + astGroup + " groups of 3 asterisks:");
        for(int i = 0; i < astGroup; i++)
        {
            System.out.print("[***]");
        }
        System.out.println("\n\nThere are " + valGroup + " with x or y:");
        int j = 0;
        for(int i = 0; i < valGroup; i++)
        {
            if(j < 9)
            {
                System.out.print("[x*" + j + "]");
            }
            else if(j > 9)
            {
                System.out.print("[y" + j + "]");
            }
            j = j + 2;
        }
        System.out.println("\n\nThere are " + ast + " asterisks");
        for(int i = 0; i < ast; i++)
        {
            System.out.print("* ");
        }
        System.out.println("\n\nThere are " + x_num + " letter x:");
        for(int i = 0; i < x_num; i++)
        {
            System.out.print("x ");
        }
        System.out.println("\n\nThere are " + y_num + " letter y:");
        for(int i = 0; i < y_num; i++)
        {
            System.out.print("y ");
        }
        int a = 0;
        j = 0;
        for(int i = 0; i < valGroup; i++)
        {
            int ctr = 0;
            if(j < 9)
            {
                a = a + 1;
            }
            else if(j > 9)
            {
                int m = j;
                for(; m >= 10; m = m - 10)
                {
                    ctr = ctr + 1;
                }
                a = a + 2;
            }
            j = j + 2;
        }
        j = 0;
        System.out.println("\n\nThere are " + a + " integer values:");
        for(int i = 0; i < valGroup; i++)
        {
            int ctr = 0;
            if(j < 9)
            {
                System.out.print(j + " ");
            }
            else if(j > 9)
            {
                int m = j;
                for(; m >= 10; m = m - 10)
                {
                    ctr = ctr + 1;
                }
                System.out.print(ctr + " " + m + " ");
            }
            j = j + 2;
        }
    }
}