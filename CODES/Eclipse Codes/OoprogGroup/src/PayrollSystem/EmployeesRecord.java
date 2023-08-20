package PayrollSystem;

public class EmployeesRecord {
	
    private String empID;
    private String empLName;
    private String empFName;
    private String empMI;
    private String empGender;
    private int empNumDependents;
    private String empDivision;
    private double empHrsWorked;
    private double empHrsOvertime;
    private double empRatePerHr;
    private double empBasicPay;
    private double empSSSDeduction;
    private double empTaxDeduction;
    private double empHealthInsurance;
    private double empUnionDues;
    private double empDeducOthers;
    private double empNetPay;
    
    public EmployeesRecord() {
        this.empID = "";
        this.empLName = "";
        this.empFName = "";
        this.empMI = "";
        this.empGender = "";
        this.empNumDependents = 0;
        this.empDivision = "";
        this.empHrsWorked = 0;
        this.empHrsOvertime = 0;
        this.empRatePerHr = 0;
        this.empBasicPay = 0;
        this.empSSSDeduction = 0;
        this.empTaxDeduction = 0;
        this.empHealthInsurance = 0;
        this.empUnionDues = 0;
        this.empDeducOthers = 0;
        this.empNetPay = 0;
    }
    public EmployeesRecord(String ID, String LName, String FName, String MI, String Gender,
    int NumDependents, String Division, double HrsWorked, double HrsOvertime,
    double RatePerHr, double BasicPay, double SSSDeduction, double TaxDeduction,
    double HealthInsurance, double UnionDues, double DeducOthers, double NetPay) {
        setEmployees(ID, LName, FName, MI, Gender, NumDependents, Division, HrsWorked,
        HrsOvertime, RatePerHr, BasicPay, SSSDeduction, TaxDeduction, HealthInsurance,
        UnionDues, DeducOthers, NetPay);
    }
    public void setEmployees(String ID, String LName, String FName, String MI, String Gender,
    int NumDependents, String Division, double HrsWorked, double HrsOvertime,
    double RatePerHr, double BasicPay, double SSSDeduction, double TaxDeduction,
    double HealthInsurance, double UnionDues, double DeducOthers, double NetPay) {
        this.empID = ID;
        this.empLName = LName;
        this.empFName = FName;
        this.empMI = MI;
        this.empGender = Gender;
        this.empNumDependents = NumDependents;
        this.empDivision = Division;
        this.empHrsWorked = HrsWorked;
        this.empHrsOvertime = HrsOvertime;
        this.empRatePerHr = RatePerHr;
        this.empBasicPay = BasicPay;
        this.empSSSDeduction = SSSDeduction;
        this.empTaxDeduction = TaxDeduction;
        this.empHealthInsurance = HealthInsurance;
        this.empUnionDues = UnionDues;
        this.empDeducOthers = DeducOthers;
        this.empNetPay = NetPay;
    }
    public String toString() {
    	return getLastName() + "_" + getFirstName() + "_" + getMI() + "_" + getID() + "_" + getGender() + "_" + getDivision();
    }
    public String stringFormat(String in, String out) {
    	int ctr = 50;
    	out = in;
    	for(int i = 0; i < in.length(); i++) {
    		ctr--;
    	}
    	for(int i = 0; i < ctr; i++) {
    		out += " ";
    	}
    	return out;
    }
    public void setID(String ID) {
        this.empID = ID;
    }
    public void setLastName(String LName) {
        this.empLName = LName;
    }
    public void setFirstName(String FName) {
        this.empFName = FName;
    }
    public void setDivision(String Division) {
        this.empDivision = Division;
    }
    public void setGender(String Gender) {
        this.empGender = Gender;
    }
    public void setMI(String MI) {
        this.empMI = MI;
    }
    public void setNumDependents(int NumDependents) {
        this.empNumDependents = NumDependents;
    }
    public void setHoursWorked(double HrsWorked) {
        this.empHrsWorked = HrsWorked;
    }
    public void setHoursOvertime(double HrsOvertime) {
        this.empHrsOvertime = HrsOvertime;
    }
    public void setRatePerHour(double RatePerHr) {
        this.empRatePerHr = RatePerHr;
    }
    public void setBasicPay(double BasicPay) {
        this.empBasicPay = BasicPay;
    }
    public void setSSSDeduction(double SSSDeduction) {
        this.empSSSDeduction = SSSDeduction;
    }
    public void setTaxDeduction(double TaxDeduction) {
        this.empTaxDeduction = TaxDeduction;
    }
    public void setHealthInsurance(double HealthInsurance) {
        this.empHealthInsurance = HealthInsurance;
    }
    public void setUnionDues(double UnionDues) {
        this.empUnionDues = UnionDues;
    }
    public void setDeducOthers(double DeducOthers) {
        this.empDeducOthers = DeducOthers;
    }
    public void setNetPay(double NetPay) {
        this.empNetPay = NetPay;
    }
    public String getID() {
        return empID;
    }
    public String getLastName() {
        return empLName;
    }
    public String getFirstName() {
        return empFName;
    }
    public String getDivision() {
        return empDivision;
    }
    public String getGender() {
        return empGender;
    }
    public String getMI() {
        return empMI;
    }
    public int getNumDependents() {
        return empNumDependents;
    }
    public double getHoursWorked() {
        return empHrsWorked;
    }
    public double getHoursOvertime() {
        return empHrsOvertime;
    }
    public double getRatePerHour() {
        return empRatePerHr;
    }
    public double getBasicPay() {
        return empBasicPay;
    }
    public double getSSSDeduction() {
        return empSSSDeduction;
    }
    public double getTaxDeduction() {
        return empTaxDeduction;
    }
    public double getHealthInsurance() {
        return empHealthInsurance;
    }
    public double getUnionDues() {
        return empUnionDues;
    }
    public double getDeducOthers() {
        return empDeducOthers;
    }
    public double getNetPay() {
        return empNetPay;
    }
}
