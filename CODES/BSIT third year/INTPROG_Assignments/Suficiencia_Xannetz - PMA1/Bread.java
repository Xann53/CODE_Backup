public class Bread {
    private String breadType;
    private double calPerSlice;
    public final String motto = "The staff of life";
    
    public Bread() {
        this.breadType = null;
        this.calPerSlice = 0;
    }
    public Bread(String breadType, double calPerSlice) {
        this.SetBreadType(breadType);
        this.SetCalPerSlice(calPerSlice);
    }
    public void SetBreadType(String breadType) {
        this.breadType = breadType;
    }
    public void SetCalPerSlice(double calPerSlice) {
        this.calPerSlice = calPerSlice;
    }
    public String GetBreadType() {
        return this.breadType;
    }
    public double GetCalPerSlice() {
        return this.calPerSlice;
    }
}