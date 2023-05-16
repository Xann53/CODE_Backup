public class TestBread {
    public static void main(String[] args) {
        Bread OBJ1 = new Bread("Baguette", 278);
        Bread OBJ2 = new Bread("Naan", 262);
        Bread OBJ3 = new Bread("Cornbread", 330);
        
        System.out.println("1st type of bread:");
        System.out.println("\n\tBread Type: " + OBJ1.GetBreadType());
        System.out.println("\tCalories per Slice: " + OBJ1.GetCalPerSlice());
        System.out.println("\t" + OBJ1.motto + "\n\n");
        
        System.out.println("2nd type of bread:");
        System.out.println("\n\tBread Type: " + OBJ2.GetBreadType());
        System.out.println("\tCalories per Slice: " + OBJ2.GetCalPerSlice());
        System.out.println("\t" + OBJ1.motto + "\n\n");
        
        System.out.println("3rd type of bread:");
        System.out.println("\n\tBread Type: " + OBJ3.GetBreadType());
        System.out.println("\tCalories per Slice: " + OBJ3.GetCalPerSlice());
        System.out.println("\t" + OBJ1.motto);
    }
}