/**
 * class Address  includes attributes: streetNum, streetName, city, zip, state.
 * this class create and store address information
 *
 * @author Diem.Vu
 * @version 1.0
 */
public class Address {
    /**The class has private attributes*/
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;
    //Constructor

    public Address(int streetNum, String streetName, String city, String state, String zip) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
