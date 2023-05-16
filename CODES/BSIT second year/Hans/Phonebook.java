import java.util.Scanner;
import java.util.ArrayList;

/**
 * The main system class 
 * Manages the linked list
 */
public class Phonebook
{
    public Person head;

    /**
     * Empty contructor for file writing purposes
     */
    public Phonebook()
    {

    }

    /**
     * inserts new Person or insert new contact to a Person
     * @param   name    the name of person to insert or to add new numbers
     * @param   numbers number/s to add to the person 
     */
    public void insert(String name, ArrayList<String> numbers)
    {    
        // inserts new head if none
        if (this.head == null)
        {
            Person newPerson = new Person(name, numbers);
            this.head = newPerson;
            System.out.println("Remarks: New contact has been added.");
            return;
        }

        // search for the same Person's name
        Person temp = this.head;
        while (!temp.name.equals(name) && temp.next != null)
        {
            temp = temp.next;
        } 

        // if found
        if (temp.name.equals(name))
        {
            // check if max numbers not reached
            if (temp.numbersCount + numbers.size() > 3)
            {
                System.out.println("Remarks: Invalid command!");
                return;
            }

            // check if new number to add does not exist
            for (int i = 0; i < numbers.size(); i++) 
            {
                for (int j = 0; j < temp.numbersCount; j++) 
                {
                    if (numbers.get(i).equals(temp.numbers[j]))
                    {
                        System.out.println("Remarks: Number already existed..");
                        return;
                    }
                }
            }

            // insert numbers
            for (int i = 0; i < numbers.size(); i++) 
            {
                temp.numbers[temp.numbersCount] = numbers.get(i);
                temp.numbersCount++;
            }
            System.out.println("Remarks: New number has been added.");
            return;
        }

        // else if not found
        Person newPerson = new Person(name, numbers);
        System.out.println("Remarks: New contact has been added.");
        temp.next = newPerson;
    }

    /**
     * views a Person or view all Persons
     * @param   names   specified name to view, if none, views all
     */
    public void view(ArrayList<String> names)
    {
        // if phonebook is empty
        if (this.head == null)
        {
            System.out.println("Remarks: Phonebook is empty..");
            return;
        }
        
        Person temp = this.head;

        // if no name is specified
        if (names.size() == 0)
        {
            // print all
            System.out.println("Phonebook Directory: ");
            while (temp != null)
            {
                // display the Person data
                // if no numbers
                if (temp.numbersCount == 0) 
                {
                    System.out.println(temp.name + " - No numbers.");
                    return;
                }

                System.out.print(temp.name + " - ");
                printNumbers(temp);
                temp = temp.next;
            }
            return;
        }

        // if name is specified
        // iterate through all persons until name is equal or next is null 
        while (!temp.name.equals(names.get(0)) && temp.next != null)
        {
            temp = temp.next;
        }

        // check if temp is still not the person to view and temp.next is null
        if (!temp.name.equals(names.get(0)) && temp.next == null)
        {
            System.out.println("Remarks: Name does not exist.. ");
            return;
        }

        // display the Person's data
        System.out.print("Contact Numbers(s): ");
        printNumbers(temp);
    }

    /**
     * prints the numbers of a Person with format
     * @param temp the Person to print the numbers
     */
    private void printNumbers(Person temp)
    {
        for (int i = 0; i < temp.numbersCount; i++) 
        {
            System.out.print(temp.numbers[i]);

            if (i == temp.numbersCount - 1)
            {
                System.out.println();
                break;
            }
            System.out.print(", ");    
        } 
    }

    /**
     * deletes a Person or a Person's contact/s
     * @param names name of the Person to remove
     * @param numbers number to remove from the specified person, if none, removes the Person
     */
    public void delete(ArrayList<String> names, ArrayList<String> numbers)
    {
        // if phonebook is empty
        if (this.head == null)
        {
            System.out.println("Remarks: Phonebook is empty..");
            return;
        }

        Person temp = this.head;

        // if head is the person to delete
        if (temp.name.equals(names.get(0)))
        {
            // if numbers are not specified
            if (numbers.size() == 0)
            {
                if (temp.next != null)
                {
                    this.head = temp.next;
                    System.out.println("Remarks: " + names.get(0) + " has been removed");
                    return;
                }
                this.head = null;
                System.out.println("Remarks: " + names.get(0) + " has been removed");
                return;
            }

            // else if numbers are specified
            int originalNumbersCount = temp.numbersCount;

            // else if numbers are not specified
            removeNumber(temp, numbers);
            return;
        }

        // if head is not the person to delete
        // and next is null
        if (temp.next == null)
        {
            System.out.println("Remarks: Name does not exist.. ");
            return;
        }

        // iterate through all persons until name is equal or next is null 
        while (!temp.next.name.equals(names.get(0)) && temp.next != null)
        {
            temp = temp.next;
            if (temp.next == null) break;
        }

        // check if temp is still not the person to delete and temp.next is null
        if (!temp.name.equals(names.get(0)) && temp.next == null)
        {
            System.out.println("Remarks: Name does not exist.. ");
            return;
        }

        // if numbers are not specified 
        if (numbers.size() == 0)
        {
            Person newNext = temp.next.next;
            temp.next = newNext;
            System.out.println("Remarks: " + names.get(0) + " has been removed");
            return;
        }

        // else if numbers are not specified
        removeNumber(temp, numbers);
    }

    /**
     * removes the number/s of a Person or removes the Person 
     * @param temp  the person object to remove a number
     * @param numbers number/s to remove from specified person
     */
    private void removeNumber(Person temp, ArrayList<String> numbers)
    {
        // if numbers are specified
        int originalNumbersCount = temp.numbersCount;

        // check if numbers are existing
        for (int i = 0; i < numbers.size(); i++) 
        {
            for (int j = 0; j < temp.numbersCount; j++) 
            {
                // if existing 
                if (numbers.get(i).equals(temp.numbers[j]))
                {
                    temp.numbers[j] = "";
                    temp.numbersCount--;
                    System.out.println(numbers.get(i) + " removed.");
                    break;
                }        
            }    
        }

        // if there are still remaining numbers in temp
        if (temp.numbersCount != 0)
        {
            // move remaining numbers above an index
            // get all remaining numbers
            String[] remainingNumbers = {"", "", ""};
            int remainingNumbersIndex = 0;
            for (int i = 0; i < 3; i++) 
            {
                if (!temp.numbers[i].equals(""))    
                {
                    remainingNumbers[remainingNumbersIndex] = temp.numbers[i]; 
                    remainingNumbersIndex++;
                }
            }
            // store back to temp
            temp.numbers = remainingNumbers;
            return;
        }

        // if numbers are not existing
        if (temp.numbersCount == originalNumbersCount)
        {
            System.out.println("Remarks: Invalid numbers to delete, not existing.");
            return;
        }
    }

    /**
     * modifies a Person's name or Person's contact/s
     * @param names consists of names of person to modify and name to set
     * @param numbers consists of numbers to modify if only one name entered
     */
    public void modify(ArrayList<String> names, ArrayList<String> numbers)
    {
        if (this.head == null) return;

        Person temp = this.head;
        while (!temp.name.equals(names.get(0)) && temp.next != null) temp = temp.next;

        // if name not found
        if (!temp.name.equals(names.get(0)) && temp.next == null)
        {
            System.out.println("Invalid, not existing name");
            return;
        }

        // if change name option
        if (names.size() == 2)
        {
            temp.name = names.get(1);
            System.out.println("Remarks: " + names.get(0) + " has been modified.");
            return;
        }

        // change number
        if (numbers.size() == 2) 
        {
            int i = 0;
            for (; i < temp.numbersCount; i++)
            {
                if (temp.numbers[i].equals(numbers.get(0)))
                {
                    temp.numbers[i] = numbers.get(1);
                    System.out.println("Remarks: " + names.get(0) + " has been modified.");
                    return;
                }
            }    

            // check if number successfully modified
            if (i == temp.numbersCount && !temp.numbers[i].equals(numbers.get(1)))
            {
                System.out.println("Remarks: Invalid number entered.");
                return;
            }
        }
    }
}