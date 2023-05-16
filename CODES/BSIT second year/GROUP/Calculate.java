public class Calculate{
    private int num1, num2, num3, num4;
    //Default constructor
    public Calculate(){
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
        this.num4 = 0;
    }
    //Non default constructor
    public Calculate(int n1, int n2, int n3, int n4){
        this.num1 = n1;
        this.num2 = n2;
        this.num3 = n3;
        this.num4 = n4;
    }
    //Setters
    public void setNum1(int n1){
        this.num1 = n1;
    }
    public void setNum2(int n2){
        this.num2 = n2;
    }
    public void setNum3(int n3){
        this.num3 = n3;
    }
    public void setNum4(int n4){
        this.num4 = n4;
    }
    //Getters
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public int getNum3(){
        return this.num3;
    }
    public int getNum4(){
        return this.num4;
    }
    //Largest and Smallest Num
    public int getLargest(){
        int largest = num1;
        if(num2 > largest)
            largest = num2;
        if(num3 > largest)
            largest = num3;
        if(num4 > largest)
            largest = num4;
        System.out.print("The Largest number is: ");
        return largest;
    }
    public int getSmallest(){
        int smallest = num1;
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;
        if (num4 < smallest)
            smallest = num4;
        System.out.print("The Smallest number is: ");
        return smallest;
    }
    //Square
    public int getSquare1() {
        System.out.print("The Square of the 1st number is: ");
        return num1 * num1;
    }
    public int getSquare2() {
        System.out.print("The Square of the 2nd number is: ");
        return num2 * num2;
    }
    public int getSquare3() {
        System.out.print("The Square of the 3rd number is: ");
        return num3 * num3;
    }
    public int getSquare4() {
        System.out.print("The Square of the 4th number is: ");
        return num4 * num4;
    }
    //Factorial
    public long getFactorial1() {
        long temp = 1;
        if(num1 > 0) {
            for(int i = num1; i > 0; i--) {
                temp *= i;
            }
        }
        System.out.print("The Factorial of the 1st number is: ");
        return temp;
    }
    public long getFactorial2() {
        long temp = 1;
        if(num2 > 0) {
            for(int i = num2; i > 0; i--) {
                temp *= i;
            }
        }
        System.out.print("The Factorial of the 2nd number is: ");
        return temp;
    }
    public long getFactorial3() {
        long temp = 1;
        if(num3 > 0) {
            for(int i = num3; i > 0; i--) {
                temp *= i;
            }
        }
        System.out.print("The Factorial of the 3rd number is: ");
        return temp;
    }
    public long getFactorial4() {
        long temp = 1;
        if(num4 > 0) {
            for(int i = num4; i > 0; i--) {
                temp *= i;
            }
        }
        System.out.print("The Factorial of the 4th number is: ");
        return temp;
    }
    //Summation
    public int getSummation1() {
        System.out.print("The Sumation of the 1st number is: ");
        return (num1 * (num1 + 1)) / 2;
    }
    public int getSummation2() {
        System.out.print("The Sumation of the 2nd number is: ");
        return (num2 * (num2 + 1)) / 2;
    }
    public int getSummation3() {
        System.out.print("The Sumation of the 3rd number is: ");
        return (num3 * (num3 + 1)) / 2;
    }
    public int getSummation4() {
        System.out.print("The Sumation of the 4th number is: ");
        return (num4 * (num4 + 1)) / 2;
    }
    //Prime and Perfect
    public void PerNum1(){
        int n1 = num1, flag = 0, i=1;
        long sum = 0;
        while(i <= n1/2) {  
            if(n1 % i == 0) {
                sum += i;  
            }
            i++;  
        } 
        if(sum==n1)
            System.out.println(n1+" is a perfect number");
        else
            System.out.println(n1+" is not a perfect number");
        if(n1==0||n1==1){  
            System.out.println(n1+" is not prime number");      
        }else{  
            for(i = 2; i <= (n1/2); i++){
                if(n1%i==0){      
                    System.out.println(n1+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }
            if(flag==0)  { System.out.println(n1+" is prime number"); }  
        }
    }
    public void PerNum2(){
        int n2 = num2, flag = 0, i=1;
        long sum = 0;
        while(i <= n2/2) {  
            if(n2 % i == 0) {
                sum += i;  
            }
            i++;  
        } 
        if(sum==n2)
            System.out.println(n2+" is a perfect number");
        else
            System.out.println(n2+" is not a perfect number");
        if(n2==0||n2==1){  
            System.out.println(n2+" is not prime number");      
        }else{  
            for(i = 2; i <= (n2/2); i++){
                if(n2%i==0){      
                    System.out.println(n2+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }
            if(flag==0)  { System.out.println(n2+" is prime number"); }  
        }
    }
    public void PerNum3(){
        int n3 = num3, flag = 0, i=1;
        long sum = 0;
        while(i <= n3/2) {  
            if(n3 % i == 0) {
                sum += i;  
            }
            i++;  
        } 
        if(sum==n3)
            System.out.println(n3+" is a perfect number");
        else
            System.out.println(n3+" is not a perfect number");
        if(n3==0||n3==1){  
            System.out.println(n3+" is not prime number");      
        }else{  
            for(i = 2; i <= (n3/2); i++){
                if(n3%i==0){      
                    System.out.println(n3+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }
            if(flag==0)  { System.out.println(n3+" is prime number"); }  
        }
    }
    public void PerNum4(){
        int n4 = num4, flag = 0, i=1;
        long sum = 0;
        while(i <= n4/2) {  
            if(n4 % i == 0) {
                sum += i;  
            }
            i++;  
        } 
        if(sum==n4)
            System.out.println(n4+" is a perfect number");
        else
            System.out.println(n4+" is not a perfect number");
        if(n4==0||n4==1){  
            System.out.println(n4+" is not prime number");      
        }else{  
            for(i = 2; i <= (n4/2); i++){
                if(n4%i==0){      
                    System.out.println(n4+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }
            if(flag==0)  { System.out.println(n4+" is prime number"); }  
        }
    }
}