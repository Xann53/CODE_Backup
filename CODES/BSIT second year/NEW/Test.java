import java.util.*;
import java.util.Stack;
public class Test
{
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String value)
    {
        boolean access = false;
        value = value.trim();
        value = value.replaceAll("\\s+"," ");
        
        String[] array = value.split(" ");
        Stack<Integer> stack=new Stack<>();
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length(); j++) {
                if(Character.isDigit(array[i].charAt(j))) {
                    access = true;
                } else {
                    access = false;
                }
            }
            if(access) {
                int y = Integer.parseInt(array[i]);
                stack.push(y);
            } else {
                try {
                    String c = array[i];
                    int val1 = stack.pop();
                    int val2 = stack.pop(); 
                    switch(c) {
                        case "+":
                        stack.push(val2+val1);
                        break;
                     
                        case "-":
                        stack.push(val2- val1);
                        break;
                     
                        case "/":
                        stack.push(val2/val1);
                        break;
                     
                        case "*":
                        stack.push(val2*val1);
                        break;
                    }
                } catch(EmptyStackException e) {
                }
            }
        }
        return stack.pop();   
    }
     
    // Driver program to test above functions
    public static void main(String[] args)
    {
        String exp="23 -35 1 * +";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}