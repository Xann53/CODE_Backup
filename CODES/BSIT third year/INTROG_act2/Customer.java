public class Customer extends Person
{
    private int cusNo;
    
    public Customer() {
        super();
        this.cusNo = 0;
    }
    public Customer(int cusNo, String name, String gender, int age, String street, String barangay, String cityMun) {
        super(name, gender, age, street, barangay, cityMun);
        SetCusNo(cusNo);
    }
    
    public void SetCusNo(int cusNo) {
        this.cusNo = cusNo;
    }
    
    public int GetCusNo() {
        return cusNo;
    }
}