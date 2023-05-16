import java.util.*;
class ContainsInRange
{
    static Scanner input = new Scanner(System.in);
    public static boolean contains(int a[], int x, int start, int end){
        if (start == end && a[start] == x) 
            return true;
        for (int i = start; i < end; i++)
        {
            if (a[i] == x) return true;
        }
        return false;
    }
    public static void main(String [] args) {
        boolean loop = true;
        int[] a;
        int size, start, end, x, ctr;
        do {
            try {
                ctr = 1;
                System.out.print("Enter the size of the array (enter '0' to exit): ");
                size = input.nextInt();
                if(size == 0) {
                    loop = false;
                    break;
                }
                a = new int[size];
                System.out.println("\nHere are all the values in the array:");
                for(int i = 0; i < a.length; i++) {
                    a[i] = (int)(Math.random() * (200));
                    System.out.format("%-5s", a[i]);
                    if(ctr == 10 && i != (a.length-1)) {
                        System.out.println();
                        ctr = 0;
                    }
                    ctr++;
                }
                System.out.print("\n\nEnter the starting point index for the search: ");
                start = input.nextInt();
                System.out.print("Enter the ending point index for the search: ");
                end = input.nextInt();
                System.out.print("Enter the value to be searched withing both points: ");
                x = input.nextInt();
                if ((start < a.length && end <= a.length) && start <= end && (start >= 0 && end >= 0))
                    System.out.println("\n" + contains(a, x, start, end) + "\n");
                else
                    System.out.println("\fInvalid input. Please try again.\n");
            } catch(InputMismatchException e) {
                input.nextLine();
                System.out.println("\fInvalid input. Please try again.\n");
            }
        } while(loop);
        System.out.print("\f");
    }
}