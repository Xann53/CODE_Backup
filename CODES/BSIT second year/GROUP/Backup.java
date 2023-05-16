import java.util.Scanner;
import java.util.*;
public class Backup{
    
    final static Scanner input = new Scanner(System.in);
    
    public static void main(String [] args){
        int array = 999999;
        String[] First_Name = new String[array];
        String[] Last_Name = new String[array];
        String[] Gender = new String[array];
        int[] Age = new int[array];
        int[] ID = new int[array];
        int Choice, container = 0;
        boolean ContinueLoop = true;
        boolean Access = false;
        
        while(ContinueLoop == true){
            try{
                do{
                    System.out.println("------------MENU------------");
                    System.out.println("1. Add Resident");
                    System.out.println("2. Display Residents");
                    System.out.println("3. Search Resident");
                    System.out.println("0. Exit");
                    System.out.print("Enter number of your choice: ");
                    Choice = input.nextInt();
                    
                    switch(Choice){
                        case 1:
                            container = Input(First_Name, Last_Name, Gender, Age, ID, container);
                            Access = true;
                            break;
                        case 2:
                            if(Access == true){
                                Display(First_Name, Last_Name, Gender, Age, ID, container);
                            }
                            else{
                                System.out.println("\fNo available Residents to Display\n");
                            }
                            break;
                        case 3:
                            if(Access == true){
                                Search(First_Name, Last_Name, Gender, Age, ID, container);
                            }
                            else{
                                System.out.println("\fNo available Resident to Search\n");
                            }
                            break;
                        default:
                            System.out.println("\fInvalid Input\n");
                            break;
                    }
                }while(Choice != 0);
                System.out.println("\f");
                ContinueLoop = false;
            }catch (InputMismatchException e){
                System.out.println("\fInvalid Input\n");
                input.next();
            }
        }
    }
    public static int Input(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container){
        
        boolean check = true;
        System.out.print("\fEnter 6-digit ID number:");
        while(check == true){
            try{
                ID[container] = input.nextInt();
                if(ID[container] >= 100000 && ID[container] <= 999999){
                    for(int i = 0; i < ID.length; i++){
                        if(ID[container] == ID[i] && container != i){
                            System.out.print("ID already taken. Please enter 6-digit ID again: ");
                            ID[container] = input.nextInt();
                            i = -1;
                        }
                        else{
                            check = false;
                        }
                    }
                }
                else{
                    System.out.print("Invalid Input. Please enter 6-digit ID again: ");
                }
            }catch (InputMismatchException e){
                System.out.print("Invalid Input. Please enter 6-digit ID again: ");
                input.next();
            }
        }
        check = true;
        System.out.print("Enter First Name:");
        input.nextLine();
        First_Name[container] = input.nextLine().toUpperCase();
        while(check == true){
            for(int i = 0; i < First_Name[container].length(); i++){
                if((First_Name[container].charAt(i) >= 'A' && First_Name[container].charAt(i) <= 'Z') || First_Name[container].charAt(i) == ' '){
                }
                else{
                    System.out.print("Invalid Input. Please enter First Name again: ");
                    First_Name[container] = input.nextLine().toUpperCase();
                    i = -1;
                }
            }
            if(First_Name[container].isEmpty()){
                System.out.print("Blank Input. Please enter First Name again: ");
                First_Name[container] = input.nextLine().toUpperCase();
            }
            else{
                check = false;
            }
        }
        check = true;
        System.out.print("Enter Last Name:");
        Last_Name[container] = input.nextLine().toUpperCase();
        while(check == true){
            for(int i = 0; i < Last_Name[container].length(); i++){
                if((Last_Name[container].charAt(i) >= 'A' && Last_Name[container].charAt(i) <= 'Z') || Last_Name[container].charAt(i) == ' '){
                }
                else{
                    System.out.print("Invalid Input. Please enter Last Name again: ");
                    Last_Name[container] = input.nextLine().toUpperCase();
                    i = -1;
                }
            }
            if(Last_Name[container].isEmpty()){
                System.out.print("Blank Input. Please enter Last Name again: ");
                Last_Name[container] = input.nextLine().toUpperCase();
            }
            else{
                check = false;
            }
        }
        check = true;
        System.out.print("Enter Gender(Male or Female):");
        Gender[container] = input.nextLine().toUpperCase();
        while(check == true){
            if(Gender[container].isEmpty()){
                System.out.print("Blank Input. Please enter Gender again: ");
                Gender[container] = input.nextLine().toUpperCase();
            }
            else if(Gender[container].equals("MALE") || Gender[container].equals("FEMALE")){
                check = false;
            }
            else{
                System.out.print("Invalid Input. Please enter Gender again: ");
                Gender[container] = input.nextLine().toUpperCase();
            }
        }
        check = true;
        System.out.print("Enter Age:");
        while(check == true){
            try{
                Age[container] = input.nextInt();
                if(Age[container] >= 1){
                    check = false;
                }
                else{
                    System.out.print("Invalid Input. Please enter Age again: ");
                }
            }catch (InputMismatchException e){
                System.out.print("Invalid Input. Please enter Age again: ");
                input.next();
            }
        }
        System.out.println();
        container++;
        return container;
    }
    public static void Display(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container){
        String[] newFirst_Name = First_Name;
        String[] newLast_Name = Last_Name;
        String[] newGender = Gender;
        int[] newAge = Age;
        int[] newID = ID;
        int Choice, newContainer = container, counter;
        boolean ContinueLoop = true;
        
        System.out.print("\f");
        while(ContinueLoop == true){
            try{
                System.out.println("What would you like to do: ");
                System.out.println("1. Display all");
                System.out.println("2. Sort First");
                System.out.print("Enter number of choice: ");
                Choice = input.nextInt();
                switch(Choice){
                    case 1:
                        System.out.print("\f");
                        for(int i = 0; i < container; i++){
                            System.out.println("\nID Number: " + ID[i] + "     Name: " + Last_Name[i] + ", " + First_Name[i] + "     Age: " + Age[i] + "     Gender: " + Gender[i]);
                        }
                        System.out.println();
                        ContinueLoop = false;
                        break;
                    case 2:
                        System.out.println("\nHow would you like to Sort: ");
                        System.out.println("1. Sort by Name (Alphabetical Order)");
                        System.out.println("2. Sort by Age (Oldest to Youngest)");
                        System.out.print("Enter number of choice: ");
                        Choice = input.nextInt();
                        if(Choice == 1 || Choice == 2){
                            System.out.print("\f");
                            counter = Sort(newFirst_Name, newLast_Name, newGender, newAge, newID, Choice, newContainer);
                            for(int i = 0; i < counter; i++){
                                System.out.println("\nID Number: " + newID[i] + "     Name: " + newLast_Name[i] + ", " + newFirst_Name[i] + "     Age: " + newAge[i] + "     Gender: " + newGender[i]);
                            }
                            System.out.println();
                            ContinueLoop = false;
                        }else{
                            System.out.println("\fFailed to Sort. Invalid Input\n");
                        }
                        break;
                    default:
                        System.out.println("\fInvalid Input\n");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("\fInvalid Input\n");
                input.next();
            }
        }
    }
    public static void Search(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container){
        
    }
    public static int Sort(String[] newFirst_Name, String[] newLast_Name, String[] newGender, int[] newAge, int[] newID, int Choice, int newContainer){
        if(Choice == 1){
            for(int i = 0; i < newContainer; i++){
                for(int j = i + 1; j < newContainer; j++){
                    if(newLast_Name[i].compareTo(newLast_Name[j])>0){
                        if(newLast_Name[i] == newLast_Name[j]){
                            if(newFirst_Name[i].compareTo(newFirst_Name[j])>0){
                                String tempFirst_Name = newFirst_Name[i];
                                newFirst_Name[i] = newFirst_Name[j];
                                newFirst_Name[j] = tempFirst_Name;
                                
                                String tempLast_Name = newLast_Name[i];
                                newLast_Name[i] = newLast_Name[j];
                                newLast_Name[j] = tempLast_Name;
                                
                                String tempGender = newGender[i];
                                newGender[i] = newGender[j];
                                newGender[j] = tempGender;
                            
                                int tempAge = newAge[i];
                                newAge[i] = newAge[j];
                                newAge[j] = tempAge;
                                
                                int tempID = newID[i];
                                newID[i] = newID[j];
                                newID[j] = tempID;
                            }
                        }
                        else{
                            String tempLast_Name = newLast_Name[i];
                            newLast_Name[i] = newLast_Name[j];
                            newLast_Name[j] = tempLast_Name;
                        
                            String tempFirst_Name = newFirst_Name[i];
                            newFirst_Name[i] = newFirst_Name[j];
                            newFirst_Name[j] = tempFirst_Name;
                        
                            String tempGender = newGender[i];
                            newGender[i] = newGender[j];
                            newGender[j] = tempGender;
                        
                            int tempAge = newAge[i];
                            newAge[i] = newAge[j];
                            newAge[j] = tempAge;
                        
                            int tempID = newID[i];
                            newID[i] = newID[j];
                            newID[j] = tempID;
                        }
                    }
                }
            }
        }
        else if(Choice == 2){
            
        }
        return newContainer;
    }
}
