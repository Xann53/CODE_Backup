import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        BankA A = new BankA();
        BankB B = new BankB();
        BankC C = new BankC();
        
        System.out.println("$" + String.format("%.2f",A.GetBalance()) + " was deposited to Bank A.");
        System.out.println("$" + String.format("%.2f",B.GetBalance()) + " was deposited to Bank B.");
        System.out.println("$" + String.format("%.2f",C.GetBalance()) + " was deposited to Bank C.");
    }
}

