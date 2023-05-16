import java.util.*;
public class Process
{
    private Scanner input = new Scanner(System.in);
    private Employee empOBJ;
    private Student stuOBJ;
    private Customer cusOBJ;
    private boolean proceed;
    
    public void Menu() {
        proceed = false;
        while(!proceed) {
            System.out.println("Choose to change\n- Employee\n- Customer\n- Student\n- None");
            System.out.print("Input: ");
            String choice = input.nextLine();
            System.out.print("\n");
            if(choice.equalsIgnoreCase("EMPLOYEE") || choice.equalsIgnoreCase("EMP") || choice.equalsIgnoreCase("E")) {
                proceed = true;
                InputEmp();
            } else if(choice.equalsIgnoreCase("CUSTOMER") || choice.equalsIgnoreCase("CUS") || choice.equalsIgnoreCase("C")) {
                proceed = true;
                InputCus();
            } else if(choice.equalsIgnoreCase("STUDENT") || choice.equalsIgnoreCase("STU") || choice.equalsIgnoreCase("S")) {
                proceed = true;
                InputStu();
            } else if(choice.equalsIgnoreCase("NONE") || choice.equalsIgnoreCase("N")) {
                proceed = true;
            } else {
                System.out.println("\fInvalid Choice!\n");
            }
        }
    }
    public void InputEmp() {
        int empNum=0, age=0;
        String position=null, name=null, gender=null,
               street=null, barangay=null, cityMun=null;
        
        System.out.print("Enter employee name: ");
        name = input.nextLine();
        System.out.print("Enter employee gender: ");
        gender = input.nextLine();
        proceed = false;
        while(!proceed) {
            try {
                System.out.print("Enter employee age: ");
                String temp = input.nextLine();
                age = Integer.parseInt(temp);
                proceed = true;
            } catch(Exception e) {
                System.out.print("Invalid Input! ");
            }
        }
        proceed = false;
        while(!proceed) {
            try {
                System.out.print("Enter employee number: ");
                String temp = input.nextLine();
                empNum = Integer.parseInt(temp);
                proceed = true;
            } catch(Exception e) {
                System.out.print("Invalid Input! ");
            }
        }
        System.out.print("Enter employee position: ");
        position = input.nextLine();
        System.out.print("Enter street address: ");
        street = input.nextLine();
        System.out.print("Enter barangay address: ");
        barangay = input.nextLine();
        System.out.print("Enter city or municipality address: ");
        cityMun = input.nextLine();
        
        empOBJ = new Employee(empNum, position, name, gender, age, street, barangay, cityMun);
    }
    public void InputCus() {
    
    }
    public void InputStu() {
    
    }
}