import java.util.Stack;
 
public class CopyOfTest
{
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String value)
    {
        String[] array = new String[100];
        int ctr = 0;
        value = value.trim();
        value = value.replaceAll("\\s+"," ");
        for(int i = 0; i < value.length(); i++) {
            
        }
        //create a stack
        Stack<Integer> stack=new Stack<>();
         
        // Scan all characters one by one
        for(int i = 0; i < value.length(); i++)
        {
            char c = value.charAt(i);
             
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');
             
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                 
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                     
                    case '-':
                    stack.push(val2- val1);
                    break;
                     
                    case '/':
                    stack.push(val2/val1);
                    break;
                     
                    case '*':
                    stack.push(val2*val1);
                    break;
              }
            }
        }
        return stack.pop();   
    }
     
    // Driver program to test above functions
    public static void main(String[] args)
    {
        String exp="231*+9-";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}
