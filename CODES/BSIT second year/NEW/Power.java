import java.util.*;
public class Power {
    static Scanner input = new Scanner(System.in);
    public static double power(double base, int exponent) {
        double x = base;
        for (int i = 1; i < exponent; i++)
            base *= x;
        return base;
    }
    public static void invalid() {
        System.out.println("\fInvalid Input. Please try again.\n");
    }
    public static String format(double y) {
        int ctr = 1;
        int x = (int)y;
        y -= x;
        String z = "" + x;
        String temp = "", tempAnswer = "", finalAnswer = "";
        for(int i = z.length(); i > 0; i--)
            temp += z.charAt(i-1);
        for(int i = 0; i < temp.length(); i++) {
            if(ctr > 3) {
                tempAnswer += ",";
                ctr = 1;
            }
            tempAnswer += temp.charAt(i);
            ctr++;
        }
        for(int i = tempAnswer.length(); i > 0; i--)
            finalAnswer += tempAnswer.charAt(i-1);
        temp = String.format("%.2f", y);
        for(int i = 1; i < temp.length(); i++)
            finalAnswer += temp.charAt(i);
        return finalAnswer;
    }
    public static void main(String [] args) {
        double base;
        int exponent;
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Note: Input '0' in Number and Exponent to exit.");
                System.out.println("Note: Negative Exponents are invalid.");
                System.out.format("\n%29s", "Enter Number here: ");
                base = input.nextDouble();
                System.out.format("%30s", "Enter Exponent here: ");
                exponent = input.nextInt();
                if(base != 0 && !(exponent <= 0)) {
                    System.out.format("\n%24s", "THE ANSWER IS: ");
                    System.out.printf("%.2f", power(base, exponent));
                    System.out.print(" / " + format(power(base, exponent)));
                    System.out.println("\n");
                } else if(base == 0 && exponent == 0)
                    continueLoop = false;
                else
                    invalid();
            } catch(InputMismatchException e) {
                input.nextLine();
                invalid();
            }
        } while(continueLoop);
        System.out.print("\f");
    }
}