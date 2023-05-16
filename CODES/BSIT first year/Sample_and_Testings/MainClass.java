public class MainClass{
    public static void main(String[] args){
        Person p=new Person();
        Student s=new Student("Argel Urmeneta", "Cebu City", 20, 1234, "BSIT");
        Teacher t=new Teacher("Angelo Telamo", "Cebu City", 20, 8888, "Java");
       
        // p.setName("Elijah Esguerra");
        s.studInfo();
        
        s.setName("Xannetz Suficiencia");
        s.setAddress("Bacayan, Cebu City");
        s.setAge(21);
        
        s.studInfo();
        // t.teacherInfo();
        // p.info();
        
    }
}