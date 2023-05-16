public class Person{
    //Attributes / Properties
    String name;
    String address;
    int age;
    
    //Constructor
    public Person(){
        name="";
        address="";
        age=0;
    }
    public Person(String myName, String myAddress, int myAge){
        name=myName;
        address=myAddress;
        age=myAge;
    }
    
    //Methods / behavior
    //getters and setters
    public void setName(String myName){
        name=myName;
    }

    public String getName(){
        return name;
    }
    
    public void setAddress(String myAddress){
        address=myAddress;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAge(int myAge){
        age=myAge;
    }
    
    public int getAge(){
        return age;
    }
    
    public void info(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
    }
}