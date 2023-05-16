import java.util.Scanner;
public class ListMain {
    static Scanner scan = new Scanner (System.in);
    public static void main () {
        ListOperations list = new ListOperations();
        int number;
        char resp;
        int choice;

        do {
            System.out.print("\nMenu  \n1. Insert at Beginning 2. Insert at End \n3. Delete (Beginning) 4. Delete (End)  \n5. Search   6. Modify value \n7. Display all 0. Quit \nEnter your choice: ");
            choice = scan.nextInt();
            
            switch (choice) {
                case 1:  System.out.println ("Input integer: ");
                         number = scan.nextInt();
                         list.insertBeginning (number);
                         break;
                         
                case 2:  System.out.println ("Input integer: ");
                         number = scan.nextInt();
                         list.insertEnd (number);
                         break;         
                
                case 3:  System.out.println ("\nDo you really want to delete? [press y for yes]: ");
                         resp = scan.next().charAt(0);
                         if (resp == 'y' || resp == 'Y'){
                             list.deleteBeginning();
                             System.out.println("Number is deleted.");
                         } else
                             System.out.println("Number is not deleted.");
                         break;
                
                case 4:  System.out.println ("\nDo you really want to delete? [press y for yes]: ");
                         resp = scan.next().charAt(0);
                         if (resp == 'y' || resp == 'Y'){
                             list.deleteEnd();
                             System.out.println("Number is deleted.");
                         } else
                             System.out.println("Number is not deleted.");                        
                         break;         
                
                case 5:  System.out.println ("Input number to be searched: ");
                         number = scan.nextInt();
                         if (list.searchTarget (number)){
                            System.out.println ("\nNumber is found.");
                            list.numOfOccurrences(number);
                         }
                         else
                            System.out.println ("\nNumber is NOT FOUND."); 
                         break; 
                
                case 6:  System.out.println ("Input number to be modified: ");
                         number = scan.nextInt();
                         System.out.println ("Input updated value: ");
                         int update = scan.nextInt();
                         list.modifyValue(number, update);
                         break;       
                
                case 7:  list.displayAll ();
                         break;         
                
                case 0:  System.out.println ("\nProgram terminated.");
                         break;
                
                default: System.out.println ("\nInvalid choice.");                                 
            }
        } while (choice != 0);                        
    }
}
