import java.util.Scanner;
public class Paragraph
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String paragraph = input.nextLine();
        int ctr = 0;
        for(int i = 0; i < paragraph.length(); i++)
        {
            System.out.print(paragraph.charAt(i));
            if(ctr == 29)
            {
                System.out.print("\n");
                ctr = -1;
            }
            ctr++;
        }
    }
}