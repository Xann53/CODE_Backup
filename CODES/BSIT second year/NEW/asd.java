import java.util.*;
public class asd
{
    public static void main(String[] args) {
        String output = "world";
        String employeeInfo = String.format("%-20s %-10s %-6s", "hello", output, ":)");
        System.out.print(employeeInfo + "\n");
        String[][] employee = new String[10][6];
        try {
            for(int i = 0; i < employee.length; i++) {
            	String info = "hello world and hello freind hi";
            	employee[i] = info.split(" ");
            }
            for(int i = 0; i < employee.length; i++) {
            	for(int j = 0; j < employee[i].length; j=j+2) {
            	    System.out.print(employee[i][j] + " ");
            	}
            	System.out.println();
            }
        } catch(Exception e) {}
    }
}