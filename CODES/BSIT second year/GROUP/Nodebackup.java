public class Nodebackup
{
    int number; //stores the value
    Nodebackup link;  //stores the address (The type should be the same name with the class name)
    
    Nodebackup () {
        number=0;
        link = null;
    }
    Nodebackup (int num, Nodebackup myLink) {
        number = num;
        link = myLink;
    }
}