import java.util.ArrayList;

/**
 * Handles user command inputs
 */
public class Command
{
    public String action;
    public ArrayList<String> names;
    public ArrayList<String> numbers;
    public boolean isValidCommand;

    /**
     * Constructor for identifying the action, 
     * names, and numbers specified by the user input
     * @param rawInput the string entered from the user
     */
    public Command(String rawInput)
    {
        String[] commands = rawInput.split(" ");// I Max 1234657
        this.action = commands[0];

        // initialization of names and numbers
        names = new ArrayList<String>();
        numbers = new ArrayList<String>();

        for (int i = 1; i < commands.length; i++) 
        {
            if (commandType(commands[i]).equals("name"))
            {
                names.add(commands[i]);
                continue;
            }
            numbers.add(commands[i]);
        }

        this.isValidCommand = isValid(commands);
    }

    /**
     * determines if the character is a number
     * @param c char to evaluate
     * @return true if c is 0,1,2,3,4,5,6,7,8,9. false if not
     */
    public boolean isNumber(char c)
    {
        for (int i = 0; i < 10; i++) 
        {
            if (c == (char)(i + '0')) return true;
        }

        return false;
    }

    /**
     * determines the type of a sub command from the splitted commands
     * identifies if it is a number or a name
     * @param command a subset from commands entered from user
     * @return type of sub command, 'name' if there are letters, 'number' if all digits
     */
    public String commandType(String command)
    {
        for (int i = 0; i < command.length(); i++) {
            if (!isNumber(command.charAt(i))) return "name";
        }
        return "number";
    }

    /**
     * checks if the inputted commands are valid
     * @param commands splitted commands from user input
     * @return true if the commands are valid, false if not
     */
    private boolean isValid(String[] commands)
    {
        // if action's length is not equal to 1
        if (this.action.length() != 1)
        {
            System.out.println("Remarks: Invalid, action's length is not equal to 1.");
        }

        // if only action, no names and/or numbers 
        if (!(this.action.equals("x") || this.action.equals("v")) && commands.length <= 1) 
        {
            System.out.println("Remarks: Invalid, no names and/or numbers entered.");
            return false;
        }

        // if invalid actions, not i/d/x/v/m
        if (!(this.action.equals("i") || this.action.equals("d") || this.action.equals("x") || this.action.equals("v") || this.action.equals("m")))
        {
            System.out.println("Remarks: Unrecognized command.");
            return false;
        }

        // if names or numbers are more than 2
        if (this.names.size() > 2 || this.numbers.size() > 2)
        {
            System.out.println("Remarks: Numbers or names are more than 2.");
            return false;
        }

        // actions invalid cases 
        if ((this.action.equals("i") || this.action.equals("d")) && this.names.size() >= 2) 
        {
            System.out.println("Remarks: Two or more names entered in insertion or deletion.");
            return false;
        }
        if (this.action.equals("m") && this.names.size() >= 2 && this.numbers.size() >= 2) 
        {
            System.out.println("Remarks: Two or more numbers or names entered in modify.");
            return false;
        }

        // if same number or name inputted
        if (this.names.size() == 2 && this.numbers.size() == 2)
        {
            if (this.names.get(0).equals(this.names.get(1)) || this.numbers.get(0).equals(this.numbers.get(1)))
            {
                System.out.println("Remarks: The same names or numbers entered");
                return false;
            }
        }

        // invalid if numbers' length is not 7 or 11
        for (int i = 0; i < numbers.size(); i++) 
        {
            if (!(numbers.get(i).length() == 7 || numbers.get(i).length() == 11)) 
            {
                System.out.println("Remarks: Number entered is not equal to 7 or 11.");
                return false;
            }
        }

        return true;
    }
}