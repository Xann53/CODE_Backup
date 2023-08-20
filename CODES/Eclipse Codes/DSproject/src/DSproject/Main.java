package DSproject;
import java.util.*;

public class Main

{

    public static int evaluatePostfix(String exp)

    {

        //create a stack

        Stack stack = new Stack(exp.length());

         

        // Scan all characters one by one

        for(int i = 0; i < exp.length(); i++)

        {

            char c = exp.charAt(i);

             

            if(c == ' ')

            continue;

             

            // If the scanned character is an operand

            // (number here),extract the number

            // Push it to the stack.

            else if(Character.isDigit(c))

            {

                int n = 0;

                String temp = "";

                //extract the characters and store it in num                

                while(Character.isDigit(c))

                {

                    temp = temp + c;

                    i++;

                    c = exp.charAt(i);

                }

                i--;

                n = Integer.parseInt(temp);

 

                //push the number in stack

                stack.push(n);

            }

             

            // If the scanned character is an operator, pop two

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

    //Validations for the expression

    public static boolean isValid(String exp) {

        int operandCount = 0, operatorCount = 0;

        exp = exp.trim().replaceAll("\\s+", " "); //replaces multiple spaces to single space and removes trailing and starting spaces

       

        for(int i = 0; i < exp.length(); i++) {

            char c = exp.charAt(i);

            String temp;

           

            if (c == ' ')

                continue;

            else if(i!=0 && (c == '+' || c == '-' || c == '*' || c == '/'))

                operatorCount++; //counting the number of operators

            else if(Character.isDigit(c)) {

                temp = "";

                //extracting the operand

                while(c != ' ')

                {

                    temp = temp + c;

                    i++;

                    c = exp.charAt(i);

                }

                i--;

                for(int k = 0; k < temp.length(); k++) {

                   

                    if(!Character.isDigit(temp.charAt(k))) //check if the operand includes anything other than digits

                        return false; //will return false if the character is not a digit

                }

                operandCount++; //counting the number of operands

            }  

            else

                return false; //return false if the character is not a space, digit, or operator

        }

        //there should be more than 1 operands and the operators should always be equal to operands-1

        if(operandCount>1 && operatorCount == operandCount-1)

            return true;

        else

            return false;

    }

}



