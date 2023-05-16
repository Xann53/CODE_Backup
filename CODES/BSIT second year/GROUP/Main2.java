import java.util.*;
public class Main2 {
    final static Scanner input = new Scanner(System.in);
    final static Operations list = new Operations();
    public static void main(String[] args) {
        String command, tempCommand, val1, val2, val3, val4;
        int charctr = 0, i = 0;
        boolean continueLoop = true, valid = false;
        while(continueLoop) {
            tempCommand = "";
            val1 = "";
            val2 = "";
            val3 = "";
            val4 = "";
            valid = false;
            try {
                while(tempCommand.isEmpty()) {
                    System.out.print("Command> ");
                    tempCommand = input.nextLine();
                }
                command = tempCommand.trim(); //remove space from both ends of command
                command = command.replaceAll("\\s+"," "); //make sure that there are no multiple spaces
                command = command.substring(0, 1).toUpperCase() + command.substring(1); //changing first character to upper case
                charctr = 0; 
                for(i = 0; i < command.length(); i++)
                    charctr++;
                if((command.charAt(0) == 'I' || command.charAt(0) == 'D' ||  command.charAt(0) == 'V' || command.charAt(0) == 'M') &&  charctr > 1) {
                    checkInput(command, val1, val2, val3, val4, i, valid);
                }else if(command.charAt(0) == 'V' && charctr == 1) //if command is v only
                    list.viewAll();
                else if(command.charAt(0) == 'X' && charctr == 1) { //if command is x only
                    System.out.print("\f");
                    continueLoop = false;
                }
                else
                    invalid();
            }catch(InputMismatchException e) {
            }
        }
    }
    public static void invalid() {
        System.out.println("Remarks: Invalid command.");
    }
    public static void checkInput(String command, String val1, String val2, String val3, String val4, int i, boolean valid) {
        int count = 0;
        if(command.charAt(1) == ' ') {
            for(int j = 0; j < command.length(); j++) {
                if(command.charAt(j) == ' ')
                    count++;
            }
            if(count>4) { //if user inputs more than 4 values
               invalid();
               return;
            }
            for(i = 2; i < command.length() && command.charAt(i) != ' '; i++) 
                val1 = val1 + command.charAt(i); //for name
            for(i++; i < command.length() && (command.charAt(0) == 'I' || command.charAt(0) == 'D') && Character.isDigit(command.charAt(i)) && command.charAt(i) != ' '; i++)
                val2 = val2 + command.charAt(i); //for input/delete number
            for(i++; i < command.length() && command.charAt(0) == 'I' && command.charAt(i) != ' '; i++)
                val3 = val3 + command.charAt(i); //for input that has two numbers; bc num2 is optional, validation will be in input method
            for(i++; i < command.length() && command.charAt(0) == 'I' && command.charAt(i) != ' '; i++)
                val4 = val4 + command.charAt(i); //for input that has three numbers; bc num3 is optional, validation will be in input method
            if((list.checkNumber(val2) && val2!= "") || (list.checkNumber(val3) && val3!= "") || (list.checkNumber(val4) && val4!= "")) {
                invalid();
                return;
            }
            for(i = i-2; i < command.length() && command.charAt(0) != 'I' && command.charAt(0) != 'D' &&  command.charAt(i) != ' '; i++)
                val2 = val2 + command.charAt(i); //for second values that are not input and delete
            for(i++; i < command.length() && command.charAt(0) != 'I' && command.charAt(0) != 'D' && command.charAt(i) != ' '; i++)
                val3 = val3 + command.charAt(i); //for third values that are not input and delete
            if((val1 != "" && list.ifLetters(val1) && val2 != "" || val3 != "" || val4 != "") && command.charAt(0) == 'I')
                valid = true;
            else if((val1 != "" &&  val2 != "" || val3 != "")  && command.charAt(0) == 'M' && count < 4)
                valid = true;
            else if((val1 != "" || val2 != "")  && command.charAt(0) == 'D' && count < 3)
                valid = true;
            else if(val1 != "" && val2 == "" &&  command.charAt(0) == 'V' && count < 2)
                valid = true;
        }
        if(valid) {
            if(command.charAt(0) == 'I')
                list.input(val1, val2, val3, val4);
            else if(command.charAt(0) == 'D')
                list.delete(val1, val2);
            else if(command.charAt(0) == 'V')
                list.viewContacts(val1);
            else if(command.charAt(0) == 'M')
                list.modify(val1, val2, val3);
        } else
            invalid();
    }
}
