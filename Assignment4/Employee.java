

/**
 * class Employee.
 * <p>
 * This class contains the following fields:
 * first name, last name, employee id, hourly pay.
 * This class contains getters and setters for all its attributes.
 * This class has one constructor.
 * Implement method computePay() in this class.
 * This method accepts an integer number of hours the employee worked
 * as an input argument and return a floating point value
 * indicating the pay the employee earned.
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.11.2021
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double hourlyPay;

    /**
     *
     * @param firstName
     * @param lastName
     * @param employeeId
     * @param hourlyPay
     */
    public Employee(String firstName, String lastName, int employeeId, double hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.hourlyPay = hourlyPay;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    /**
     * This method should accept an integer number of hours the employee worked
     * as an input argument and return a floating point value
     * indicating the pay the employee earned.
     * If the number of hours is invalid (e.g. a negative number)
     * this method should throw NumberFormatException.
     * If the number of hours is over 40 then this method should
     * throw a custom exception named TooManyHoursWorkedException.
     * @param numHrs
     * @return
    */
    public double computePay(int numHrs){
        double pay = 0;
        try{
            if (numHrs < 0){
                throw new NumberFormatException();
            }else if (numHrs > 40){
                throw new TooManyHoursWorkedException("Over 40 hours");
            } else {
                    pay = numHrs * hourlyPay;
            }
        }catch(NumberFormatException | TooManyHoursWorkedException e){
            System.out.println(e);
        }

        return pay;
    }

    private static class TooManyHoursWorkedException extends Exception {

        TooManyHoursWorkedException(String s) {
            super(s);
        }
    }

}
