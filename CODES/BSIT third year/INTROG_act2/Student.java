public class Student extends Person
{
    private int idNo;
    private String course;
    
    public Student() {
        super();
        this.idNo = 0;
        this.course = null;
    }
    public Student(int idNo, String course, String name, String gender, int age, String street, String barangay, String cityMun) {
        super(name, gender, age, street, barangay, cityMun);
        SetIdNo(idNo);
        SetCourse(course);
    }
    
    public void SetIdNo(int idNo) {
        this.idNo = idNo;
    }
    public void SetCourse(String course) {
        this.course = course;
    }
    
    public int GetIdNo() {
        return idNo;
    }
    public String GetCourse() {
        return course;
    }
}