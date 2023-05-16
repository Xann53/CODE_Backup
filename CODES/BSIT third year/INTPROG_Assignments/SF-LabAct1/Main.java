import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {
    private static String idno, lastname,
    firstname, contactno, tempOut, menuChoice;
    private static String tempArr[];
    private static boolean loop = true;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu() {
        while(loop) {
            System.out.println("[1] Enter Data");
            System.out.println("[2] Search Data");
            System.out.println("[3] Display All Data");
            System.out.println("[0] Quit");
            System.out.print("Enter choice here: ");
            menuChoice = input.nextLine();
            if(menuChoice.equals("1")){
                String temp;
                
                System.out.print("\fEnter ID number: ");
                temp = input.nextLine();
                temp = temp.trim();
                idno = temp.replaceAll("\\s+", "_");
                
                System.out.print("Enter last name: ");
                temp = input.nextLine();
                temp = temp.trim();
                lastname = temp.replaceAll("\\s+", "_");
                
                System.out.print("Enter first name: ");
                temp = input.nextLine();
                temp = temp.trim();
                firstname = temp.replaceAll("\\s+", "_");
                
                System.out.print("Enter contact number: ");
                temp = input.nextLine();
                temp = temp.trim();
                contactno = temp.replaceAll("\\s+", "_");
                
                EnterValues();
                System.out.print("\f");
            } else if(menuChoice.equals("2")) {
                SearchID();
            } else if(menuChoice.equals("3")) {
                DisplayAll();
            } else if(menuChoice.equals("0")) {
                loop = false;
                System.out.print("\f");
            } else {
                System.out.println("\fInvalid Input. Please try again...\n");
            }
        }
    }
    public static void EnterValues() {
        try {
            FileWriter writeFile = new FileWriter("datafile.txt", true);
            BufferedWriter outFile = new BufferedWriter(writeFile);
            outFile.write(idno + " ");
            outFile.write(lastname + " ");
            outFile.write(firstname + " ");
            outFile.write(contactno);
            outFile.newLine();
            outFile.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
    public static void SearchID() {
        System.out.print("\fEnter the ID to search for: ");
        String tempId = input.nextLine();
        DisplayOne(tempId);
    }
    public static void DisplayOne(String tempId) {
        System.out.print("\n");
        ListHeader();
        try {
            FileReader readFile = new FileReader("datafile.txt");
            BufferedReader inFile = new BufferedReader(readFile);
            tempOut = inFile.readLine();
            while(tempOut != null) {
                tempArr = tempOut.split("\\s+");
                if(tempArr[0].equals(tempId))
                    PrintList();
                tempOut = inFile.readLine();
            }
            inFile.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
        System.out.print("\n");
    }
    public static void DisplayAll() {
        System.out.print("\f");
        ListHeader();
        try {
            FileReader readFile = new FileReader("datafile.txt");
            BufferedReader inFile = new BufferedReader(readFile);
            tempOut = inFile.readLine();
            while(tempOut != null) {
                tempArr = tempOut.split("\\s+");
                PrintList();
                tempOut = inFile.readLine();
            }
            inFile.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
        System.out.print("\n");
    }
    public static void ListHeader() {
        String header = String.format("%14s %28s %29s %33s", "ID Number", "Last Name", "First Name", "Contact Number");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println(header);
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
    }
    public static void PrintList() {
        String row = String.format("%4s %-28s %-28s %-29s %.50s", "", tempArr[0].replaceAll("_", "\s"), tempArr[1].replaceAll("_", "\s"), tempArr[2].replaceAll("_", "\s"), tempArr[3].replaceAll("_", "\s"));
        System.out.print(row);
        System.out.print("\n");
    }
}