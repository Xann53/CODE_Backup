import java.util.*;
public class Person {
    private Scanner input = new Scanner(System.in);
    private String fName, lName, strAdd, zipCode; 
    private int phoneNum;
    
    public void SetData() {
        Boolean temp = false;
        System.out.print("Enter first name: ");
        fName = input.nextLine();
        System.out.print("Enter last name: ");
        lName = input.nextLine();
        System.out.print("Enter street address: ");
        strAdd = input.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = input.nextLine();
        while(!temp) {
            try {
                System.out.print("Enter phone number: ");
                phoneNum = input.nextInt();
                temp = true;
            } catch(Exception e) {
                input.next();
                System.out.print("Invalid input. ");
            }
        }
    }
    public void Display() {
        System.out.println("\t\tFirst Name is " + fName);
        System.out.println("\t\tLast Name is " + lName);
        System.out.println("\t\tStreet Address is " + strAdd);
        System.out.println("\t\tZip Code is " + zipCode);
        System.out.println("\t\tPhone Number is " + phoneNum);
    }
}