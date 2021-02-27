

/**
 *
 * @author Diem.Vu
 * * @version 1.0
 * @since 02/21/2021
 */
public class PartTimeHourly extends Employee {

    private double baseHourPay;

    /**
     * empty constructor
     */
    public PartTimeHourly() {}

    /**
     *
     * @param firstname
     * @param lastname
     * @param address
     * @param SSN
     * @param id
     * @param pay
     */
    public PartTimeHourly(String firstname, String lastname, Address address, String SSN, int id, double pay) {
        super(firstname, lastname, address, SSN, id);
        this.baseHourPay = pay;
    }

    /**
     *
     * @return
     */
    public double getBaseHourPay() {
        return baseHourPay;
    }

    /**
     *
     * @param baseHourPay
     */
    public void setBaseHourPay(double baseHourPay) {
        this.baseHourPay = baseHourPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPart Time Hourly employee has " + "baseHourPay: $" + baseHourPay + " per hour";
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
     * computePay(numHrs): Double
     * Part time hourly employees are not allowed to work more than 40 hours a week.
     *
     * @param numHrs
     * @return
     */
    public double computePay(int numHrs){
        if (numHrs <= 40) {
            return baseHourPay*numHrs;
        }else{
            System.out.println("Please check the number of working hours. A part time hourly employee cannot work more than 40 hours. ");
            return -1;
        }
    }


}
