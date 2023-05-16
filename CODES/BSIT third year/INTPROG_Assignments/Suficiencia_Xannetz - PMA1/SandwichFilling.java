public class SandwichFilling {
    private String fillingType;
    private double calPerServe;
    
    public SandwichFilling() {
        this.fillingType = null;
        this.calPerServe = 0;
    }
    public SandwichFilling(String fillingType, double calPerServe) {
        this.SetFillingType(fillingType);
        this.SetCalPerServe(calPerServe);
    }
    public void SetFillingType(String fillingType) {
        this.fillingType = fillingType;
    }
    public void SetCalPerServe(double calPerServe) {
        this.calPerServe = calPerServe;
    }
    public String GetFillingType() {
        return this.fillingType;
    }
    public double GetCalPerServe() {
        return this.calPerServe;
    }
}