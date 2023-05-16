import java.util.Scanner;
public class PrelimExam {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
        int retry;
        do {
            System.out.print("\f");
            int arraySize = 50;
            int[] unsorted = new int[arraySize];
            int[] sorted = new int[arraySize];
            for(int i = 0; i < unsorted.length; i++) {
                unsorted[i] = (int)(Math.random() * 500);
            }
            sortValues(unsorted, sorted);
            displayValues(unsorted);
            System.out.println();
            displayValues(sorted);
            System.out.println();
            searchUnsorted(unsorted);
            System.out.println();
            searchSorted(sorted);
            System.out.println("\n(1) to retry\n(0) to exit");
            retry = input.nextInt();
        }while(retry != 0);
        System.out.print("\f");
    }
    public static void displayValues(int[] values) {
        int ctr = 0;
        for(int i = 0; i < values.length; i++) {
            System.out.printf("%-7s", values[i]);
            ctr++;
            if(ctr >= 10) {
                System.out.println();
                ctr = 0;
            }
        }
    }
    public static void sortValues(int[] unsorted, int[] sorted) {
        int temp;
        for(int i = 0; i < unsorted.length; i++) {
            temp = unsorted[i];
            sorted[i] = temp;
        }
        for(int i = 0; i < sorted.length; i++) {
            for(int j = 0; j < sorted.length; j++) {
                if(sorted[i] < sorted[j]) {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
    }
    public static void searchUnsorted(int[] values) {
        int ctrLoc = 0, ctrCop = 0, ctrCom = 0;
        System.out.print("UNSORTED SEARCH\nSearch a number: ");
        int search = input.nextInt();
        System.out.print("\nNumber found in location: ");
        for(int i = 0; i < values.length; i++) {
            ctrLoc++;
            ctrCom++;
            if(search == values[i]) {
                if(ctrCop > 0)
                    System.out.print(", ");
                System.out.print(ctrLoc);
                ctrCop++;
                ctrCom++;
            }
        }
        System.out.println("\nNumber of key comparisons made: " + ctrCom);
    }
    public static void searchSorted(int[] values) {
        int ctrCom = 0;
        int first = 0, last = values.length - 1;
        System.out.print("SORTED SEARCH\nSearch a number: ");
        int search = input.nextInt();
        int mid = (first + last)/2;  
        while( first <= last ) {  
            if( values[mid] < search ) {  
                first = mid + 1;
                ctrCom++;
            }else if( values[mid] == search ) {
                System.out.println("\nNumber found in location: " + (mid + 1));
                ctrCom++;
                break;
            }else if ( values[mid] > search ){  
                last = mid - 1;
                ctrCom++;
            }else
                break;
            mid = (first + last)/2;
            ctrCom++;
        }
        System.out.println("Number of key comparisons made: " + ctrCom);
    }
}