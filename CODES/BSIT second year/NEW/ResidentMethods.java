import java.util.*;
public class ResidentMethods {
    final static Scanner input = new Scanner(System.in);
    public int Input(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container){
        boolean check = true;
        System.out.print("\fEnter 6-digit ID number: "); 
        // user inputs Id number
        while(check == true){ 
            try{
                ID[container] = input.nextInt();
                if(ID[container] >= 100000 && ID[container] <= 999999){ // check if the user enters 6 digits/must not start with 0
                    for(int i = 0; i < ID.length; i++){
                        if(ID[container] == ID[i] && container != i){ // checks if id is unique and returns to input if not
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
                    System.out.print("Invalid input. ID number must not start with 0. Please enter 6-digit ID again: ");
                }
            }catch (InputMismatchException e){
                System.out.print("Invalid input. Please enter 6-digit ID again: ");
                input.next();
            }
        }
        check = true;
        System.out.print("Enter first name: ");
        // user inputs first name
        input.nextLine();
        First_Name[container] = input.nextLine().toUpperCase();
        while(check == true){
            for(int i = 0; i < First_Name[container].length(); i++){ 
                if((First_Name[container].charAt(i) >= 'A' && First_Name[container].charAt(i) <= 'Z') || First_Name[container].charAt(i) == ' '){  
                }// checks if each character is an alphabet and returns to input if not
                else{
                    System.out.print("Invalid input. Please enter first name again: ");
                    First_Name[container] = input.nextLine().toUpperCase();
                    i = -1;
                }
            }
            if(First_Name[container].isEmpty()){ // checks if the input string is empty or not
                System.out.print("Blank input. Please enter first name again: ");
                First_Name[container] = input.nextLine().toUpperCase();
            }
            else{
                check = false;
            }
        }
        check = true;
        System.out.print("Enter last name: ");
        // user inputs last name
        Last_Name[container] = input.nextLine().toUpperCase();
        while(check == true){
            for(int i = 0; i < Last_Name[container].length(); i++){ 
                if((Last_Name[container].charAt(i) >= 'A' && Last_Name[container].charAt(i) <= 'Z') || Last_Name[container].charAt(i) == ' '){
                }// checks if each character is an alphabet and returns to input if not
                else{
                    System.out.print("Invalid input. Please enter last name again: ");
                    Last_Name[container] = input.nextLine().toUpperCase();
                    i = -1;
                }
            }
            if(Last_Name[container].isEmpty()){ // checks if the input string is empty or not
                System.out.print("Blank input. Please enter last name again: ");
                Last_Name[container] = input.nextLine().toUpperCase();
            }
            else{
                check = false;
            }
        }
        check = true;
        System.out.print("Enter gender (Male or Female): ");
        // user inputs gender
        Gender[container] = input.nextLine().toUpperCase();
        while(check == true){
            if(Gender[container].isEmpty()){ // checks if the input string is empty or not
                System.out.print("Blank input. Please enter gender again: ");
                Gender[container] = input.nextLine().toUpperCase();
            }
            else if(Gender[container].equals("MALE") || Gender[container].equals("FEMALE")){ // checks if the input string corresponds to gender options
                check = false;
            }
            else{
                System.out.print("Invalid input. Please enter gender again: ");
                Gender[container] = input.nextLine().toUpperCase();
            }
        }
        check = true;
        System.out.print("Enter age: ");
        // user inputs age
        while(check == true){
            try{
                Age[container] = input.nextInt();
                if(Age[container] >= 1){ // check if age input is natural number and returns to user input if not
                    check = false;
                }
                else{
                    System.out.print("Invalid input. Please enter age again: ");
                }
            }catch (InputMismatchException e){
                System.out.print("Invalid input. Please enter age again: ");
                input.next();
            }
        }
        input.nextLine();
        System.out.println();
        container++;
        return container;
    }
    public void Display(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container){ //displays residents' information
        System.out.print("\f");
        System.out.print("------------------------------------------------------------------");
        System.out.format("\n%-15s %-25s %-15s %-15s", "ID NUMBER", "NAME", "AGE", "GENDER");
        System.out.print("\n------------------------------------------------------------------");
        for(int i = 0; i < container; i++){
            System.out.format("\n%-15s %-25s %-15s %-15s", ID[i], Last_Name[i] + ", " + First_Name[i], Age[i], Gender[i]); // prints resident's info
        }
        System.out.println("\n\n");
    }
    public void Display(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int container, int i){ //overloading display method for displaying info during search
        System.out.format("\n%-20s %-30s %-15s %-15s", "ID Number: "+ID[i], "Name: "+Last_Name[i] + ", " + First_Name[i], "Age: "+Age[i], "Gender: "+Gender[i]);
    }
    public void Search(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int Choice, int container){
        boolean match;
        int count = 0;
        if(Choice == 1){
            match = false;
            System.out.print("\nEnter the ID number of the resident: ");
            int tempID = input.nextInt();
            System.out.print("\f");
            for(int i = 0; i < container; i++){
                if(ID[i] == tempID){
                    match = true;
                    Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                }
            }
            System.out.println("\n\n");
            if(!match){
                System.out.println("\fID not found.\n");
            }
        }
        else if(Choice == 2){
            match = false;
            System.out.print("\nEnter name: ");
            String tempName = input.nextLine().toUpperCase();
            System.out.print("\f");
            for(int i = 0; i < container; i++){
                if(tempName.equals(First_Name[i]) || tempName.equals(Last_Name[i])){
                    count++;
                }
            }
            System.out.println(count + " resident(s) found."); //number of residents found
            for(int i = 0; i < container; i++){
                if(tempName.equals(First_Name[i]) || tempName.equals(Last_Name[i])){
                    match = true;
                    Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                }
            }
            System.out.println("\n\n");
            if (!match) {
                System.out.println("\fName not found/invalid input.\n");
            }
        }
        else if(Choice == 3){
            match = false;
            System.out.println("\nChoose which gender:");
            System.out.println("(1) Male");
            System.out.println("(2) Female");
            System.out.print("Enter number of choice: ");
            Choice = input.nextInt();
            System.out.print("\f");
            if(Choice == 1){
                for(int i = 0; i < container; i++){
                    if(Gender[i].equals("MALE")){
                        count++;
                    }
                }
                System.out.println(count + " male resident(s) found."); //number of residents found
                for(int i = 0; i < container; i++){
                    if(Gender[i].equals("MALE")){
                        match = true;
                        Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                    }
                }
                System.out.println("\n\n");
                if(!match){
                    System.out.println("\fNo male residents found.\n");
                }
            }
            else if(Choice == 2){
                for(int i = 0; i < container; i++){
                    if(Gender[i].equals("FEMALE")){
                        count++;
                    }
                }
                System.out.println(count + " female resident(s) found."); //number of residents found
                for(int i = 0; i < container; i++){
                    if(Gender[i].equals("FEMALE")){
                        match = true;
                        Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                    }
                }
                System.out.println("\n\n");
                if(!match){
                    System.out.println("\fNo female residents found.\n");
                }
            }
            else{
                System.out.println("\fFailed to search. Invalid input.\n");
            }
        }
        else if(Choice == 4){
            match = false;
            System.out.println("\nChoose category of age:");
            System.out.println("(1) Young");
            System.out.println("(2) Adult");
            System.out.println("(3) Senior");
            System.out.print("Enter number of choice: ");
            Choice = input.nextInt();
            System.out.print("\f");
            if(Choice >= 1 && Choice <= 3){
                for(int i = 0; i < container; i++){
                    if((Choice == 1) && (Age[i] < 20 && Age[i] > 0)){ //young 1-19 years old
                        count++;
                    }
                    if((Choice == 2) && (Age[i] < 65 && Age[i] > 19)){ // adult 20-64 years old
                        count++;
                    }
                    if((Choice == 3) && (Age[i] > 64)){ //senior 65 years old and above
                        count++;
                    }
                }
                System.out.println(count + " resident(s) found."); //number of residents found
                for(int i = 0; i < container; i++){
                    if((Choice == 1) && (Age[i] < 20 && Age[i] > 0)){ //young 1-19 years old
                        Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                        match = true;
                    }
                    if((Choice == 2) && (Age[i] < 65 && Age[i] > 19)){ // adult 20-64 years old
                        Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                        match = true;
                    }
                    if((Choice == 3) && (Age[i] > 64)){ //senior 65 years old and above
                        Display(First_Name, Last_Name, Gender, Age, ID, container, i);
                        match = true;
                    }
                }
                if(!match){
                    System.out.print("\fNo residents within the age category found.");
                }
                System.out.println("\n\n");
            }
            else{
                System.out.println("\fFailed to search. Invalid input.\n");
            }
        }
    }
    public void Sort(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int Choice, int container){ //Sorting and Display
        if(Choice == 1){
            for(int i = 0; i < container-1; i++){ //a-z order
                for(int j = i + 1; j < container; j++){
                    if(Last_Name[i].compareTo(Last_Name[j])>0){ 
                        sortSwitch(First_Name, Last_Name, Gender, Age, ID, i, j); 
                    }
                    else if(Last_Name[i].compareTo(Last_Name[j])==0){ 
                        if(First_Name[i].compareTo(First_Name[j])>0){ 
                            sortSwitch(First_Name, Last_Name, Gender, Age, ID, i, j);
                        }
                    }
                }
            }
            Display(First_Name, Last_Name, Gender, Age, ID, container);
        }
        else if(Choice == 2){ //z-a order
            for(int i = 0; i < container-1; i++){
                for(int j = i + 1; j < container; j++){
                    if(Last_Name[i].compareTo(Last_Name[j])<0){ 
                        sortSwitch(First_Name, Last_Name, Gender, Age, ID, i, j); 
                    }
                    else if(Last_Name[i].compareTo(Last_Name[j])==0){ 
                        if(First_Name[i].compareTo(First_Name[j])<0){ 
                            sortSwitch(First_Name, Last_Name, Gender, Age, ID, i, j); 
                        }
                    }
                }
            }
            Display(First_Name, Last_Name, Gender, Age, ID, container);
        }
        else if(Choice == 3){ // age ascending order
            for(int i = 0; i < container-1; i++){
                for(int j = i + 1; j < container; j++){
                    if(Age[i] > Age[j]){
                        sortSwitch(First_Name, Last_Name, Gender, Age, ID, i, j);
                    }
                }
            }
            Display(First_Name, Last_Name, Gender, Age, ID, container);
        }
        else if(Choice == 4){ //age descending order
            for(int i = 0; i < container-1; i++){
                for(int j = i + 1; j < container; j++){
                    if(Age[i] < Age[j]){
                        sortSwitch(First_Name, Last_Name, Gender, Age, ID, i, j);
                    }
                }
            }
            Display(First_Name, Last_Name, Gender, Age, ID, container);
        }
    }
    public void sortSwitch(String[] First_Name, String[] Last_Name, String[] Gender, int[] Age, int[] ID, int i, int j){
        String tempLast_Name = Last_Name[i]; //swapping of last name
        Last_Name[i] = Last_Name[j];
        Last_Name[j] = tempLast_Name;
        
        String tempFirst_Name = First_Name[i]; //swapping of first name
        First_Name[i] = First_Name[j];
        First_Name[j] = tempFirst_Name;
        
        String tempGender = Gender[i]; //swapping of gender
        Gender[i] = Gender[j];
        Gender[j] = tempGender;
        
        int tempAge = Age[i]; //swapping of age
        Age[i] = Age[j];
        Age[j] = tempAge;
        
        int tempID = ID[i]; //swapping of ID
        ID[i] = ID[j];
        ID[j] = tempID;
    }
}