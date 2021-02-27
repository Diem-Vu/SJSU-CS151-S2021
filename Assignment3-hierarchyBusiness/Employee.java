


/**
 *
 * @author Diem.Vu
 * @version 1.0
 */
abstract class Employee extends Person {
    /** attributes
     */
    private int id;
    private String educationlevel;
    private boolean directDeposit;
    /** constructor*/
    public Employee() {
    }

    public Employee(String firstname, String lastname, Address address, String SSN, int id) {
        super(firstname, lastname, address, SSN);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEducationlevel() {
        return educationlevel;
    }

    public boolean isDirectDeposit() {
        return directDeposit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEducationlevel(String educationlevel) {
        this.educationlevel = educationlevel;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    @Override
    public String toString(){
        return super.toString() + "\nEmployee: " + "id: " + id + ", directDeposit: " + directDeposit;
    }

    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }

}
