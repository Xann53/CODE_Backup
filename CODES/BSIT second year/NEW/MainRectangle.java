public class MainRectangle{
    public static void main(String [] args){
        Rectangle rec = new Rectangle();
        rec.Rectangle(25.40, 23.60);
        double area = rec.area();
        double perimeter = rec.perimeter();
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        
        Rectangle rec1 = new Rectangle();
        rec1.getLength(56.90);
        rec1.getWidth(72.56);
        area = rec1.area();
        perimeter = rec1.perimeter();
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}