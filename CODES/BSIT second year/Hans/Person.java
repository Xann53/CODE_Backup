import java.util.ArrayList;

/**
 * Serves as the Node in the Phonebook linked list
 */
public class Person
{
    public String name;
    public String[] numbers  = {"", "", ""};
    public int numbersCount;
    public Person next;

    /**
     * Empty constructor for file writing purpose
     */
    public Person()
    {
        
    }

    /**
     * Main person constructor
     * @param name name of the person
     * @param numbers number/s entered by the user
     */
    public Person(String name, ArrayList<String> numbers)
    {
        this.name = name;
        this.next = null;

        for (int i = 0; i < numbers.size(); i++) 
        {
            this.numbers[i] = numbers.get(i);
        }
        this.numbersCount = numbers.size();
    }
}