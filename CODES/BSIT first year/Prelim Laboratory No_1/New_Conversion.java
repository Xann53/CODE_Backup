import java.util.Scanner;
public class New_Conversion
{
    public static void main(String [] args)
    {
        Conversion Hello = new Conversion();
        
        Scanner yolo = new Scanner(System.in);
      
        System.out.print("Input value in meter/s: ");
        double meter=yolo.nextDouble();
        
        Hello.convert(meter);
    }
}