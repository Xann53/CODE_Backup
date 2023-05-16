public class SuficienciaTeacher extends SuficienciaPerson
{
    private int empId;
    private String expertise;
    
    public SuficienciaTeacher(String name, String address, int age, int empId, String expertise)
    {
        super(name, address, age);
        this.empId=empId;
        this.expertise=expertise;
    }
    public void teacherInfo()
    {
        System.out.println();
        System.out.println("Employee ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Expertise: "+expertise);
    }
}