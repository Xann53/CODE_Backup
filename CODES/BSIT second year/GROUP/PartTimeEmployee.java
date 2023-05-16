public class PartTimeEmployee extends Person{
    private double payRate, hoursWorked;
    public PartTimeEmployee(){
        super();
    }
    public PartTimeEmployee(String pID,String fName, String lName,String bDate, String add, double pRate, double hWorked){
        super(pID,fName,lName,bDate,add);
        this.payRate = pRate;
        this.hoursWorked = hWorked;
    }
    public String toString(){
        String string=""; 
        return string;
    }  
    public void setNameRateHours(String pID,String fName, String lName,String bDate, String add, double pRate, double hWorked){
        super.setPerson(pID,fName,lName,bDate,add);
        this.payRate = pRate;
        this.hoursWorked = hWorked;
    }
    public double getPayRate(){
        return payRate;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public double calculatePay(){
        double pay =hoursWorked * payRate;
        super.print();
        System.out.println("Pay Rate:  "+getPayRate()+"\nHours Worked:  "+getHoursWorked()+
                           "\nCalculated Pay:  "+pay);
        return pay;
    }
}