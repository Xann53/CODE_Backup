import java.util.*;
public class PostFix {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
        boolean loop = true;
        String value = "", postFix, operator;
        do {
            try {
                postFix = "";
                operator = "";
                System.out.print("INPUT>> ");
                value=input.nextLine();
                if(value.equalsIgnoreCase("x"))
                    loop = false;
                for(int i = 0; i < value.length(); i++) {
                    if(value.charAt(i) >= '0' && value.charAt(i) <= '9') {
                        postFix += value.charAt(i);
                    }
                    if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9') && (operator == "")) {
                        operator += value.charAt(i);
                    } else if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9') && (operator != "")) {
                        postFix += operator;
                        operator = "";
                        operator += value.charAt(i);
                    }
                }
                postFix += operator;
                System.out.println(postFix);
            } catch(InputMismatchException e) {
                input.nextLine();
            }
        } while(loop);
        System.out.print("\f");
    }
}
/*
                    if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9') && (operator == "")) {
                        operator += value.charAt(i);
                    } else if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9') && (operator != "")) {
                        postFix += operator;
                        operator = "";
                        operator += value.charAt(i);
                    }
*/