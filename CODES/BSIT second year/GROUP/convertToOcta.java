import java.util.Scanner;
public class convertToOcta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        int num2 = (int)num;
        String octa = "", finalOcta = "";
        int rem, rem2;
        int counter = 0;
        boolean stop = false;
        num = num - num2;
        while(num2 > 0)
        {
            rem = num2 % 8;
            num2 = num2 / 8;
            octa += rem;
        }
        for(int i = octa.length(); i > 0; i--)
        {
            finalOcta += octa.charAt(i-1);
        }
        finalOcta += ".";
        while(stop == false)
        {
            if((num != 0) && (counter < 20))
            {
                num = num * 8;
                rem2 = (int)num;
                num = num - rem2;
                finalOcta += rem2;
            }
            else
            {
                stop = true;
            }
            counter++;
        }
        System.out.println(finalOcta);
    }
}
