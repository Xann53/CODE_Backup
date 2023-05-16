import java.util.Scanner;
import java.util.*;
public class ResidentInfo{
    
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
                    System.out.println("4. Sort Residents");
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
                                System.out.println("\nHow would you like to Search: ");
                                System.out.println("1. Search by ID Number");
                                System.out.println("2. Search by Name");
                                System.out.println("3. Search by Gender");
                                System.out.println("4. Search by Age Category");
                                System.out.print("Enter number of choice: ");
                                Choice = input.nextInt();
                                if(Choice >= 1 && Choice <= 4){
                                    Search(First_Name, Last_Name, Gender, Age, ID, Choice, container);
                                }else{
                                    System.out.println("\fFailed to Search. Invalid Input\n");
                                }
                            }
                            else{
                                System.out.println("\fNo available Resident to Search\n");
                            }
                            break;
                        case 4:
                            if(Access == true){
                                System.out.println("\nHow would you like to Sort: ");
                                System.out.println("1. Sort by Name (Alphabetical Order)");
                                System.out.println("2. Sort by Age (Oldest to Youngest)");
                                System.out.print("Enter number of choice: ");
                                Choice = input.nextInt();
                                if(Choice == 1 || Choice == 2){
                                    Sort(First_Name, Last_Name, Gender, Age, ID, Choice, container);
                                }else{
                                    System.out.println("\fFailed to Sort. Invalid Input\n");
                                }
                            }
                            else{
                                System.out.println("\fNo available Resident to Sort\n");
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
        System.out.print("\f");
        for(int i = 0; i < container; i++){
            System.out.println("\nID Number: " + ID[i] + "     Name: " + Last_Name[i] + ", " + First_Name[i] + "     Age: " + Age[i] + "     Gender: " + Gender[i]);
        }
        System.out.println();
    }
    public static void SearchDisplay(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container, int i){
        System.out.println("\nID Number: " + ID[i] + "     Name: " + Last_Name[i] + ", " + First_Name[i] + "     Age: " + Age[i] + "     Gender: " + Gender[i]);
    }
    public static void Search(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int Choice, int container){
        boolean Check;
        if(Choice == 1){
            Check = false;
            System.out.print("\nEnter the ID number of the resident: ");
            int tempID = input.nextInt();
            System.out.print("\f");
            for(int i = 0; i < container; i++){
                if(ID[i] == tempID){
                    Check = true;
                }
            }
            if(Check == true){
                for(int i = 0; i < container; i++){
                    if(ID[i] == tempID){
                        SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                    }
                }
                System.out.println();
            }
            else if(Check == false){
                System.out.println("\fID not found\n");
            }
        }
        else if(Choice == 2){
            Check = false;
            System.out.println("\nChoose which name:");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.print("Enter number of choice: ");
            Choice = input.nextInt();
            if(Choice == 1){
                System.out.print("\nEnter First Name: ");
                input.nextLine();
                String tempFirst_Name = input.nextLine().toUpperCase();
                System.out.print("\f");
                for(int i = 0; i < container; i++){
                    if(tempFirst_Name.equals(First_Name[i])){
                        Check = true;
                    }
                }
                if(Check == true){
                    for(int i = 0; i < container; i++){
                        if(tempFirst_Name.equals(First_Name[i])){
                            SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        }
                    }
                    System.out.println();
                }
                else if(Check == false){
                    System.out.println("\fName not found\n");
                }
            }
            else if(Choice == 2){
                System.out.print("\nEnter Last Name: ");
                input.nextLine();
                String tempLast_Name = input.nextLine().toUpperCase();
                System.out.print("\f");
                for(int i = 0; i < container; i++){
                    if(tempLast_Name.equals(Last_Name[i])){
                        Check = true;
                    }
                }
                if(Check == true){
                    for(int i = 0; i < container; i++){
                        if(tempLast_Name.equals(Last_Name[i])){
                            SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        }
                    }
                    System.out.println();
                }
                else if(Check == false){
                    System.out.println("\fName not found\n");
                }
            }
            else{
                System.out.println("\fFailed to Search. Invalid Input\n");
            }
        }
        else if(Choice == 3){
            Check = false;
            System.out.println("\nChoose which gender:");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.print("Enter number of choice: ");
            Choice = input.nextInt();
            System.out.print("\f");
            if(Choice == 1){
                for(int i = 0; i < container; i++){
                    if(Gender[i].equals("MALE")){
                        Check = true;
                    }
                }
                if(Check == true){
                    for(int i = 0; i < container; i++){
                        if(Gender[i].equals("MALE")){
                            SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        }
                    }
                    System.out.println();
                }
                else if(Check == false){
                    System.out.println("\fNo male residents found\n");
                }
            }
            else if(Choice == 2){
                for(int i = 0; i < container; i++){
                    if(Gender[i].equals("FEMALE")){
                        Check = true;
                    }
                }
                if(Check == true){
                    for(int i = 0; i < container; i++){
                        if(Gender[i].equals("FEMALE")){
                            SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        }
                    }
                    System.out.println();
                }
                else if(Check == false){
                    System.out.println("\fNo female residents found\n");
                }
            }
            else{
                System.out.println("\fFailed to Search. Invalid Input\n");
            }
        }
        else if(Choice == 4){
            Check = false;
            System.out.println("\nChoose category of age:");
            System.out.println("1. Young");
            System.out.println("2. Adult");
            System.out.println("3. Senior");
            System.out.print("Enter number of choice: ");
            Choice = input.nextInt();
            System.out.print("\f");
            if(Choice >= 1 && Choice <= 3){
                for(int i = 0; i < container; i++){
                    if((Choice == 1) && (Age[i] < 20 && Age[i] > 0)){
                        SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        Check = true;
                    }
                    if((Choice == 2) && (Age[i] < 65 && Age[i] > 19)){
                        SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        Check = true;
                    }
                    if((Choice == 3) && (Age[i] > 64)){
                        SearchDisplay(First_Name, Last_Name, Gender, Age, ID, container, i);
                        Check = true;
                    }
                }
                if(Check == false){
                    System.out.println("\fNo residents within the age category found");
                }
                System.out.println();
            }
            else{
                System.out.println("\fFailed to Search. Invalid Input\n");
            }
        }
    }
    public static int Sort(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int Choice, int container){
        String[] tempName = new String[container];
        for(int i = 0; i < container; i++){
            String tempLName = Last_Name[i];
            String tempFName = First_Name[i];
            tempName[i] = tempLName + " " + tempFName;
        }
        if(Choice == 1){
            for(int i = 0; i < container; i++){
                for(int j = i + 1; j < container; j++){
                    if(tempName[i].compareTo(tempName[j])>0){
                        String tempLast_Name = Last_Name[i];
                        Last_Name[i] = Last_Name[j];
                        Last_Name[j] = tempLast_Name;
                        
                        String tempFirst_Name = First_Name[i];
                        First_Name[i] = First_Name[j];
                        First_Name[j] = tempFirst_Name;
                        
                        String tempGender = Gender[i];
                        Gender[i] = Gender[j];
                        Gender[j] = tempGender;
                        
                        int tempAge = Age[i];
                        Age[i] = Age[j];
                        Age[j] = tempAge;
                        
                        int tempID = ID[i];
                        ID[i] = ID[j];
                        ID[j] = tempID;
                    }
                }
            }
            System.out.println("\fResidents Sorted Alphabetically by Name\n");
        }
        else if(Choice == 2){
            for(int i = 0; i < container; i++){
                for(int j = i + 1; j < container; j++){
                    if(Age[i] < Age[j]){
                        String tempLast_Name = Last_Name[i];
                        Last_Name[i] = Last_Name[j];
                        Last_Name[j] = tempLast_Name;
                        
                        String tempFirst_Name = First_Name[i];
                        First_Name[i] = First_Name[j];
                        First_Name[j] = tempFirst_Name;
                        
                        String tempGender = Gender[i];
                        Gender[i] = Gender[j];
                        Gender[j] = tempGender;
                        
                        int tempAge = Age[i];
                        Age[i] = Age[j];
                        Age[j] = tempAge;
                        
                        int tempID = ID[i];
                        ID[i] = ID[j];
                        ID[j] = tempID;
                    }
                }
            }
            System.out.println("\fResidents Sorted Oldest to Youngest\n");
        }
        return container;
    }
}
