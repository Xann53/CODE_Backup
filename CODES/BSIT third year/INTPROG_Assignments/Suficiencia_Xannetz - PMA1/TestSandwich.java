public class TestSandwich {
    public static void main(String[] args) {
        Sandwich OBJ1 = new Sandwich("Baguette", 278, "Chocolate Spread", 200);
        Sandwich OBJ2 = new Sandwich("Naan", 262, "Cheese spread", 165);
        Sandwich OBJ3 = new Sandwich("Cornbread", 330, "Blueberry", 55.2);
        
        System.out.println("1st bread and filling combination:");
        System.out.println("\n\tBread Type: " + OBJ1.GetBreadType());
        System.out.println("\tCalories per Slice: " + OBJ1.GetCalPerSlice());
        System.out.println("\n\tFilling Type: " + OBJ1.GetFillingType());
        System.out.println("\tCalories per Serving: " + OBJ1.GetCalPerServe());
        System.out.println("\n\tTotal Calories: " + ((OBJ1.GetCalPerSlice() * 2) + OBJ1.GetCalPerServe())
        + "\n\n");
        
        System.out.println("2nd bread and filling combination:");
        System.out.println("\n\tBread Type: " + OBJ2.GetBreadType());
        System.out.println("\tCalories per Slice: " + OBJ2.GetCalPerSlice());
        System.out.println("\n\tFilling Type: " + OBJ2.GetFillingType());
        System.out.println("\tCalories per Serving: " + OBJ2.GetCalPerServe());
        System.out.println("\n\tTotal Calories: " + ((OBJ2.GetCalPerSlice() * 2) + OBJ2.GetCalPerServe())
        + "\n\n");
        
        System.out.println("3rd bread and filling combination:");
        System.out.println("\n\tBread Type: " + OBJ3.GetBreadType());
        System.out.println("\tCalories per Slice: " + OBJ3.GetCalPerSlice());
        System.out.println("\n\tFilling Type: " + OBJ3.GetFillingType());
        System.out.println("\tCalories per Serving: " + OBJ3.GetCalPerServe());
        System.out.println("\n\tTotal Calories: " + ((OBJ3.GetCalPerSlice() * 2) + OBJ3.GetCalPerServe()));
    }
}