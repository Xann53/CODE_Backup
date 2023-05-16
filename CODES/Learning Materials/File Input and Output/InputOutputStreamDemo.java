import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class InputOutputStreamDemo {
    public static void main(String args[]) {
        byte[] array = new byte[100];
        String data = "This is a line of text";

        try {
            OutputStream out = new FileOutputStream("outputText.txt"); //open
            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();
            // Writes data to the output stream
            out.write(dataBytes);
            // Closes the output stream
            out.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

        try {
            InputStream input = new FileInputStream("outputText.txt"); //open
            // Read byte from the input stream
            input.read(array);
            // Convert byte array into string
            String strData = new String(array);
            System.out.println(strData);
            // Close the input stream
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}