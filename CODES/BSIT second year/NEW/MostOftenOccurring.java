import java.util.*;
public class MostOftenOccurring {
    static Scanner input = new Scanner(System.in);
    public static int occursMostOften(int[] a) {
        int ctr, prevCtr = 0, value, highest = 0;
        for(int i = 0; i < a.length; i++) {
            ctr = 0;
            value = a[i];
            for(int j = 0; j < a.length; j++)
                if(a[j] == value)
                    ctr++;
            if(ctr > prevCtr) {
                highest = value;
                prevCtr = ctr;
            }
        }
        return highest;
    }
    public static void invalid() {
        System.out.println("\fInvalid Input. Please try again.");
    }
    public static void main(String [] args) {
        int[] a;
        int x, ctr;
        boolean continueLoop = true;
        do {
            try {
                ctr = 1;
                System.out.print("Enter number of array: ");
                x = input.nextInt();
                if(x == 0)
                    continueLoop = false;
                else if(x < 0)
                    invalid();
                else {
                    a = new int[x];
                    System.out.println("\nAll the values of the array");
                    for(int i = 0; i < a.length; i++) {
                        a[i] = (int)(Math.random() * (20) + 10);
                        System.out.format("%-5s", a[i]);
                        if(ctr == 10) {
                            System.out.println();
                            ctr = 0;
                        }
                        ctr++;
                    }
                    System.out.println("\n\nThe number with the most occurances is: " + occursMostOften(a));
                }
                System.out.println();
            } catch(InputMismatchException e) {
                input.nextLine();
                invalid();
            }
        } while(continueLoop);
        System.out.print("\f");
    }
}