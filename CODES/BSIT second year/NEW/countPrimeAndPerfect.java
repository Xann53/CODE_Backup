import java.util.*;
public class countPrimeAndPerfect {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
        int num1, num2;
        boolean continueLoop;
        boolean valid;
        boolean check;
        do {
            continueLoop = true;
            check = false;
            do {
                System.out.print("Enter first number: ");
                num1 = input.nextInt();
                System.out.print("Enter second number: ");
                num2 = input.nextInt();
                if(num1 > num2 || num1 < 0 || num2 < 0) {
                    System.out.println("\nInvalid input. Please try again.");
                    valid = true;
                } else {
                    valid = false;
                    check = true;
                }
            } while(valid);
            if(num1 == num2)
                continueLoop = false;
            else if(check)
                output(num1, num2);
        } while(continueLoop);
        System.out.print("\f");
    }
    public static void output(int num1, int num2) {
        int perfect = 0, prime = 0;
        int num = 0;
        boolean n = false;
        for(int i = num1; i <= num2; i++) {
            num = 0;
            for(int j = 1; j < i; j++) {
                if(i%j == 0)
                    num += j;
            }
            if(num == i && num != 0)
                perfect++;
        }
        System.out.println("\nNumber of Perfect Numbers: " + perfect);
        for(int i = num1; i <= num2; i++) {    
            int cntr = 0;
            for(int j = i; j >= 1; j--)
                if(i%j == 0)
                    cntr++;
            if (cntr == 2)
	       prime++;
        }
        System.out.println("Number of Prime Numbers: " + prime + "\n");
    }
}