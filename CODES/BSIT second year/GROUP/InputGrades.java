import java.util.Scanner;
import java.util.*;
public class InputGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CollegeCourse[] course = new CollegeCourse[50];
        Student[] stud = new Student[10];
        String cID;
        int sID = 0, credit = 0;
        char grade;
        boolean stop = false;
        int i = 0;
        do {
            try{
                if(i < stud.length) {
                    System.out.print("Enter the ID number of Student " + (i+1) + ": ");
                    stud[i] = new Student();
                    sID = input.nextInt();
                    stud[i].setStudentID(sID);
                    for(int j = 0; j < 5; j++) {
                        course[j] = new CollegeCourse();
                        System.out.print("\nEnter the ID number of course " + (j+1) + ": ");
                        input.nextLine();
                        cID = input.nextLine();
                        course[j].setCourseID(cID);
                        System.out.print("Enter the credit hours for " + course[j].getCourseID() + ": ");
                        credit = input.nextInt();
                        course[j].setCreditHours(credit);
                        System.out.print("Enter the grade for " + course[j].getCourseID() + ": ");
                        input.nextLine();
                        grade = input.next().charAt(0);
                        course[j].setCreditHours(grade);
                        credit = 0;
                    }
                    sID = 0;
                    System.out.println();
                    i++;
                }else {
                    i = 0;
                    stop = true;
                }
            }catch (InputMismatchException e){
               System.out.println("\fInvalid Input\n");
               input.next();
            }
        }while(!stop);
        while(i < stud.length) {
            System.out.println("\nStudent " + (i+1) + "'s ID number: " + stud[i].getStudentID());
            System.out.println();
            for(int j = 0; j < 5; j++) {
                cID = course[j].getCourseID();
                System.out.println("Course ID: " + cID);
                credit = course[j].getCreditHours();
                System.out.println("Credit hours: " + credit);
                grade = course[j].getStudentGrade();
                System.out.println("Student grade: " + grade);
                System.out.println();
            }
            i++;
        }
    }
}