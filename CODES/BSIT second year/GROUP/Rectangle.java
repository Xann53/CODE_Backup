public class Rectangle
{
    private double length;
    private double width;
    
    public Rectangle()
    {
        length = 0;
        width = 0;
    }
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    public void setLength(double l)
    {
        length = l;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double computeArea()
    {
        double Area = length * width;
        return Area;
    }
    public double computePerimeter()
    {
        double Perimeter = (length + width) * 2;
        return Perimeter;
    }
}