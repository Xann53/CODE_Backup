abstract class SuficienciaPerson
{
    String name;
    String address;
    int age;
    
    public SuficienciaPerson(String myName, String myAddress, int myAge)
    {
        name=myName;
        address=myAddress;
        age=myAge;
    }
    public void setName(String myName)
    {
        name=myName;
    }
    public void setAddress(String myAddress)
    {
        address=myAddress;
    }
    public void setAge(int myAge)
    {
        age=myAge;
    }
}