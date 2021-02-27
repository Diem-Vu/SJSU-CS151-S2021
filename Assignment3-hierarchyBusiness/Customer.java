

/**
 * class Customer will implement attributes and functionalities of class Person
 * @author Diem.Vu
 * @version 1.0
 */
public class Customer extends Person {

    /** attributes
     */
    private int customerID;
    private String payPreference;

    /**
     * constructor without arguments
     */
    public Customer() {}

    /**
     *
     * @param firstname
     * @param lastname
     * @param address
     * @param SSN
     * @param id
     */
    public Customer(String firstname, String lastname, Address address, String SSN, int id) {
        super(firstname, lastname, address, SSN);
        this.customerID = id;
    }

    //+ getID(): int+ setID(int):void
     public int getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     *
     * @return
     */
    public String getPayPreference() {
        return payPreference;
    }

    /**
     *
     * @param payPreference
     */
    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomer has " + "customerID: " + customerID ;
    }

    /**
     * SSN of Customer will never be displayed as the requirements
     * @param SSNFlag
     */
    @Override
    public void introduce(boolean SSNFlag){
        SSNFlag = false;
        super.introduce(SSNFlag);
    }

    /**
     * display the preferred method of payment for the customer to command line screen
     */
    public void makePayment(){
        System.out.println("Preferred method of payment: Visa/Master card");
    }

}
