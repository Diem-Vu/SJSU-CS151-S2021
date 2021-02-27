

/**
 *
 * @author Diem.Vu
 */
public class FullTimeSalaried extends FullTimeEmployee {
    /**
     * constructor without arguments
     */
    public FullTimeSalaried() {
    }

    /**
     * constructor through parent class FullTimeEmployee
     * @param firstname
     * @param lastname
     * @param address
     * @param SSN
     * @param id
     * @param salary
     */
    public FullTimeSalaried(String firstname, String lastname, Address address, String SSN, int id, double salary) {
        super(firstname, lastname, address, SSN, id, salary);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFull Time Salaried employee.";
    }

    /**
     *
     * @param displaySSN
     */
    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }

    /**
     * ??????????????????????????????????????????? yearly compensation???????
     * this method will accept the number of weeks as an input argument
     * the pay is based on their yearly compensation adjusted to the number of weeks specified by the input argument
     * @param numWeeks
     * @return
     */
    public double computePay(int numWeeks){
        return (super.getBasePay()/52)*numWeeks;
    }



}
