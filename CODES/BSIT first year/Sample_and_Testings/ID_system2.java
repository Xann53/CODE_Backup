import java.util.Scanner;
public class ID_system2
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int menu, n=0;
        int ID[] = new int[10000];
        String L_Name[] = new String[10000];
        String F_Name[] = new String[10000];
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
                    System.out.println("\nADD DATA");
                    System.out.print("Enter ID No.: ");
                    ID[n] = input.nextInt();
                    System.out.print("\nEnter Last Name: ");
                    L_Name[n] = input.next();
                    System.out.print("\nEnter First Name: ");
                    F_Name[n] = input.next();
                    n++;
                    break;
                case 2:
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
                    break;
                case 3:
                    System.out.println("\nUPDATE DATA");
                    System.out.print("Enter ID No. to update: ");
                    int num_update = input.nextInt();
                    for(int i = 0; i < n; i++)
                    {
                        if(ID[i] == num_update)
                        {
                            System.out.print("\nUpdate Last Name: ");
                            L_Name[i] = input.next();
                            System.out.print("\nUpdate First Name: ");
                            F_Name[i] = input.next();
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nDISPLAY INFORMATION");
                    System.out.println("ID No.\tLast Name\tFirst Name");
                    for(int i = 0; i < n; i++)
                    {
                        System.out.println(ID[i] + "\t" + L_Name[i] + "\t" + F_Name[i]);
                    }
            }
        }
        while(menu != 0);
        System.out.print("\f");
    }
}