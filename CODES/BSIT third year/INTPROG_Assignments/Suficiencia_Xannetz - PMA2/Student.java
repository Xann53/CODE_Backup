import java.util.*;
public class Student extends Person {
    private Scanner input = new Scanner(System.in);
    private String major;
    private double gpa;
    
    public void SetData() {
        Boolean temp = false;
        super.SetData();
        System.out.print("Enter major: ");
        major = input.nextLine();
        while(!temp) {
            try {
                System.out.print("Enter grade point average: ");
                gpa = input.nextDouble();
                temp = true;
            } catch(Exception e) {
                input.next();
                System.out.print("Invalid input. ");
            }
        }
    }
    public void Display() {
        super.Display();
        System.out.println("\t\tMajor is " + major);
        System.out.println("\t\tGrade Point Average is " + gpa);
    }
}