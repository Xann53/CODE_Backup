/**
XYZ Company is asking the IT Department to write a program to keep track of their 
agents weekly sales. The program includes the agent's ID number, name, and sales
amount for the week. The following operations should be applied.

1. Add Sales Agent
    - Add new sales agent in the parallel array
2. Search Sales Agent 
   2.1 By ID number
   2.2 By Name
   2.3 Those agent who hit the target sales
3. Display 
   3.1 All agents starting with the highest sales to the lowest
   3.2 Agents with the lowest and highest sales.
4. Update Agent Record

Name: Xannetz V. Suficiencia
*/
import java.util.Scanner;
import java.util.*;
public class WeekSales {
    static Scanner scan = new Scanner (System.in);
    public static void main () {
        //declare parallel arrays
        final int SIZE = 20;
        String [] agentID = new String [SIZE];
        String [] agentName = new String [SIZE];
        double [] agentSales = new double [SIZE];
        int choice = 0;
        int agentCount=0;
        boolean exit = false;
        do {
            try {
                menu (); //method call to menu()
                System.out.println ("Enter your choice: ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1: addAgent (agentID, agentName, agentSales, agentCount); //method call
                            System.out.println();
                            agentCount++;
                            break;
                    case 2: searchID (agentID, agentName, agentSales, agentCount);
                            System.out.println();
                            break;
                    case 3: searchName (agentID, agentName, agentSales, agentCount);
                            System.out.println();
                            break;
                    case 4: searchSales (agentID, agentName, agentSales, agentCount);
                            System.out.println();
                            break;
                    case 5: displayAll (agentID, agentName, agentSales, agentCount);
                            System.out.println();
                            break;
                    case 6: displayHL (agentID, agentName, agentSales, agentCount);
                            System.out.println();
                            break;
                    case 7: updateAgent (agentID, agentName, agentSales, agentCount); //method call
                            System.out.println();
                            break;
                    case 0: System.out.println ("\fProgram terminated...");
                            exit = true;
                            break;
                    default: System.out.println ("\fInvalid choice. Input again...\n");
                }
            } catch(InputMismatchException e) {
                System.out.println("\fInvalid Input\n");
                scan.nextLine();
            }
        }while (!exit); //end of do...while
    }//end of main method
    public static void menu () {
        System.out.println ("Menu\n1. Add sales agent\n2. Search by ID number"
                            + "\n3. Search by Name\n4. Search by Sales Target"
                            + "\n5. Display all agents (Descending Oder by Sales)"
                            + "\n6. Display with Lowest and Highest Sales"
                            + "\n7. Update Agent's Record\n0. Exit Program");
    }//end of method menu
    public static void addAgent (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        String ID, name;
        double sales;
        boolean found;
       
        do { // to input the ID number and check if it is unique
           found=false;
           System.out.print ("\nInput ID number: ");
           ID = scan.next ();
           //check if ID number is unique
           for (int k = 0; k < agentCount && !found; k++) {
               if (ID.equals(agentID[k])) {  //if the condition evaluates to TRUE then it means 
                                           // that the ID number is NOT UNIQUE
                   found = true;
                   System.out.println ("\fID number already exist.");
               }
            }
        }while (found); //terminates the loop if the ID number is unique
        scan.nextLine();
        System.out.print ("Input name: ");
        name = scan.nextLine ();
               
        do { //a validation for valid sales input...
            System.out.print ("Input sales for the week: ");
            sales = scan.nextDouble ();
        
            if (sales < 0)
                System.out.println ("\fInvalid value. Please input again..");            
        }while (sales < 0);
        //assign values to the array
        agentID[agentCount]=ID;
        agentName[agentCount]=name;
        agentSales[agentCount]=sales;               
    }//end of method addAgent
    public static void searchID (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        boolean found = false;
        System.out.print("\nEnter ID number: ");
        scan.nextLine();
        String ID = scan.nextLine();
        System.out.println ("\fSales Agent");
        for(int i = 0; i < agentCount && !found; i++) {
            if(ID.equals(agentID[i])) {
                System.out.println ("  " + agentID[i] + "     " + agentName[i] + "     " + agentSales[i]);
                found = true;
            }
        }
        if(!found)
            System.out.print("\fID was not found\n");
    }
    public static void searchName (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        boolean found = false;
        System.out.print("\nEnter Name: ");
        scan.nextLine();
        String Name = scan.nextLine();
        System.out.println ("\fSales Agent");
        for(int i = 0; i < agentCount && !found; i++) {
            if(Name.equals(agentName[i])) {
                System.out.println ("  " + agentID[i] + "     " + agentName[i] + "     " + agentSales[i]);
                found = true;
            }
        }
        if(!found)
            System.out.print("\fName was not found\n");
    }
    public static void searchSales (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        boolean found = false;
        System.out.print("\nEnter Sales target: ");
        double Sales = scan.nextDouble();
        System.out.println ("\fSales Agent");
        for(int i = 0; i < agentCount; i++) {
            if(Sales == agentSales[i]) {
                System.out.println ("  " + agentID[i] + "     " + agentName[i] + "     " + agentSales[i]);
                found = true;
            }
        }
        if(!found)
            System.out.print("\fSales target was not found\n");
    }
    public static void switching (String[] agentID, String[] agentName, double[] agentSales, int i, int j) {
        String tempAgentID = agentID[i];
        agentID[i] = agentID[j];
        agentID[j] = tempAgentID;
        
        String tempAgentName = agentName[i];
        agentName[i] = agentName[j];
        agentName[j] = tempAgentName;
        
        double tempAgentSales = agentSales[i];
        agentSales[i] = agentSales[j];
        agentSales[j] = tempAgentSales;
    }
    public static void displayAll (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        for(int i = 0; i < agentCount; i++) {
            for(int j = i + 1; j < agentCount; j++) {
                if(agentSales[i] < agentSales[j]) {
                    switching (agentID, agentName, agentSales, i, j);
                }
            }
        }
        System.out.println ("\fSales Agents");
        for(int k = 0; k < agentCount; k++) {
            System.out.println ("  " + agentID[k] + "     " + agentName[k] + "     " + agentSales[k]);
        }
    }//end of method displayAll
    public static void displayHL (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        for(int i = 0; i < agentCount; i++) {
            for(int j = i + 1; j < agentCount; j++) {
                if(agentSales[i] < agentSales[j]) {
                    switching (agentID, agentName, agentSales, i, j);
                }
            }
        }
        System.out.println ("\fHighest Sales");
        for(int k = 0; k < agentCount && agentSales[k] == agentSales[0]; k++) {
            System.out.println ("  " + agentID[k] + "     " + agentName[k] + "     " + agentSales[k]);
        }
        for(int i = 0; i < agentCount; i++) {
            for(int j = i + 1; j < agentCount; j++) {
                if(agentSales[i] > agentSales[j]) {
                    switching (agentID, agentName, agentSales, i, j);
                }
            }
        }
        System.out.println ("\nLowest Sales");
        for(int k = 0; k < agentCount && agentSales[k] == agentSales[0]; k++) {
            System.out.println ("  " + agentID[k] + "     " + agentName[k] + "     " + agentSales[k]);
        }
    }
    public static void updateAgent (String[] agentID, String[] agentName, double[] agentSales, int agentCount) {
        boolean found = false;
        double Sales;
        String Name, ID;
        System.out.print("\nEnter ID number: ");
        scan.nextLine();
        ID = scan.nextLine();
        for(int i = 0; i < agentCount && !found; i++) {
            if(ID.equals(agentID[i])) {
                System.out.print("\nEnter updated Name: ");
                Name = scan.nextLine();
                System.out.print("Enter updated Sales target: ");
                Sales = scan.nextDouble();
                System.out.println ("\fSales Agent");
                agentName[i] = Name;
                agentSales[i] = Sales;
                System.out.println ("  " + agentID[i] + "     " + agentName[i] + "     " + agentSales[i]);
                found = true;
            }
        }
        if(!found)
            System.out.print("\fID was not found\n");
    }
}
