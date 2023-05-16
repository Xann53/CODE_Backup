import java.io.*;
public class CMSModules{
    public static void addData(String IDNo, String lastname, String firstname, String contact, String address){
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("datafile.txt",true));
            output.write(IDNo+" ");
            output.write(lastname+" ");
            output.write(firstname+" ");
            output.write(contact+" ");
            output.write(address);
            output.newLine();
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public static void displayAll(){
        try {
            String strCurrentLine, data[]=new String[1000];
            FileReader file = new FileReader("datafile.txt");
            BufferedReader input = new BufferedReader(file);
            System.out.println();
            System.out.println("Data in the Data Bank:");
            while ((strCurrentLine = input.readLine()) != null) {
                //System.out.println(strCurrentLine);
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }    
    }
}
