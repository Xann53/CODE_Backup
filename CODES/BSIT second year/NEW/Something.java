import java.util.Scanner;
public class Something
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int menu, turn = 1;
        int num[] = new int[1000000];
        do
        {
            System.out.print("--------------- MENU ---------------");
            System.out.print("\n1. Input");
            System.out.print("\n2. Sort");
            System.out.print("\n3. Search");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter the number of your choice: ");
            menu = input.nextInt();
            
            switch(menu)
            {
                case 1:
                    num = Input();
                    System.out.print("\n");
                    break;
                case 2:
                    if(turn > 1)
                    {
                        Sort(num);
                    }
                    System.out.print("\n");
                    break;
                case 3:
                    if(turn > 1)
                    {
                        Search(num);
                    }
                    System.out.print("\n");
                    break;
                default:
                    System.out.print("\f");
                    System.out.print("Envalid input. Please try again.\n\n");
            }
            if(menu == 1)
            {
                turn++;
            }
        }
        while(menu != 0);
        System.out.print("\f");
    }
    public static int[] Input()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\f");
        System.out.print("How many numbers would you like to input?: ");
        int n = input.nextInt();
        int Numbers[] = new int[n];
        System.out.println("Enter the number/s:");
        for(int i = 0; i < Numbers.length; i++)
        {
            Numbers[i] = input.nextInt();
        }
        return Numbers;
    }
    public static void Sort(int Numbers[])
    {
        Scanner input = new Scanner(System.in);
        int temp=0, count = Numbers.length;
        System.out.print("\f");
        System.out.print("How would you like to Sort?:");
        System.out.print("\n1. Ascending");
        System.out.print("\n2. Descending");
        System.out.print("\nEnter the number of choice: ");
        int menu = input.nextInt();
        switch(menu)
        {
            case 1:
                for (int i = 0; i < count; i++) 
                {
                    for (int j = i + 1; j < count; j++)
                    { 
                        if (Numbers[i] > Numbers[j]) 
                        {
                            temp = Numbers[i];
                            Numbers[i] = Numbers[j];
                            Numbers[j] = temp;
                        }
                    }
                }
                Display(Numbers);
                break;
            case 2:
                for (int i = 0; i < count; i++) 
                {
                    for (int j = i + 1; j < count; j++)
                    { 
                        if (Numbers[i] < Numbers[j]) 
                        {
                            temp = Numbers[i];
                            Numbers[i] = Numbers[j];
                            Numbers[j] = temp;
                        }
                    }
                }
                Display(Numbers);
                break;
            default:
                System.out.print("Envalid input.\n\n");
        }
    }
    public static void Search(int Numbers[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\f");
        System.out.print("What would you like to search for?:");
        System.out.print("\n1. Even numbers");
        System.out.print("\n2. Odd numbers");
        System.out.print("\n3. Numbers divisible by...");
        System.out.print("\nEnter the number of choice: ");
        int menu = input.nextInt();
        switch(menu)
        {
            case 1:
                System.out.print("\f");
                System.out.print("--------------- DISPLAY ---------------");
                for(int i = 0; i < Numbers.length; i++)
                {
                    if(Numbers[i] % 2 == 0)
                    {
                        System.out.print("\n" + Numbers[i]);
                    }
                }
                System.out.print("\n");
                break;
            case 2:
                System.out.print("\f");
                System.out.print("--------------- DISPLAY ---------------");
                for(int i = 0; i < Numbers.length; i++)
                {
                    if(Numbers[i] % 2 != 0)
                    {
                        System.out.print("\n" + Numbers[i]);
                    }
                }
                System.out.print("\n");
                break;
            case 3:
                System.out.print("\f");
                System.out.print("Numbers divisible by: ");
                int n = input.nextInt();
                System.out.print("--------------- DISPLAY ---------------");
                for(int i = 0; i < Numbers.length; i++)
                {
                    if(Numbers[i] % n == 0)
                    {
                        System.out.print("\n" + Numbers[i]);
                    }
                }
                System.out.print("\n");
                break;
            default:
                System.out.print("Envalid input.\n\n");
        }
    }
    public static void Display(int Numbers[])
    {
        System.out.print("\f");
        System.out.print("--------------- DISPLAY ---------------");
        for(int i = 0; i < Numbers.length; i++)
        {
            System.out.print("\n" + Numbers[i]);
        }
        System.out.print("\n");
    }
}