

/**
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 02/21/2021
 */
public class Executive extends Employee {
    /**
     * attributes
     */
    private double yearlyBonus;
    private double Compensation;

    /**
     *
     */
    public Executive() {
    }

    /**
     *
     * @param firstname
     * @param lastname
     * @param address
     * @param SSN
     * @param id
     * @param pay
     * @param bonus
     */
    public Executive(String firstname, String lastname, Address address, String SSN, int id, double pay, double bonus) {
        super(firstname, lastname, address, SSN, id);
        this.yearlyBonus = bonus;
        this.Compensation = pay;
    }

    /**
     *
     * @return
     */
    public double getBonus() {
        return yearlyBonus;
    }

    /**
     *
     * @param yearlyBonus
     */
    public void setBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    /**
     *
     * @return
     */
    public double getCompensation() {
        return Compensation;
    }

    /**
     *
     * @param Compensation
     */
    public void setCompensation(double Compensation) {
        this.Compensation = Compensation;
    }

    @Override
    public String toString() {
        return super.toString() + "\nExecutive has " + "yearlyBonus: $" + yearlyBonus + ", Compensation: $" + Compensation + " per year.";
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
     * the pay is simply their yearly compensation plus the yearly bonus
     * @return
    */
    public double computePay(){
        return Compensation + yearlyBonus;
    }









}
