public class Person
{
    private String name, gender;
    private int age;
    private Address addOBJ;
    
    public Person() {
        this.name = null;
        this.gender = null;
        this.age = 0;
        this.addOBJ = new Address();
    }
    public Person(String name, String gender, int age, String street, String barangay, String cityMun) {
        SetName(name);
        SetGender(gender);
        SetAge(age);
        this.addOBJ = new Address(street, barangay, cityMun);
    }
    
    public void SetName(String name) {
        this.name = name;
    }
    public void SetGender(String gender) {
        this.gender = gender;
    }
    public void SetAge(int age) {
        this.age = age;
    }
    
    public String GetName() {
        return name;
    }
    public String GetGender() {
        return gender;
    }
    public int GetAge() {
        return age;
    }
    
    public void ForwardStreet(String street) {
        addOBJ.SetStreet(street);
    }
    public void ForwardBarangay(String barangay) {
        addOBJ.SetBarangay(barangay);
    }
    public void ForwardCityMun(String cityMun) {
        addOBJ.SetCityMun(cityMun);
    }
    
    public String PassStreet() {
        return addOBJ.GetStreet();
    }
    public String PassBarangay() {
        return addOBJ.GetBarangay();
    }
    public String PassCityMun() {
        return addOBJ.GetCityMun();
    }
}