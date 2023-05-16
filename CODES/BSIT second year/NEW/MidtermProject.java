import java.util.*;
public class MidtermProject {
    final static Scanner input = new Scanner(System.in);
    final static Operations list = new Operations();
    public static void main(String[] args) {
        String command, tempCommand, val1, val2, val3;
        int charctr = 0, i = 0;
        boolean continueLoop = true, valid = false;
        while(continueLoop) {
            tempCommand = "";
            val1 = "";
            val2 = "";
            val3 = "";
            valid = false;
            try {
                while(tempCommand.isEmpty()) {
                    System.out.print("Command> ");
                    tempCommand = input.nextLine().toUpperCase();
                }
                command = tempCommand.trim();
                command = command.replaceAll("\\s+"," ");
                charctr = 0;
                for(i = 0; i < command.length(); i++)
                    charctr++;
                if((command.charAt(0) == 'I' || command.charAt(0) == 'D' ||  command.charAt(0) == 'V' || command.charAt(0) == 'M') &&  charctr > 2) {
                    checkInput(command, val1, val2, val3, i, valid);
                }else if(command.charAt(0) == 'V' && charctr == 1)
                    list.viewAll();
                else if(command.charAt(0) == 'X' && charctr == 1) {
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
    public static void checkInput(String command, String val1, String val2, String val3, int i, boolean valid) {
        if(command.charAt(1) == ' ') {
            for(i = 2; i < command.length() && command.charAt(i) != ' '; i++)
                val1 = val1 + command.charAt(i);
            for(i++; i < command.length() && command.charAt(0) == 'I' && (command.charAt(i) >= '0' && command.charAt(i) <= '9') && command.charAt(i) != ' '; i++)
                val2 = val2 + command.charAt(i);
            for(; i < command.length() && command.charAt(0) != 'I' &&  command.charAt(i) != ' '; i++)
                val2 = val2 + command.charAt(i);
            for(i++; i < command.length() && command.charAt(0) != 'I' &&  command.charAt(i) != ' '; i++)
                val3 = val3 + command.charAt(i);
            if((val1 != "" && val2 != "" || val3 != "") && (command.charAt(0) == 'I' || command.charAt(0) == 'M'))
                valid = true;
            else if(val1 != "" && val2 == "" &&  (command.charAt(0) != 'I' && command.charAt(0) != 'M'))
                valid = true;
        }
        if(valid) {
            if(command.charAt(0) == 'I')
                list.input(val1, val2);
            else if(command.charAt(0) == 'D')
                list.delete(val1);
            else if(command.charAt(0) == 'V')
                list.viewContacts(val1);
            else if(command.charAt(0) == 'M')
                list.modify(val1, val2, val3);
        } else
            invalid();
    }
}