public class Car {
    private String name;
    private Boolean engine;
    private int cylinders, wheels;
    
    public Car() {
        this.engine = true;
        this.wheels = 4;
    }
    public Car(String name, int cylinders) {
        this.SetName(name);
        this.SetCylinders(cylinders);
    }
    
    public String StartEngine() {
        return ("The car's engine is starting.");
    }
    public String Accelerate() {
        return ("The car's engine is accelerating.");
    }
    public String Brake() {
        return ("The car's engine is activating the brakes.");
    }
    
    public void SetName(String name) {
        this.name = name;
    }
    public void SetCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public String GetName() {
        return this.name;
    }
    public int GetCylinders() {
        return this.cylinders;
    }
}