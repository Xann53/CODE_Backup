public class SuficienciaDebugBox
{
    private int Hello;
    private int Hi;
    private int World;
    public SuficienciaDebugBox()
    {
        this(1, 1, 1);
    }
    public SuficienciaDebugBox(int width, int length, int height)
    {
        this.Hello = width;
        this.Hi = length;
        this.World = height;
    }
    public void showData()
    {
        System.out.println("Width: "  + Hello + "  Length: " +
        Hi + "  Height: " + World);
    }
    public double getVolume()
    { 
        double vol = Hello * Hi * World;
        return vol;
    }
}