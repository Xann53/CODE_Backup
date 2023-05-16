import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		FileHandler fileHandler = new FileHandler();
		Phonebook phonebook = new Phonebook();

		phonebook = fileHandler.readPhonebook();

		boolean isDone = false;

		while(!isDone)
		{
			// asking for command
			System.out.println("- - - - - - ");
			System.out.print("Command >> ");
			String rawInput = input.nextLine();

			Command command = new Command(rawInput.toLowerCase());

			// checking if valid commands
			if (!command.isValidCommand)
			{
				System.out.println("Remarks: Invalid command!");
				continue;
			}

			// performing commands
			// exit command
			if (command.action.equals("x"))
			{
				// save phonebook before exiting
				fileHandler.writePhonebook(phonebook);
				isDone = true;
			}
			
			// insert command
			else if (command.action.equals("i"))
			{
				phonebook.insert(command.names.get(0), command.numbers);
			}

			// view command
			else if (command.action.equals("v"))
			{
				phonebook.view(command.names);
			}

			// delete command
			else if (command.action.equals("d"))
			{
				phonebook.delete(command.names, command.numbers);
			}

			// modify command
			else if (command.action.equals("m"))
			{
				phonebook.modify(command.names, command.numbers);
			}
		}
	}
}