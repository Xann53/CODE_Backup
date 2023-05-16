import java.util.Scanner;
public class TESTING
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] list = new int[20];
        for(int i=0; i<list.length;i++) {
            list[i] = input.nextInt();
        }
        list[12] = list[5] + list[7];
        System.out.println(list[12]);
        ;double num = input.nextDouble();
        int num2 = (int)num;
        if(num == num2)
        {
            boolean remainder = false;
            if((num % 2) > 0){
                remainder = true;
                System.out.println(remainder);
            }
            else
            {
                System.out.println(remainder);
            }
        }
        else if((num > num2) && (num < (num2 + 1)))
        {
            String combine = "0." + num2;
            double num3;
            num3 = Double.parseDouble(combine);
            boolean remainder = false;
            if((num % 2) > 0){
                remainder = true;
                System.out.println(remainder);
            }
            else
            {
                System.out.println(remainder);
            }
            System.out.println(num3);
        }
    }
}