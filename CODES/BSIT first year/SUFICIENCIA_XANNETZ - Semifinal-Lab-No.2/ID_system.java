import java.util.Scanner;
public class ID_system
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        ID_systemMethods method = new ID_systemMethods();
        int menu, n=0;
        int ID[] = new int[10000];
        String L_Name[] = new String[10000], F_Name[] = new String[10000];
        do
        {
            System.out.println("\nMenu");
            System.out.println("1. Add Data");
            System.out.println("2. Search Data");
            System.out.println("3. Update Data");
            System.out.println("4. Display all");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            menu = input.nextInt();
            
            switch (menu)
            {
                case 1:
                    ID[n] = method.addData_ID();
                    L_Name[n] = method.addData_LName();
                    F_Name[n] = method.addData_FName();
                    n++;
                    break;
                case 2:
                    method.searchData(n, ID, L_Name, F_Name);
                    break;
                case 3:
                    int num = method.updateData();
                    for(int i = 0; i < n; i++)
                    {
                        if(ID[i] == num)
                        {
                            L_Name[i] = method.updateData_LName();
                            F_Name[i] = method.updateData_FName();
                        }
                    }
                    break;
                case 4:
                    method.displayData(n, ID, L_Name, F_Name);
                    break;
                default:
                    System.out.println("\nInvalid Input. Please try again.");
            }
        }
        while(menu != 0);
        System.out.print("\f");
    }
}