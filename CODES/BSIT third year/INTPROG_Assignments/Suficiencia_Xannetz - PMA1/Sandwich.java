public class Sandwich {
    private Bread b_OBJ;
    private SandwichFilling sf_OBJ;
    
    public Sandwich() {
        this.b_OBJ = new Bread();
        this.sf_OBJ = new SandwichFilling();
    }
    public Sandwich(String breadType, double calPerSlice, String fillingType,
    double calPerServe) {
        this.SetBread(breadType, calPerSlice);
        this.SetSandwichFilling(fillingType, calPerServe);
    }
    public void SetBread(String breadType, double calPerSlice) {
        this.b_OBJ = new Bread(breadType, calPerSlice);
    }
    public void SetSandwichFilling(String fillingType, double calPerServe) {
        this.sf_OBJ = new SandwichFilling(fillingType, calPerServe);
    }
    public String GetBreadType() {
        return this.b_OBJ.GetBreadType();
    }
    public double GetCalPerSlice() {
        return this.b_OBJ.GetCalPerSlice();
    }
    public String GetFillingType() {
        return this.sf_OBJ.GetFillingType();
    }
    public double GetCalPerServe() {
        return this.sf_OBJ.GetCalPerServe();
    }
    public String GetMotto() {
        return this.b_OBJ.motto;
    }
}