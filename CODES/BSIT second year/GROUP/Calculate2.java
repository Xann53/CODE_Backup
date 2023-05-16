public class Calculate2
{
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    
    public Calculate2()
    {
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
    }
    public Calculate2(int num1, int num2, int num3, int num4)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    public int[] square()
    {
        int tempNum1 = num1 * num1;
        int tempNum2 = num2 * num2;
        int tempNum3 = num3 * num3;
        int tempNum4 = num4 * num4;
        int[] finalNum = {tempNum1, tempNum2, tempNum3, tempNum4};
        return finalNum;
    }
    public int squareNum1()
    {
        int tempNum1 = num1 * num1;
        return tempNum1;
    }
    public int squareNum2()
    {
        int tempNum2 = num2 * num2;
        return tempNum2;
    }
    public int squareNum3()
    {
        int tempNum3 = num3 * num3;
        return tempNum3;
    }
    public int squareNum4()
    {
        int tempNum4 = num4 * num4;
        return tempNum4;
    }
    public int factorialNum1()
    {
        int tempNum1 = num1;
        if(num1 > 0)
        {
            for(int i = num1; i > 0; i--)
            {
                tempNum1 *= 1;
            }
        }
        else if(num1 == 0)
            tempNum1 = 1;
        return tempNum1;
    }
    public String getFactorial1()
    {
        long tempNum = 1;
        String temp = "";
        if(num1 > 0) {
            for(int i = num1; i > 0; i--) {
                tempNum *= i;
            }
            temp += tempNum;
        } else if(num1 == 0)
            temp = "1";
        System.out.print("The Factorial of the 1st number is: ");
        return temp;
    }
    public String getFactorial2()
    {
        long tempNum = 1;
        String temp = "";
        if(num2 > 0) {
            for(int i = num2; i > 0; i--) {
                tempNum *= i;
            }
            temp += tempNum;
        } else if(num2 == 0)
            temp = "1";
        System.out.print("The Factorial of the 2nd number is: ");
        return temp;
    }
    public String getFactorial3()
    {
        long tempNum = 1;
        String temp = "";
        if(num3 > 0) {
            for(int i = num3; i > 0; i--) {
                tempNum *= i;
            }
            temp += tempNum;
        } else if(num3 == 0)
            temp = "1";
        System.out.print("The Factorial of the 3rd number is: ");
        return temp;
    }
    public String getFactorial4()
    {
        long tempNum = 1;
        String temp = "";
        if(num4 > 0) {
            for(int i = num4; i > 0; i--) {
                tempNum *= i;
            }
            temp += tempNum;
        } else if(num4 == 0)
            temp = "1";
        System.out.print("The Factorial of the 4th number is: ");
        return temp;
    }
}