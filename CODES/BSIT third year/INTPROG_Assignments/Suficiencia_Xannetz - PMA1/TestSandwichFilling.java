public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling OBJ1 = new SandwichFilling("Chocolate Spread", 200);
        SandwichFilling OBJ2 = new SandwichFilling("Cheese spread", 165);
        SandwichFilling OBJ3 = new SandwichFilling("Blueberry", 55.2);
        
        System.out.println("1st type of sandwich filling:");
        System.out.println("\n\tFilling Type: " + OBJ1.GetFillingType());
        System.out.println("\tCalories per Serving: " + OBJ1.GetCalPerServe() + "\n\n");
        
        System.out.println("2nd type of sandwich filling:");
        System.out.println("\n\tFilling Type: " + OBJ2.GetFillingType());
        System.out.println("\tCalories per Serving: " + OBJ2.GetCalPerServe() + "\n\n");
        
        System.out.println("3rd type of sandwich filling:");
        System.out.println("\n\tFilling Type: " + OBJ3.GetFillingType());
        System.out.println("\tCalories per Serving: " + OBJ3.GetCalPerServe());
    }
}