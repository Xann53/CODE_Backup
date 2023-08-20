package PayrollSystem;

public class EmployeeOperations{
    private EmployeesRecord[] emp;
    private int index;
    private int size;
    
    public EmployeeOperations() {
        this.index = 0;
        this.size = 999999;
        this.emp = new EmployeesRecord[size];
    }
    public void addEmployee(String ID, String LastName, String FirstName, String MiddleName, String Dependents, String Gender, String Division) {
        int NumDependents = Integer.parseInt(Dependents);
        emp[index] = new EmployeesRecord( ID, LastName, FirstName, MiddleName, Gender, NumDependents, Division, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        index++;
    }
    public void updateEmployee(String ID, String LastName, String FirstName, String MiddleName, String Dependents, String Gender, String Division) {
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    emp[i].setLastName(LastName) ;
                    emp[i].setFirstName(FirstName);
                    emp[i].setMI(MiddleName);
                    emp[i].setNumDependents(Integer.parseInt(Dependents));
                    emp[i].setGender(Gender);
                    emp[i].setDivision(Division);
                }
            }
        } catch(Exception e) {}
    }
    public boolean searchID(String ID) {
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    return true;
                }
            }
        } catch(Exception e) {}
        return false;
    }
    public String getLastName(String ID) {
        String LastName = "";
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    LastName = emp[i].getLastName();
                }
            }
        } catch(Exception e) {}
        return LastName;
    }
    public String getFirstName(String ID) {
        String FirstName = "";
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    FirstName = emp[i].getFirstName();
                }
            }
        } catch(Exception e) {}
        return FirstName;
    }
    public String getMiddleInitial(String ID) {
        String MiddleInitial = "";
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    MiddleInitial = emp[i].getMI();
                }
            }
        } catch(Exception e) {}
        return MiddleInitial;
    }
    public String getDependents(String ID) {
        String Dependents = "";
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    Dependents = "" + emp[i].getNumDependents();
                }
            }
        } catch(Exception e) {}
        return Dependents;
    }
    public String getGender(String ID) {
        String Gender = "";
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    Gender = emp[i].getGender();
                }
            }
        } catch(Exception e) {}
        return Gender;
    }
    public String getDivision(String ID) {
        String Division = "";
        try {
            for(int i = 0; i < emp.length && emp[i].getID() != null; i++) {
                if(emp[i].getID().equals(ID)) {
                    Division = emp[i].getDivision();
                }
            }
        } catch(Exception e) {}
        return Division;
    }
    public String[][] displayAll() {
    	String[][] employee;
    	String[] info;
    	int ctr = 0;
    	
    	try {
        	
        	for(int i = 0; i < emp.length; i++) {
        		if(emp[i].getLastName() != null) {
        			ctr++;
        		} else {
        			break;
        		}
        	}
        	
        } catch(Exception e) {}
        	
        employee = new String[ctr][6];
        info = new String[ctr];
        
        for(int i = 0; i < employee.length; i++) {
        	info[i] = emp[i].toString();
        }
        
        for(int i = 0; i < info.length; i++) {
        	for(int j = 0; j < info.length; j++) {
        		if(info[i].compareTo(info[j]) < 0) {
        			String temp = "" + info[i];
           			info[i] = info[j];
           			info[j] = temp;
        		}
           	}
        }
        
        for(int i = 0; i < info.length; i++) {
           	employee[i] = info[i].split("_");
        }
        
        return employee;
    }
}