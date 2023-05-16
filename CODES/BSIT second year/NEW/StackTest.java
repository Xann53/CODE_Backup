import java.util.*;
public class StackTest {
    static Scanner input = new Scanner(System.in);
    public static void main (String [] args) {
        boolean continueLoop = true;
        String equation;
        while(continueLoop) {
            System.out.print("Enter an equation: ");
            equation = input.nextLine();
            equation = equation.replaceAll("\\s+"," ").trim();
            
            if(equation.equalsIgnoreCase("x"))
                continueLoop = false;
            else {
                PMDAS (equation);
            }
        }
    }
    public static void PMDAS (String equation) {
        
    }
    public static boolean isNumber (String equation, int i) {
        return (equation.charAt(i) >= '0' && equation.charAt(i) <= '9');
    }
    public static boolean isSymbol (String equation, int i) {
        return (equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/');
    }
    public static boolean isSpace (String equation, int i) {
        return (equation.charAt(i) == ' ');
    }
    public static boolean isParenthesis (String equation, int i) {
        return (equation.charAt(i) == '(' || equation.charAt(i) == ')');
    }
}