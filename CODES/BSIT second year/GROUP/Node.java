public class Node
{
    int number; //stores the value
    Node link;  //stores the address (The type should be the same name with the class name)
    
    Node () {
        number=0;
        link = null;
    }
    Node (int num) {
        number = num;
        link = null;
    }
}