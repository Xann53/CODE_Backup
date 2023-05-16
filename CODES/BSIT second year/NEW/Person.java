public class Person
{
    private String personID, firstName, lastName, birthDate, address;
    public Person(){
        this.personID = ""; 
        this.firstName = "";
        this.lastName = ""; 
        this.birthDate = "";
        this.address = "";
    }
    public Person(String pID, String fName, String lName, String bDate, String add){
        setPerson(pID, fName, lName, bDate, add);
    }
    public void setPerson(String pID, String fName, String lName, String bDate, String add){
        this.personID = pID; 
        this.firstName = fName;
        this.lastName = lName; 
        this.birthDate = bDate;
        this.address = add;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getAddress(){
        return address;
    }
    public void print(){
        System.out.println("ID Number: " +personID+ "\nFirst Name:  "+firstName+ 
                            "\nLast Name:  "+lastName+ "\nBirth Date:  "+birthDate+
                            "\nAddress:  "+address);
    }
    public String toString(){
        return "ID Number: " +personID+ "\nFirst Name:  "+firstName+ 
                            "\nLast Name:  "+lastName+ "\nBirth Date:  "+birthDate+
                            "\nAddress:  "+address;
    }
}