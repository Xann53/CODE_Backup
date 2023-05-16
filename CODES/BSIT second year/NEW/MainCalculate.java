import java.util.Scanner;
public class MainCalculate{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Calculate one = new Calculate();
        boolean con = true;
        int choice;
        do{             //Loop for Menu
            System.out.println("MENU\nENTER '1' TO ADD NUMBERS (Using default Constructor)"+
                               "\nENTER '2' TO ADD NUMBERS (Using default non-Constructor)\nENTER '0' TO EXIT\n");
            System.out.print("Choice: ");
            choice = s.nextInt();
            if(choice == 1){        //Adding the 4 numbers and the whole formulation (Using Default Construtor)
                System.out.print("\fENTER FOUR INTEGERS\n");
                System.out.print("\nEnter the 1st number: ");
                int n1 = s.nextInt();
                one.setNum1(n1);
                System.out.print("Enter the 2nd number: ");     
                int n2 = s.nextInt();                           //The input Values
                one.setNum2(n2);
                System.out.print("Enter the 3rd number: ");
                int n3 = s.nextInt();
                one.setNum3(n3);
                System.out.print("Enter the 4th number: ");
                int n4 = s.nextInt();
                one.setNum4(n4);
                
                System.out.println("\fThe numbers are: '"+one.getNum1()+", "+one.getNum2()+     //Display Values
                                   ", "+one.getNum3()+" and "+one.getNum4()+"'\n");
                System.out.println("'"+one.getLargest()+"'");
                System.out.println("'"+one.getSmallest()+"'\n");                            //Formulas
                one.getSquare();
                one.getFactorial();
                one.getSummation();
                one.PerNum();
                one.PrimeNum();
            }
            else if(choice == 2){                 //Adding the 4 numbers and the whole formulation (Using Default Construtor)
                System.out.print("\fENTER FOUR INTEGERS\n");
                System.out.print("\nEnter the 1st number: ");
                int n1 = s.nextInt();
                System.out.print("Enter the 2nd number: ");
                int n2 = s.nextInt();                                                               //Input Values
                System.out.print("Enter the 3rd number: ");
                int n3 = s.nextInt();
                System.out.print("Enter the 4th number: ");
                int n4 = s.nextInt();
                Calculate two = new Calculate(n1,n2,n3,n4);
                System.out.println("\fThe numbers are: '"+two.getNum1()+", "+two.getNum2()+         //Display Values
                                   ", "+two.getNum3()+" and "+two.getNum4()+"'\n");
                System.out.println("'"+two.getLargest()+"'");
                System.out.println("'"+two.getSmallest()+"'\n");
                two.getSquare();
                two.getFactorial();                                                                  //Formulas
                two.getSummation();
                two.PerNum();
                two.PrimeNum();
            }
            else if(choice == 0 ){              //exit condition
                con = false;
                System.out.println("\fProram Terminated...\nThank you!");
            }
            else{
                System.out.println("\fInvalid Input! Please Try Again...\n");
            }
        }while(con == true);
    }   
    
    }