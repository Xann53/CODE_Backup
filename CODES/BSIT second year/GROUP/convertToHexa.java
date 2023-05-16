import java.util.Scanner;
public class convertToHexa
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        int num2 = (int)num;
        String hexa = "", finalHexa = "";
        int rem, rem2;
        int counter = 0;
        boolean stop = false;
        num = num - num2;
        while(num2 > 0)
        {
            rem = num2 % 16;
            num2 = num2 / 16;
            if(rem == 10)
                hexa += "A";
            else if(rem == 11)
                hexa += "B";
            else if(rem == 12)
                hexa += "C";
            else if(rem == 13)
                hexa += "D";
            else if(rem == 14)
                hexa += "E";
            else if(rem == 15)
                hexa += "F";
            else
                hexa += rem;
        }
        for(int i = hexa.length(); i > 0; i--)
        {
            finalHexa += hexa.charAt(i-1);
        }
        finalHexa += ".";
        while(stop == false)
        {
            if((num != 0) && (counter < 20))
            {
                num = num * 16;
                rem2 = (int)num;
                num = num - rem2;
                if(rem2 == 10)
                    finalHexa += "A";
                else if(rem2 == 11)
                    hexa += "B";
                else if(rem2 == 12)
                    finalHexa += "C";
                else if(rem2 == 13)
                    finalHexa += "D";
                else if(rem2 == 14)
                    finalHexa += "E";
                else if(rem2 == 15)
                    finalHexa += "F";
                else
                    finalHexa += rem2;
            }
            else
            {
                stop = true;
            }
            counter++;
        }
        System.out.println(finalHexa);
    }
}
