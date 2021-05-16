/**
 * @author Diem.Vu
 * @version 1.0
 * @since 02/21/2021
 */
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String SSN;
    private Address address;

    public Person() {
    }

    public Person(String firstname, String lastname, Address address, String SSN) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.SSN = SSN;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.lastname
                + ", address: " + address.getStreetNum() + " " + address.getStreetName()
                + ", " + address.getCity() + ", " + address.getState() + " " + address.getZip() + '.';
    }

    public void introduce(boolean displaySSN) {
        if (!displaySSN) {
            System.out.println(toString());
        } else {
            System.out.println("SSN: " + SSN + ", " + toString());
        }
    }
}
