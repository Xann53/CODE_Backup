public class Student {
    private int IDnum;
    private CollegeCourse[] course = new CollegeCourse[5];
    public void setStudentID(int ID) {
        IDnum = ID;
    }
    public int getStudentID() {
        return IDnum;
    }
    public CollegeCourse getCourse(int i) {
        return course[i];
    }
    public void setCourse(CollegeCourse c,int i) {
        course[i] = c;
    }
}