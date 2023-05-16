public class Mitsubishi extends Car {
    private int age;
    
    public Mitsubishi() {
        this.age = 0;
    }
    public Mitsubishi(int age, String name, int cylinders) {
        super(name, cylinders);
        this.age = age;
    }
    
    public String StartEngine() {
        return (GetName() + " is starting engine.");
    }
    public String Accelerate() {
        return (GetName() + " is accelerating engine.");
    }
    public String Brake() {
        return (GetName() + " is braking engine.");
    }
    
    public void SetAge(int age) {
        this.age = age;
    }
    public int GetAge() {
        return this.age;
    }
}