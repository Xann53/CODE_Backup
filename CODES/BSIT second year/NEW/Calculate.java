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
    //formula for getting the Largest value
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
    //formula for getting the smallest value
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
    //Formula for Square of each number
    public void getSquare() {
        System.out.println("The Square of the 1st number is: '"+(num1 * num1)+"'");
        System.out.println("The Square of the 2nd number is: '"+(num2 * num2)+"'");
        System.out.println("The Square of the 3rd number is: '"+(num3 * num3)+"'");
        System.out.println("The Square of the 4th number is: '"+(num4 * num4)+"'\n");
    }
    //Formula for Factorial of each number
    public void getFactorial() {
        long temp1 = 1;
        long temp2 = 1;
        long temp3 = 1;
        long temp4 = 1;
        int i = 0;
        
        for(i = 1; i <= num1; i++) {
            temp1 = temp1*i;
        }
        for(i = 1; i <= num2; i++) {
            temp2 = temp2*i;
        }
        for(i = 1; i <= num3; i++) {
            temp3 = temp3*i;
        }
        for(i = 1; i <= num4; i++) {
            temp4 = temp4*i;
        }
        System.out.println("The Factorial of the 1st number is: '"+temp1+"'");
        System.out.println("The Factorial of the 2nd number is: '"+temp2+"'");
        System.out.println("The Factorial of the 3rd number is: '"+temp3+"'");
        System.out.println("The Factorial of the 4th number is: '"+temp4+"'\n");
    }
    //Summation formula
    public void getSummation() {
        System.out.println("The Sumation of all numbers are: " + (num1+num2+num3+num4)+"'");
    }
    //Perfect or not
    public void PerNum(){
        int n1 = 0;  
        int n2 = 0;  
        int n3 = 0;  
        int n4 = 0;  
        for (int i = 1; i <= num1/2; i++){
            if(num1 % i == 0)
                n1 += i; 
        }
        for (int i = 1; i <= num2/2; i++){
            if(num2 % i == 0)
                n2 += i;  
        }
        for (int i = 1; i <= num3/2; i++){
            if(num3 % i == 0)
                n3 += i;  
        }
        for (int i = 1; i <= num4/2; i++){
            if(num4 % i == 0)
                n4 += i;  
        }
        if(n1 == num1)
            System.out.println("'"+num1+"' is a perfect number");
        else
            System.out.println("'"+num1+"' is not a perfect number");
        if(n2 == num2)
            System.out.println("'"+num2+"' is a perfect number");
        else
            System.out.println("'"+num2+"' is not a perfect number");
        if(n3 == num3)
            System.out.println("'"+num3+"' is a perfect number");
        else
            System.out.println("'"+num3+"' is not a perfect number");    
        if(n4 == num4)
            System.out.println("'"+num4+"' is a perfect number\n");
        else
            System.out.println("'"+num4+"' is not a perfect number\n");      
    }
    //Prime or not
    public void PrimeNum(){
        boolean n1 = false;
        boolean n2 = false;
        boolean n3 = false;
        boolean n4 = false;
        for (int i = 2; i <= num1/2; i++) {
            if (num1 % i == 0) {
                n1 = true;
            }
        }
        for (int i = 2; i <= num2/2; i++) {
            if (num2 % i == 0) {
                n2 = true;
            }
        }
        for (int i = 2; i <= num3/2; i++) {
            if (num3 % i == 0) {
                n3 = true;
            }
        }
        for (int i = 2; i <= num4/2; i++) {
             if (num4 % i == 0) {
                 n4 = true;
             }
        }
        if(!n1){
            System.out.println("'"+num1+"' is prime number");
        }
        else{
            System.out.println("'"+num1+"' is not prime number");
        }
        if(!n2){
            System.out.println("'"+num2+"' is prime number");
        }
        else{
            System.out.println("'"+num2+"' is not prime number");
        }
        if(!n3){
            System.out.println("'"+num3+"' is prime number");
        }
        else{
            System.out.println("'"+num3+"' is not prime number");
        }
        if(!n4){
            System.out.println("'"+num4+"' is prime number\n");
        }
        else{
            System.out.println("'"+num4+"' is not prime number\n");
        }
    }
}