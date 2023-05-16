import java.util.Scanner;
public class sampleOperations {
    
    private static sampleRecord[] rec;
    private static int index = 0, size = 999999;
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        rec = new sampleRecord[size];
        String name = "";
        do {
            try {
                System.out.print("Enter name: ");
                name = input.nextLine();
                if(name.equalsIgnoreCase("v")) {
                    for(int i = 0; i < rec.length && rec[i].getName() != null; i++) {
                        System.out.println(rec[i].getName());
                    }
                }
                rec[index] = new sampleRecord(name);
                index++;
            } catch(Exception e) {}
        } while(!(name.equalsIgnoreCase("x")));
        System.out.print("\f");
    }
}