public class CollegeCourse {
    private String courseID;
    private char studentGrade;
    private int creditHours;
    public CollegeCourse() {
        courseID = "";
        creditHours = 0;
    }
    public CollegeCourse(String ID, char grade, int hours) {
        courseID = ID;
        studentGrade = grade;
        creditHours = hours;
    }
    public void setCourseID(String ID) {
        courseID = ID;
    }
    public void setStudentGrade(char grade) {
        studentGrade = grade;
    }
    public void setCreditHours(int hours) {
        creditHours = hours;
    }
    public String getCourseID() {
        return courseID;
    }
    public char getStudentGrade() {
        return studentGrade;
    }
    public int getCreditHours() {
        return creditHours;
    }
}