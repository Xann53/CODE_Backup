import java.util.*;
public class ResidentMain{
    final static Scanner input = new Scanner(System.in);
    public static void main(String [] args){
        ResidentMethods m = new ResidentMethods();
        int array = 999999;
        String[] First_Name = new String[array];
        String[] Last_Name = new String[array];
        String[] Gender = new String[array];
        int[] Age = new int[array];
        int[] ID = new int[array];
        int choice, container = 0;
        boolean continueLoop = true;
        boolean access = false;
        
        while(continueLoop){
            try{
                do{
                    System.out.println("------------MENU------------");
                    System.out.println("(1) Add Resident");
                    System.out.println("(2) Display Residents");
                    System.out.println("(3) Search Resident");
                    System.out.println("(0) Exit");
                    System.out.print("Enter number of your choice: ");
                    choice = input.nextInt();
                    
                    switch(choice){
                        case 1:
                            container = m.Input(First_Name, Last_Name, Gender, Age, ID, container);
                            access = true; //means there are available residents' information
                            break;
                        case 2:
                            if(access == true){
                                System.out.println("\nHow would you like to sort: ");
                                System.out.println("(1) Sort by Name (A-Z)");
                                System.out.println("(2) Sort by Name (Z-A)");
                                System.out.println("(3) Sort by Age (Ascending)");
                                System.out.println("(4) Sort by Age (Descending)");
                                System.out.println("(5) Don't sort");
                                System.out.println("(0) Exit");
                                System.out.print("Enter number of choice: ");
                                choice = input.nextInt();
                                
                                if(choice >= 1 && choice <= 5){
                                    m.Sort(First_Name, Last_Name, Gender, Age, ID, choice, container);
                                }else{
                                    System.out.println("\fFailed to sort. Invalid input.\n");
                                }
                            }
                            else{
                                System.out.println("\fNo available resident to display.\n");
                            }
                            break;
                        case 3:
                            if(access == true){
                                System.out.println("\nHow would you like to Search: ");
                                System.out.println("(1) Search by ID Number");
                                System.out.println("(2) Search by Name");
                                System.out.println("(3) Search by Gender");
                                System.out.println("(4) Search by Age Category");
                                System.out.println("(0) Exit");
                                System.out.print("Enter number of choice: ");
                                choice = input.nextInt();
                                if(choice >= 1 && choice <= 4){
                                    m.Search(First_Name, Last_Name, Gender, Age, ID, choice, container);
                                }else{
                                    System.out.println("\fFailed to search. Invalid input.\n");
                                }
                            }
                            else{
                                System.out.println("\fNo available resident to search.\n");
                            }
                            break;
                        default:
                            System.out.println("\fInvalid input.\n");
                            break;
                    }
                }while(choice != 0);
                System.out.println("\fProgram terminated.");
                continueLoop = false;
            }catch (InputMismatchException e){
                System.out.println("\fInvalid input.\n");
                input.next();
            }
        }
    }
}