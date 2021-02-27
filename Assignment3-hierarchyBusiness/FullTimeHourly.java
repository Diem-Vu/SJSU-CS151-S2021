


/**
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 02/21/2021
 */
public class FullTimeHourly extends FullTimeEmployee {

    private double overtimePay;

    public FullTimeHourly() {}

    public FullTimeHourly(String firstname, String lastname, Address address, String SSN, int id, double basePay, double overtime) {
        super(firstname, lastname, address, SSN, id, basePay);
        this.overtimePay = overtime;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFullTimeHourly: " + "overtimePay $" + overtimePay + " per hour";
    }

    /**
     * introduce(displaySSN:boolean): void
     * @param displaySSN
     */
    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }

    /**
     * computePay(numHrs:int): Double
     * the pay is based on the hourly pay and the number of hours specified by the input argument
     * account for possible overtime
     * @param numHrs
     * @return
     */
    public double computePay(int numHrs){
        if (numHrs <= 40) {
            return super.getBasePay() * numHrs;
        }else{
            return (super.getBasePay() * 40) + ((numHrs - 40) * overtimePay);
        }
    }

}
