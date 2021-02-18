

/**
 *
 * @author Diem.Vu
 * Define and implement class EmployeeTest.
 * This class should implement main() method. 
 * In the body of the main() method you should create the following Employee instances, 
 * call introduce()and calculatePay() on each one 
 * and display the results of calculatePay() method to command line
 * Joe Smith, a contractor, pay is $60/hr, should get paid or working 30 hours, 
 * other details are up to you 
 * Lisa Gray, a full time employee, pay is $110,000/yr, should get paid or working 2 weeks, 
 * other details are up to you 
 * Timothy Briggs, a full time employee, pay is $80,000/yr, should get paid or working 4 weeks, 
 * other details are up to you 
 * George Wallace, a part time employee, pay is $20/hr, should get paid or working 25 hours, 
 * other details are up to you 
 * Amy Student, a contractor employee, pay is $45/hr, should get paid or working 45 hours, 
 * other details are up to you 
 */
public class EmployeeTest  {
    
    /**
     * method result() to display the outputs in format
     * @param e
     * @param calculatedPay
     * @param unit*/
    static void result(Employee e, double calculatedPay, int unit){
        if ("full time".equals(e.getStatus())) {
            System.out.println(e.getFirstname() + " " + e.getLastname() 
                +  "a" + e.getStatus() + "employee, "
                        + "pay is $" + e.getPayamount() + "/yr, should get paid or working " 
                                + unit + " weeks with total: $" + calculatedPay +"\n");
        } else {
            System.out.println(e.getFirstname() + " " + e.getLastname() 
                +  "a" + e.getStatus() + "employee, "
                        + "pay is $" + e.getPayamount() + "/hr, should get paid or working " 
                                + unit + " hours with total: $" + calculatedPay +"\n");
        }
    }
    
    public static void main (String[]args){
        
        int unit; // variable unit hold value of how many unit the employee works
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        
        /**instance employee 1*/
        e1.setFirstname("John");
        e1.setLastname("Smith");
        e1.setStatus("contractor");
        e1.setPayamount(60.00);
        unit = 30;
        double pay1 = e1.calculatePay(unit);
        result(e1, pay1, unit);
        
        /**instance employee 2*/
        e2.setFirstname("Lisa");
        e2.setLastname("Gray");
        e2.setStatus("full time");
        e2.setPayamount(110000.00);
        unit = 2;
        double pay2 = e2.calculatePay(unit);
        result(e2, pay2, unit);
        
        /**instance employee 3*/
        e3.setFirstname("Timothy");
        e3.setLastname("Briggs");
        e3.setStatus("full time");
        e3.setPayamount(80000.00);
        unit = 4;
        double pay3 = e3.calculatePay(unit);
        result(e3, pay3, unit);
        
        /**instance employee 4*/
        e4.setFirstname("George");
        e4.setLastname("Wallace");
        e4.setStatus("part time");
        e4.setPayamount(28.00);
        unit = 25;
        double pay4 = e4.calculatePay(unit);
        result(e4, pay4, unit);
        
        /**instance employee 5*/
        e5.setFirstname("Amy");
        e5.setLastname("Student");
        e5.setStatus("contractor");
        e5.setPayamount(45.00);
        unit = 45;
        double pay5 = e5.calculatePay(unit);
        result(e5, pay5, unit);
        
    }    
}
