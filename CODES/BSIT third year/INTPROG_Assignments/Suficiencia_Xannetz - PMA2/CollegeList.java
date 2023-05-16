import java.util.*;
public class CollegeList {
    private static Scanner input = new Scanner(System.in);
    private static CollegeEmployee[] empOBJ = new CollegeEmployee[4];
    private static Faculty[] facOBJ = new Faculty[3];
    private static Student[] stuOBJ = new Student[7];
    private static Boolean tempBool = false;
    private static String choice;
    
    public static void main(String[] args) {
        while(!tempBool) {
            System.out.println("Employee [C]\nFaculty\t [F]\nStudent\t [S]\nQuit\t [Q]");
            System.out.print("Enter letter of choice: ");
            choice = input.next();
            if(choice.equalsIgnoreCase("C")) {
                CEmployee();
            } else if(choice.equalsIgnoreCase("F")) {
                Faculty();
            } else if(choice.equalsIgnoreCase("S")) {
                Student();
            } else if(choice.equalsIgnoreCase("Q")) {
                tempBool = true;
                input.nextLine();
                DisplayAll();
                System.out.println("\nPress ENTER to proceed...");
                input.nextLine();
                System.out.print("\f");
            } else
                System.out.println("\fInvalid input!");
        }
    }
    public static void CEmployee() {
        for(int i = 0; i < empOBJ.length; i++) {
            empOBJ[i] = new CollegeEmployee();
            System.out.println("\fEnter data for College Employee " + (i+1) +":\n");
            empOBJ[i].SetData();
            System.out.print("\f");
        }
    }
    public static void Faculty() {
        for(int i = 0; i < facOBJ.length; i++) {
            facOBJ[i] = new Faculty();
            System.out.println("\fEnter data for Faculty Employee " + (i+1) +":\n");
            facOBJ[i].SetData();
            System.out.print("\f");
        }
    }
    public static void Student() {
        for(int i = 0; i < stuOBJ.length; i++) {
            stuOBJ[i] = new Student();
            System.out.println("\fEnter data for Student " + (i+1) +":\n");
            stuOBJ[i].SetData();
            System.out.print("\f");
        }
    }
    public static void DisplayAll() {
        System.out.println("\fCollege Employee List: \n");
        for(int i = 0; i < empOBJ.length; i++) {
            try{
                System.out.println("\tCollege Employee no. " + (i+1) + "\n");
                empOBJ[i].Display();
                System.out.println();
            } catch(Exception e) {
                System.out.println("\t\tNo data found\n");
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Faculty Employee List: \n");
        for(int i = 0; i < facOBJ.length; i++) {
            try{
                System.out.println("\tFaculty Employee no. " + (i+1) + "\n");
                facOBJ[i].Display();
                System.out.println();
            } catch(Exception e) {
                System.out.println("\t\tNo data found\n");
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Student List: \n");
        for(int i = 0; i < stuOBJ.length; i++) {
            try{
                System.out.println("\tStudent no. " + (i+1) + "\n");
                stuOBJ[i].Display();
                System.out.println();
            } catch(Exception e) {
                System.out.println("\t\tNo data found\n");
            }
        }
    }
}