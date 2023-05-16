public class Employee extends Person
{
    private int empNum;
    private String position;
    
    public Employee() {
        super();
        this.empNum = 0;
        this.position = null;
    }
    public Employee(int empNum, String position, String name, String gender, int age, String street, String barangay, String cityMun) {
        super(name, gender, age, street, barangay, cityMun);
        SetEmpNum(empNum);
        SetPosition(position);
    }
    
    public void SetEmpNum(int empNum) {
        this.empNum = empNum;
    }
    public void SetPosition(String position) {
        this.position = position;
    }
    
    public int GetEmpNum() {
        return empNum;
    }
    public String GetPosition() {
        return position;
    }
}