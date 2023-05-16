import java.util.Scanner;
public class MainCalculate{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Calculate one = new Calculate();
        boolean con = true;
        int choice;
        do{
            System.out.println("MENU\nENTER '1' TO ADD NUMBERS\nENTER '0' TO EXIT\n");
            System.out.print("Choice: ");
            choice = s.nextInt();
            if(choice == 1){
                System.out.print("\fENTER FOUR INTEGERS\n");
                System.out.print("\nEnter the 1st number: ");
                int n1 = s.nextInt();
                System.out.print("Enter the 2nd number: ");
                int n2 = s.nextInt();
                System.out.print("Enter the 3rd number: ");
                int n3 = s.nextInt();
                System.out.print("Enter the 4th number: ");
                int n4 = s.nextInt();
                Calculate two = new Calculate(n1,n2,n3,n4);
                System.out.println("\fThe numbers are: '"+two.getNum1()+", "+two.getNum2()+
                                   ", "+two.getNum3()+" and "+two.getNum4()+"'\n");
                System.out.println("'"+two.getLargest()+"'");
                System.out.println("'"+two.getSmallest()+"'\n");
                System.out.println("'"+two.getSquare1()+"'");
                System.out.println("'"+two.getSquare2()+"'");
                System.out.println("'"+two.getSquare3()+"'");
                System.out.println("'"+two.getSquare4()+"'\n");
                System.out.println("'"+two.getFactorial1()+"'");
                System.out.println("'"+two.getFactorial2()+"'");
                System.out.println("'"+two.getFactorial3()+"'");
                System.out.println("'"+two.getFactorial4()+"'\n");
                System.out.println("'"+two.getSummation1()+"'");
                System.out.println("'"+two.getSummation2()+"'");
                System.out.println("'"+two.getSummation3()+"'");
                System.out.println("'"+two.getSummation4()+"'\n");
                two.PerNum1();
                two.PerNum2();
                two.PerNum3();
                two.PerNum4();
                System.out.println("\n");
            }
            else if(choice < 0 || choice > 1){
                System.out.println("\fInvalid Input! Please Try Again...\n");
            }
            else{
                con = false;
                System.out.println("\fProram Terminated...\nThank you!");
            }
        }while(con == true);
    }

}