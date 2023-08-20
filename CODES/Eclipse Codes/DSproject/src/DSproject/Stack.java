package DSproject;

public class Stack

{

   private int top;

   private int max;

   private int array[];

  

   //default constructor

   Stack(int size) {

       array = new int[size];

       max = size;

       top = -1;

   }

   public void push(int num) {

       array[++top] = num;

   }

   public int pop() {

       return array[top--];

   }

   public boolean isEmpty() {

       return top == -1; //check if stack is empty

   }

   public boolean isFull() {

       return top == max-1; //check if stack is full

   }

}