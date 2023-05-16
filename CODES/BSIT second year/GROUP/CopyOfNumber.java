public class CopyOfNumber
{
    private int firstNum;
    private double secondNum;
    
    public CopyOfNumber()
    {
        firstNum = 0;
        secondNum = 0;
    }
    public CopyOfNumber(int firstNum, double secondNum)
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
        double tempSecNum = secondNum;
        int tempNum = (int) tempSecNum, remainder, remainder2;
        if(tempSecNum == tempNum)
        {
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
        }
        else if((tempSecNum > tempNum) && (tempSecNum < (tempNum + 1)))
        {
            int counter = 0;
            boolean stop = false;
            tempSecNum = tempSecNum - tempNum;
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
            hexa += ".";
            while(stop == false)
            {
                if((tempSecNum != 0) && (counter < 10))
                {
                    tempSecNum = tempSecNum * 16;
                    remainder2 = (int)tempSecNum;
                    tempSecNum = tempSecNum - remainder2;
                    if(remainder2 == 10)
                        hexa += "A";
                    else if(remainder2 == 11)
                        hexa += "B";
                    else if(remainder2 == 12)
                        hexa += "C";
                    else if(remainder2 == 13)
                        hexa += "D";
                    else if(remainder2 == 14)
                        hexa += "E";
                    else if(remainder2 == 15)
                        hexa += "F";
                    else
                        hexa += remainder2;
                }
                else
                {
                    stop = true;
                }
                counter++;
            }
        }
        return hexa;
    }
}
