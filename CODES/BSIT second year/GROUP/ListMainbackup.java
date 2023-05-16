import java.util.Scanner;
public class ListMainbackup {
    static Scanner scan = new Scanner (System.in);
    public static void main () {
        ListOperationsbackup list = new ListOperationsbackup();
        int number;
        char resp;
        int choice;
        
        System.out.print ("\f");
        
        do {
            System.out.print ("\nMenu  1. Insert  2. Delete  3. Search   4. Display all 0. Quit \nEnter your choice: ");
            choice = scan.nextInt();
            
            switch (choice) {
            case 1:  System.out.println ("Input integer: ");
                     number = scan.nextInt();
                     list.insertBeginning (number);
                     break;
            case 2:  System.out.println ("\nDo you really want to delete? [n-to stop]: ");
                     resp = scan.next().charAt(0);
            
                     if (resp != 'n') {
                         list.deleteBeginning ();                         
                     }
                     else
                        System.out.println ("\nProgram ended.");   
                        
                     break;
            case 3:  System.out.println ("Input number to be searched: ");
                     number = scan.nextInt();
                     if (list.searchTarget (number))
                        System.out.println ("\nNumber is found.");
                     else
                        System.out.println ("\nNumber is NOT FOUND.");
                        
                     break;
            case 4:  list.displayAll ();
                     break;
            case 0:  System.out.println ("\nProgram terminated.");
                     break;
            default: System.out.println ("\nInvalid choice.");                                 
            }
 
        }while (choice != 0);                        

    }
    

    
}
