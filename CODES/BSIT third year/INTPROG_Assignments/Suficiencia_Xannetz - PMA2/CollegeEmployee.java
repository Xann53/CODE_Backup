import java.util.*;
public class CollegeEmployee extends Person {
    private Scanner input = new Scanner(System.in);
    private int ssNum;
    private double annSal;
    private String depName;
    
    public void SetData() {
        Boolean temp = false;
        super.SetData();
        while(!temp) {
            try {
                System.out.print("Enter social security number: ");
                ssNum = input.nextInt();
                temp = true;
            } catch(Exception e) {
                input.next();
                System.out.print("Invalid input. ");
            }
        }
        temp = false;
        while(!temp) {
            try {
                System.out.print("Enter annual salary: ");
                annSal = input.nextDouble();
                temp = true;
            } catch(Exception e) {
                input.next();
                System.out.print("Invalid input. ");
            }
        }
        System.out.print("Enter department name: ");
        depName = input.next();
    }
    public void Display() {
        super.Display();
        System.out.println("\t\tSocial Security Number is " + ssNum);
        System.out.println("\t\tAnnual Salary is " + annSal);
        System.out.println("\t\tDepartment Name is " + depName);
    }
}