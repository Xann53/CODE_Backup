public class Directory
{
    String name;
    String contact;
    Directory link;
    Directory () {
        contact = "";
        link = null;
    }
    Directory (String name, String contact, Directory myLink) {
        this.name = name;
        this.contact = contact;
        link = myLink;
    }
}