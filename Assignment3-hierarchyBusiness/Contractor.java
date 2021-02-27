

/**
 *
 * @author Diem.Vu
 * @version 1.0
 */
public class Contractor extends Employee {

    private double basePay;

    /** Empty constructor*/
    public Contractor() {
    }

    /**Constructor with arguments
     * @param firstname
     * @param lastname
     * @param address
     * @param SSN
     * @param id
     * @param pay */
    public Contractor(String firstname, String lastname, Address address, String SSN, int id, double pay) {
        super(firstname, lastname, address, SSN, id);
        this.basePay = pay;
    }

    public double getBasePay() {
        return basePay;
    }

    /**
     *
     * @param basePay
     */
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nContractor has " + "basePay $" + basePay + " per hour";
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
     * this method will accept the number of hours as an input argument
     * the pay is calculated by simply multiplying the number of hours they worked by the base pay
     * @param numHrs
     * @return
     */
    public double computePay(int numHrs){
        return basePay*numHrs;
    }

}
