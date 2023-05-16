import java.util.Scanner;
public class Main_class
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TwoDMethods output = new TwoDMethods();
        String retry;
        do
        {
            System.out.print("\f");
            System.out.print("Enter row size: ");
            int row = input.nextInt();
            System.out.print("Enter column size: ");
            int col = input.nextInt();
            String table[][] = new String[row][col];
            System.out.println();
            
            for(int i = 0; i < table.length; i++)
            {
                for(int j = 0; j < table[i].length; j++)
                {
                    System.out.print("Enter a string in location [" + i
                    + "][" + j + "]: ");
                    table[i][j] = input.next();
                }
            }
            
            output.display(table);
            output.displayRev(table);
            output.numWords(table);
            output.numChar(table);
            output.vowels(table);
            output.consonants(table);
            
            System.out.println("\nWould you like to try again? (Yes or No)");
            retry = input.next();
        }
        while(retry.equalsIgnoreCase("yes"));
        System.out.print("\f");
    }
}