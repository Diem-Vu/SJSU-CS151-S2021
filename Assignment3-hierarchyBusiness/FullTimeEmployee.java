
/**
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 02/21/2021
 */
abstract class FullTimeEmployee extends Employee {

    private double basePay;


    public FullTimeEmployee() {}


    public FullTimeEmployee(String firstname, String lastname, Address address, String SSN, int id, double basePay) {
        super(firstname, lastname, address, SSN, id);
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
