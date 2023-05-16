public class Area extends Shape {
    public void RectangleArea(double length, double width) {
        double recArea = length * width;
        System.out.println("The area of the rectangle is: " + Math.round(recArea*100)/100D);
    }
    public void SquareArea(double sides) {
        double squArea = sides * sides;
        System.out.println("The area of the square is: " + Math.round(squArea*100)/100D);
    }
    public void CircleArea(double radius) {
        double cirArea = 3.14 * (radius * radius);
        System.out.println("The area of the circle is: " + Math.round(cirArea*100)/100D);
    }
}

