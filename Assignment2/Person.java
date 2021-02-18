
/**
 * <h1>Person</h1>
 * Define and implement class Person.
 * <p>
 * This class contains: first name, last name, age, social security number, address, gender, and weight.
 * This class contains getters and setters for all its attributes.
 * This class also has constructor implemented.
 * This class also overrides implementation of toString() method, and implement new method named introduce()
 * 
 * @author Diem Vu
 * @version 1.0
 * @since 2021-02-10
 */
public class Person {
    
    private String firstname;
    private String lastname;
    private int age;
    private int ssn;
    private String address;
    private String gender;
    private double weight;

    public Person() {
    }

    public Person(String firstname, String lastname, int age, int ssn, String address, String gender, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    /**
     * getters and setters for all its attributes
     * @return 
     */

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

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    /**
     * override implementation of toString() method
     * @return 
     */
    @Override
    public String toString() {
        return firstname + " " + lastname + ", " + age + " years, " + gender + ", SSN " + ssn + ", " + weight + " lbs, live in " + address ;
    }

    /**
     * implement method introduce(): display/print this person’s attribute values to the command line.
     */
    public void introduce() {
        System.out.println("Name: " + firstname + lastname);
        System.out.println("Age: " + age + "Gender: " + gender);
        System.out.println("SNN: " + ssn + "Weight: " + weight);
        System.out.println("Address: "+ address);
    }
    
}
