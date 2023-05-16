public class Address
{
    private String street, barangay, cityMun;
    
    public Address() {
        this.street = null;
        this.barangay = null;
        this.cityMun = null;
    }
    public Address(String street, String barangay, String cityMun) {
        SetStreet(street);
        SetBarangay(barangay);
        SetCityMun(cityMun);
    }
    
    public void SetStreet(String street) {
        this.street = street;
    }
    public void SetBarangay(String barangay) {
        this.barangay = barangay;
    }
    public void SetCityMun(String cityMun) {
        this.cityMun = cityMun;
    }
    
    public String GetStreet() {
        return street;
    }
    public String GetBarangay() {
        return barangay;
    }
    public String GetCityMun() {
        return cityMun;
    }
}