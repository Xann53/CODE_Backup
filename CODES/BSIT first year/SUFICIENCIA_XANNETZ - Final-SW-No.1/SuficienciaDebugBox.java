public class SuficienciaDebugBox
{
    private int width;
    private int length;
    private int height;
    public SuficienciaDebugBox()
    {
        this(1, 1, 1);
    }
    public SuficienciaDebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public void showData()
    {
        System.out.println("Width: "  + width + "  Length: " + length + "  Height: " + height);
    }
    public double getVolume()
    { 
        double vol = length * width * height;
        return vol;
    }
}