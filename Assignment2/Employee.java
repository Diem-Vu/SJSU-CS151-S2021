/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diem.Vu
 */
/**
 * Define and implement class Employee.
 * An employee is a person, so has all the attributes and functionality of a person.
 * In addition to being a person, an employee should have the following attributes:
 * employee id, employee status (can be contractor, full time, part time), pay amount.
 * The pay amount is meant to reflect the amount of pay an employee gets paid for a unit of time they work.
 * In other words, pay amount is the employee’s base pay.
 * For part time employees and contractors pay units are per hour.
 * For full time employees pay units are per year.
 */
public class Employee extends Person {
    private int id;
    private String status; //contractor, full time, part time
    private double payamount; //the employee’s base pay (per hr, per yr)

    public Employee() {
    }

    
    /**the constructor of this class should pass on instantiation of superclass’ attributes to the superclass constructo
     * @param firstname
     * @param lastname
     * @param age
     * @param ssn
     * @param address
     * @param gender
     * @param weight
     * @param id
     * @param status
     * @param payamount*/
    public Employee(String firstname, String lastname, int age, int ssn, String address, String gender, double weight, int id, String status, double payamount) {
        super(firstname, lastname, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.payamount = payamount;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPayamount() {
        return payamount;
    }

    public void setPayamount(double payamount) {
        this.payamount = payamount;
    }
    
    /** @return  */
    @Override
    public String toString(){
        super.toString();
        return "a" + status + "employee";
    }
    
    /**
     * print their own introduction by overriding method introduce()
     */
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Employee ID: " + id + "Employee Status:" + status);
        System.out.println("Salary: " + payamount);
    }

    /**
     * method calculatePay(), which accepts the number of units worked
     * (number of hours for part time employees and contractors or the number of weeks for full time employees).
     * This method should check the value of the employee status and use the proper
     * logic to compute the paycheck amount based on the base pay and the number of units of work.
     * @param unitwork
     * @return 
     */
    public double calculatePay(double unitwork) {
        double paycheck;
        if (!"part time".equals(status) && !"contractor".equals(status) && !"full time".equals(status)) {
            System.out.println("Invalid employee status!");
        }
        if ("full time".equals(status)) {
            paycheck = (payamount / 52) * unitwork;
        } else {
            paycheck = payamount * unitwork;
        }
        return paycheck;
    }

}
