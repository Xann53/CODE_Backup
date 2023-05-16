public class SuficienciaStudent extends SuficienciaPerson
{
    private int studId;
    private String course;
    
    public SuficienciaStudent(String name, String address, int age, int studId, String course)
    {
        super(name, address, age);
        this.studId=studId;
        this.course=course;
    }
    public void studInfo()
    {
        System.out.println();
        System.out.println("Student ID: "+studId);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
    }
}