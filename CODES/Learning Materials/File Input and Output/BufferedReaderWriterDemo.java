import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderWriterDemo {

    public static void main(String args[]) {

        String data = "This is the data in the output file buffered reader and writer program";

        try {
            //Creates a FileWriter
            FileWriter file = new FileWriter("output.txt");
            //Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);
            //Writes the string to the file
            //BufferedWriter output =new BufferedWriter(new FileWriter("output.txt"));
            output.write(data);
            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

        try {
            // Creates a FileReader
            FileReader file = new FileReader("output.txt");
            // Creates a BufferedReader
            BufferedReader input = new BufferedReader(file);
            // Reads characters
            //System.out.println("Data in the file: ");
            System.out.println(input.readLine());
            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }    
    }
}