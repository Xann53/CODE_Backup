public class ListOperations {
    Node head; //reference to the first node of the list
    Node tail;
    
    ListOperations () {
        head = null;
        tail = null;
    }
    
    public void insertEnd (int number) {
        Node newNode = new Node(number); 
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.link = newNode;
            tail = newNode;
        }
    }
    
    public void deleteEnd () {
        if (isEmpty())
            System.out.println ("\nCannot delete because the list is empty.");
        else {
            if(head != tail ) {  
                Node current = head; 
                while(current.link != tail) {  
                    current = current.link;  
                }
                tail = current;  
                tail.link = null;  
            }
            else {  
                head = tail = null;  
            }  
        } 
    }
    
    public void displayAll () {
        System.out.println ("\nList values:");
        
        for (Node temp=head; temp!=null; temp=temp.link)
            System.out.println (temp.number);
            
    }
    
    public boolean searchTarget (int target) {
    
        for (Node temp=head; temp!=null; temp=temp.link){
            if (target == temp.number) {                
                return true;
            }
        }
        return false;
    }
    
    public boolean isEmpty () {
        return (head == null);
    }
}