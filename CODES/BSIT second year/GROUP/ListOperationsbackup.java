public class ListOperationsbackup {
    Nodebackup head; //reference to the first node of the list
    
    ListOperationsbackup () {
        head = null;
    }
    
    public void insertBeginning (int number) {
        head = new Nodebackup (number, head);
    }
    
    public void deleteBeginning () {
        if (isEmpty())
            System.out.println ("\nCannot delete because the list is empty.");
        else {
            head = head.link;
        }
    }
    
    public void displayAll () {
        System.out.println ("\nList values:");
        
        for (Nodebackup temp=head; temp!=null; temp=temp.link)
            System.out.println (temp.number);
            
    }
    
    public boolean searchTarget (int target) {
    
        for (Nodebackup temp=head; temp!=null; temp=temp.link){
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
