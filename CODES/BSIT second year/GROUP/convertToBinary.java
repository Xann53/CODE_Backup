import java.util.Scanner;
public class convertToBinary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        int num2 = (int)num;
        String binary = "", finalBinary = "";
        int rem, rem2, counter = 0;
        boolean stop = false;
        num = num - num2;
        while(num2 > 0)
        {
            rem = num2 % 2;
            num2 = num2 / 2;
            binary += rem;
        }
        for(int i = binary.length(); i > 0; i--)
        {
            finalBinary += binary.charAt(i-1);
        }
        finalBinary += ".";
        while(stop == false)
        {
            if((num != 0) && (counter < 20))
            {
                num = num * 2;
                rem2 = (int)num;
                num = num - rem2;
                finalBinary += rem2;
            }
            else
            {
                stop = true;
            }
            counter++;
        }
        System.out.println(finalBinary);
    }
}
