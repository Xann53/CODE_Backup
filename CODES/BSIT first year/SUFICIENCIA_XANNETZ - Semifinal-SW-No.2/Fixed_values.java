public class Fixed_values
{
    public static void main(String [] args)
    {
        int points[] = {100, 90, 80, 70, 60};
        
        System.out.println("Here are the points and their corresponding prices:\n");
        
        for(int i: points)
        {
            System.out.print(i + " points");
            
            if(i == 100)
            {
                System.out.println(" = 150 000 cash price plus a brand new house.");
            }
            else if(i == 90)
            {
                System.out.println(" = 100 000 cash price plus a brand new car.");
            }
            else if(i == 80)
            {
                System.out.println(" = 50 000 cash price plus a brand new refrigerator and kitchen appliances.");
            }
            else if(i == 70)
            {
                System.out.println(" = 50 000 cash price plus a gift basket.");
            }
            else if(i == 60)
            {
                System.out.println(" = 30 000 cash price.");
            }
        }
    }
}