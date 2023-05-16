import java.util.*;
public class Faculty extends CollegeEmployee {
    private Scanner input = new Scanner(System.in);
    private Boolean tenure;
    
    public void SetData() {
        Boolean tempBool = false;
        super.SetData();
        while(!tempBool) {
            System.out.print("Is employee a tenure (yes/no): ");
            String tempStr = input.nextLine();
            if(tempStr.equalsIgnoreCase("yes") || tempStr.equalsIgnoreCase("y")) {
                tenure = true;
                tempBool = true;
            } else if(tempStr.equalsIgnoreCase("no") || tempStr.equalsIgnoreCase("n")) {
                tenure = false;
                tempBool = true;
            } else
                System.out.print("Invalid input. ");
        }
    }
    public void Display() {
        super.Display();
        if(tenure)
            System.out.println("\t\tEmployee is a Tenure");
        else if(!tenure)
            System.out.println("\t\tEmployee is not a Tenure");
    }
}