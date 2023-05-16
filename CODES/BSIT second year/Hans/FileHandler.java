import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Responsible for writing and reading the phonebook as object
 */
public class FileHandler
{
    /**
     * writes the phonebook object into the data.xml file
     * @param   phonebook   phonebook to write
     */
    public void writePhonebook(Phonebook phonebook) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(new File("phonebook/data.xml"));
            XMLEncoder encoder = new XMLEncoder(fos);

            encoder.writeObject(phonebook);
            encoder.close();
            fos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * reads the data.xml file as an object
     * @return  phonebook object saved
     */
    public Phonebook readPhonebook() 
    {
        Phonebook savedPhonebook = new Phonebook();
        new File("phonebook").mkdirs();
        // if data is not yet created
        if(!(new File("phonebook/data.xml").exists())) return savedPhonebook;

        try
        {
            FileInputStream fis = new FileInputStream(new File("phonebook/data.xml"));
            XMLDecoder decoder = new XMLDecoder(fis);

            savedPhonebook = (Phonebook) decoder.readObject();

            decoder.close();
            fis.close();
            return savedPhonebook;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return savedPhonebook;
    }
}