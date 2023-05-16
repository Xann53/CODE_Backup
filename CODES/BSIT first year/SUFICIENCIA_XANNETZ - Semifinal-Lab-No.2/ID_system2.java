import java.util.Scanner;
public class ID_system2
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
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
                    ID[n] = addData_ID();
                    L_Name[n] = addData_LName();
                    F_Name[n] = addData_FName();
                    n++;
                    break;
                case 2:
                    searchData(n, ID, L_Name, F_Name);
                    break;
                case 3:
                    int num = updateData();
                    for(int i = 0; i < n; i++)
                    {
                        if(ID[i] == num)
                        {
                            L_Name[i] = updateData_LName();
                            F_Name[i] = updateData_FName();
                        }
                    }
                    break;
                case 4:
                    displayData(n, ID, L_Name, F_Name);
                    break;
                default:
                    System.out.println("\nInvalid Input. Please try again.");
            }
        }
        while(menu != 0);
        System.out.print("\f");
    }
    public static int addData_ID()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nADD DATA");
        System.out.print("Enter ID No.: ");
        int ID = input.nextInt();
        return ID;
    }
    public static String addData_LName()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter Last Name: ");
        String L_Name = input.next();
        return L_Name;
    }
    public static String addData_FName()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter First Name: ");
        String F_Name = input.next();
        return F_Name;
    }
    public static void searchData(int n, int ID[], String L_Name[], String F_Name[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nSEARCH DATA");
        System.out.print("Enter ID No.: ");
        int num_search = input.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(ID[i] == num_search)
            {
                System.out.println("\nPersonal Information");
                System.out.println("ID No.: " + ID[i]);
                System.out.println("Lastname: " + L_Name[i]);
                System.out.println("Firstname: " + F_Name[i]);
            }
        }
    }
    public static int updateData()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nUPDATE DATA");
        System.out.print("Enter ID No. to update: ");
        int num_update = input.nextInt();
        return num_update;
    }
    public static String updateData_LName()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nUpdate Last Name: ");
        String L_Name = input.next();
        return L_Name;
    }
    public static String updateData_FName()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nUpdate First Name: ");
        String F_Name = input.next();
        return F_Name;
    }
    public static void displayData(int n, int ID[], String L_Name[], String F_Name[])
    {
        System.out.println("\nDISPLAY INFORMATION");
        System.out.println("ID No.\t\t\tLast Name\t\tFirst Name");
        for(int i = 0; i < n; i++)
        {
            System.out.println(ID[i] + "\t\t\t" + L_Name[i] + "\t\t\t" + F_Name[i]);
        }
    }
}