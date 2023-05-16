import java.util.Scanner;
public class MainClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENTER STUDENT'S INFO HERE");
        System.out.print("Enter student's name: ");
        String stdntName = "";
        stdntName += input.nextLine();
        System.out.print("Enter student's address: ");
        String stdntAddress = "";
        stdntAddress += input.nextLine();
        System.out.print("Enter student's age: ");
        int stdntAge = input.nextInt();
        System.out.print("Enter student's ID number: ");
        int stdntID = input.nextInt();
        System.out.print("Enter student's course: ");
        String stdntCourse = "";
        stdntCourse += input.nextLine();
        stdntCourse += input.nextLine();
        
        System.out.println("\nENTER TEACHER'S INFO HERE");
        System.out.print("Enter teacher's name: ");
        String teachName = "";
        teachName += input.nextLine();
        System.out.print("Enter teacher's address: ");
        String teachAddress = "";
        teachAddress += input.nextLine();
        System.out.print("Enter teacher's age: ");
        int teachAge = input.nextInt();
        System.out.print("Enter teacher's ID number: ");
        int teachID = input.nextInt();
        System.out.print("Enter teacher's expertise: ");
        String teachExpertise = "";
        teachExpertise += input.nextLine();
        teachExpertise += input.nextLine();
        
        SuficienciaStudent s=new SuficienciaStudent(stdntName, stdntAddress, stdntAge, stdntID, stdntCourse);
        SuficienciaTeacher t=new SuficienciaTeacher(teachName, teachAddress, teachAge, teachID, teachExpertise);
        
        s.studInfo();
        t.teacherInfo();
        
    }
}