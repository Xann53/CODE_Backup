import java.util.Scanner;
public class OneDimensional_Array
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        System.out.println();
        
        int element[] = new int[n];
        
        for(int i = 0; i < element.length; i++)
        {
            System.out.print("Enter the element [" + i + "]: ");
            element[i] = input.nextInt();
        }
        System.out.println("\n---------------------------------------------------");
        System.out.println("The elements of array are:");
        displayElement(element);
        System.out.print("\n\nThe maximum index of the array is: " + maxIndex(element));
        System.out.print("\nThe highest value of the array is: " + maxElement(element));
        System.out.print("\nThe lowest value of the array is: " + minElement(element));
        System.out.print("\nThe sum of all elements in the array is: " + sumElement(element));
        System.out.print("\nThe average of all elements in the array is: " + averageElement(element));
        System.out.print("\nThe count of all elements in the array is: " + countElement(element));
    }
    public static int maxIndex(int element[])
    {
        int counter = 0;
        for(int i = 0; i < element.length; i++)
        {
            counter += 1;
        }
        return counter = counter - 1;
    }
    public static int maxElement(int element[])
    {
        int highestvalue = 0;
        for(int i: element)
        {
            if(i > highestvalue)
            {
                highestvalue = i;
            }
        }
        return highestvalue;
    }
    public static int minElement(int element[])
    {
        int lowestvalue = element[0];
        for(int i: element)
        {
            if(i < lowestvalue)
            {
                lowestvalue = i;
            }
        }
        return lowestvalue;
    }
    public static int sumElement(int element[])
    {
        int totalsum = 0;
        for(int i = 0; i < element.length; i++)
        {
            totalsum += element[i];
        }
        return totalsum;
    }
    public static double averageElement(int element[])
    {
        double totalsum = 0;
        double counter = 0;
        for(int i = 0; i < element.length; i++)
        {
            totalsum += element[i];
            counter += 1;
        }
        double totalaverage = totalsum / counter;
        return totalaverage;
    }
    public static int countElement(int element[])
    {
        int counter = 0;
        for(int i = 0; i < element.length; i++)
        {
            counter += 1;
        }
        return counter;
    }
    public static void displayElement(int element[])
    {
        for(int i: element)
        {
            System.out.print(i + " ");
        }
    }
}