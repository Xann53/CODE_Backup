import java.util.*;
public class Main
{
    private static Scanner input = new Scanner(System.in);
    private static Process prosOBJ = new Process();
    
    public static void main(String[] args) {
        boolean retry = true, valid = true;
        while(retry) {
            if(valid)
                prosOBJ.Menu();
            System.out.println("Would like to try again?(yes or no)");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("YES") || choice.equalsIgnoreCase("Y")) {
                System.out.print("\f");
                valid = true;
            } else if(choice.equalsIgnoreCase("NO") || choice.equalsIgnoreCase("N")) {
                System.out.print("\f");
                retry = false;
            } else {
                System.out.print("\f");
                System.out.println("Invalid Input!");
                valid = false;
            }
        }
    }
}