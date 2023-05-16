public class Node
{
    int number;
    Node link;
    Node () {
        number = 0;
        link = null;
    }
    Node (int num, Node myLink) {
        number = num;
        link = myLink;
    }
}