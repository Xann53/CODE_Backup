public class Rectangle{
    
    private double length;
    private double width;
    
    public void Rectangle(){
        length = 89;
        width = 30;
    }
    public void Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setDimension(double length, double width){
        
    }
    public void getLength(double length){
        this.length = length;
    }
    public void getWidth(double width){
        this.width = width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public void print(){
        
    }
}