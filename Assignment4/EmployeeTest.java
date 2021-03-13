

/**
 * class EmployeeTest
 * <p>
 * This class implements main() method to test for an instance of class Employee
 *
 * @author Diem.Vu
 * @since 03.11.2021
 */
public class EmployeeTest {

    public static void main(String[]args){

        //Create an Employee instance
        Employee employee = new Employee ("John", "Smith", 101, 35.00);
        //Use computePay() method call to print to command line
        //what this employee earned for the following number of hours:
        //40, 23, 1, 0, -5, 45
        System.out.println("The salaray of employee " + employee.getFirstName() + " " + employee.getLastName()
                + " in 40 hours is $" + employee.computePay(40));
        System.out.println();
        System.out.println("The salaray of employee " + employee.getFirstName() + " " + employee.getLastName()
                + " in 23 hours is $" + employee.computePay(23));
        System.out.println();
        System.out.println("The salaray of employee " + employee.getFirstName() + " " + employee.getLastName()
                + " in 1 hours is $" + employee.computePay(1));
        System.out.println();
        System.out.println("The salaray of employee " + employee.getFirstName() + " " + employee.getLastName()
                + " in 0 hours is $" + employee.computePay(0));
        System.out.println();
        System.out.println("The salaray of employee " + employee.getFirstName() + " " + employee.getLastName()
                + " in -5 hours is $" + employee.computePay(-5));
        System.out.println();
        System.out.println("The salaray of employee " + employee.getFirstName() + " " + employee.getLastName()
                + " in 45 hours is $" + employee.computePay(45));
    }
}
