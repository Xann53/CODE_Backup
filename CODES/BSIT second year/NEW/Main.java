import java.util.Scanner;
public class Main
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        /*PartTimeEmployee pt = new PartTimeEmployee("567d8as","Someone","Wza","sep 5, 1999","cebu",500,8);
        Person p = new Person("#66684","Argel","Urmeneta","December 12, 2000","Lilo-an");*/
        String ID, fName, lName, bDate, add;
        double pRate, hWorked;
        PartTimeEmployee pt = new PartTimeEmployee();
        Person p = new Person();
        
        System.out.println("PERSON INFO");
        System.out.print("Enter ID number: ");
        ID = scan.nextLine();
        System.out.print("Enter First name: ");
        fName = scan.nextLine();
        System.out.print("Enter Last name: ");
        lName = scan.nextLine();
        System.out.print("Enter Birth date: ");
        bDate = scan.nextLine();
        System.out.print("Enter address: ");
        add = scan.nextLine();
        p.setPerson(ID, fName, lName, bDate, add);
        
        
        System.out.print("Enter Pay rate: ");
        pRate = scan.nextDouble();
        System.out.print("Enter Hours worked: ");
        hWorked = scan.nextDouble();
        pt.setNameRateHours(ID,fName,lName,bDate, add, pRate,  hWorked);
        
        System.out.println("\nPERSON");
        p.print();
        System.out.println("\nPART TIME EMPLOYEE");
        System.out.println(pt);
    }
}