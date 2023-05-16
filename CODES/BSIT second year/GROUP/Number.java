public class Number
{
    private int firstNum;
    private double secondNum;
    
    public Number()
    {
        firstNum = 0;
        secondNum = 0;
    }
    public Number(int firstNum, double secondNum)
    {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    public void setFirstNum(int firstNum)
    {
        this.firstNum = firstNum;
    }
    public void setSecondNum(double secondNum)
    {
        this.secondNum = secondNum;
    }
    public int getFirstNum()
    {
        return firstNum;
    }
    public double getSecondNum()
    {
        return secondNum;
    }
    public double sum()
    {
        double sum = firstNum + secondNum;
        return sum;
    }
    public double average()
    {
        double sum = firstNum + secondNum;
        double average = sum / 2;
        return average;
    }
    public String convertToBinary()
    {
        String binary = "", tempBinary = "";
        int tempNum = firstNum;
        int remainder;
        while(tempNum > 0)
        {
            remainder = tempNum % 2;
            tempNum = tempNum / 2;
            tempBinary += remainder;
        }
        for(int i = tempBinary.length(); i > 0; i--)
        {
            binary += tempBinary.charAt(i-1);
        }
        return binary;
    }
    public String convertToHexa()
    {
        String hexa = "", tempHexa = "";
        int tempNum = (int) secondNum, remainder;
        while(tempNum > 0)
        {
            remainder = tempNum % 16;
            tempNum = tempNum / 16;
            if(remainder == 10)
                tempHexa += "A";
            else if(remainder == 11)
                tempHexa += "B";
            else if(remainder == 12)
                tempHexa += "C";
            else if(remainder == 13)
                tempHexa += "D";
            else if(remainder == 14)
                tempHexa += "E";
            else if(remainder == 15)
                tempHexa += "F";
            else
                tempHexa += remainder;
        }
        for(int i = tempHexa.length(); i > 0; i--)
        {
            hexa += tempHexa.charAt(i-1);
        }
        return hexa;
    }
}