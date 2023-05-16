import java.util.Scanner;  
import java.util.Stack;  
public class PostfixToInfixConversion {     
    private boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
            return true;
        return false;
    }  
    public String convertPostfixToInfix(String postfixstring) {  
        Stack<String> s = new Stack<>();  
        for (int i = 0; i < postfixstring.length(); i++) {
            char ch = postfixstring.charAt(i);
            if (isOperator(ch)) {
                String b = s.pop();
                String a = s.pop();
                s.push("(" + a + ch + b + ")");
            } else
                s.push("" + ch);  
        }
        return s.pop();  
    }  
    public static void main(String args[]) {
        PostfixToInfixConversion obj = new PostfixToInfixConversion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postfix expression you want to convert: ");
        String postfixstring = sc.next();
        System.out.println("Infix expression for the given postfix expression is: " + obj.convertPostfixToInfix(postfixstring));  
    }
}  