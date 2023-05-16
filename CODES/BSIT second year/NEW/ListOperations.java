public class ListOperations {
    Node head; //reference to the first node of the list
    Node end; //reference to the last node of the list
    ListOperations () {
        head = null;
        end = null;
    }
    public void insertBeginning (int number) {
        if(isEmpty()) {
            head = new Node (number, head);
            end = head;
        } else {
            head = new Node (number, head);
        }        
    }
    public void insertEnd (int number) {
        if(isEmpty()) {
            head = new Node (number, head);
            end = head;
        } else {
            end.link = new Node (number, end.link);
            end = end.link;
        }
    }
    public void deleteBeginning() {
        if (isEmpty())
            System.out.println ("\nCannot delete because the list is empty.");
        else {
            head = head.link;
        }
    }
    public void deleteEnd(){
        if (isEmpty())
            System.out.println ("\nCannot delete because the list is empty.");
        else {
            Node temp = head;
            while (temp.link.link != null) //find the second to the last node 
                temp = temp.link;
            
            end = temp; //assigning second to the last node as end    
            temp.link = null; //remove the last node
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
    public void numOfOccurrences (int target) {
        int count = 0;
        for (Node temp=head; temp!=null; temp=temp.link){
            if (target == temp.number) {                
                count++;
            }
        }
        System.out.println("Number of occurrences: " + count + " time(s)");
    }
    public void modifyValue (int target, int update) {
        boolean found = false;
        for (Node temp=head; temp!=null; temp=temp.link){
            if (target == temp.number) {                
                found = true;
                temp.number = update;
            }
        }
        if(!found)
            System.out.println("Number not found.");
    }
    public boolean isEmpty () {
        return (head == null);
    }
}
