package cmtemplate;
import java.io.*;
public class CMSModules {
	private FileWriter writeFile;
    private BufferedWriter outFile;
	private FileReader readFile;
	private BufferedReader inFile;
	public void addData(String idno, String lastname, String firstname, String contact, String location) {
        try {
            writeFile = new FileWriter("datafile.txt", true);
            outFile = new BufferedWriter(writeFile);
            outFile.write(idno + " ");
            outFile.write(lastname + " ");
            outFile.write(firstname + " ");
            outFile.write(contact + " ");
            outFile.write(location);
            outFile.newLine();
            outFile.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
	public String DisplayOne(String tempId) {
        String tempOut;
        String tempArr[];
        try {
            readFile = new FileReader("datafile.txt");
            inFile = new BufferedReader(readFile);
            tempOut = inFile.readLine();
            while(tempOut != null) {
                tempArr = tempOut.split("\\s+");
                if(tempArr[0].equals(tempId))
                	return tempOut;
                tempOut = inFile.readLine();
            }
            inFile.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
        return null;
    }
	public int countData() {
		int ctr = 0;
		String tempOut;
		try {
			FileReader readFile = new FileReader("datafile.txt");
			BufferedReader inFile = new BufferedReader(readFile);
			tempOut = inFile.readLine();
			while(tempOut != null) {
                ctr += 1;
                tempOut = inFile.readLine();
            }
            inFile.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		return ctr;
	}
	public String[][] DisplayAll() {
		int i = 0;
		String tempOut;
		String tempArr[][] = new String[countData()][];
		try {
            FileReader readFile = new FileReader("datafile.txt");
            BufferedReader inFile = new BufferedReader(readFile);
            tempOut = inFile.readLine();
            while(tempOut != null) {
                tempArr[i] = tempOut.split("\\s+");
                tempOut = inFile.readLine();
                i += 1;
            }
            inFile.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
		return tempArr;
    }
}
