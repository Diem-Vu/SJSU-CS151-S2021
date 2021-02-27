
/**
 * class BusinessTest
 * This class implements main() method.
 * The test class will test instances of classes:
 * Executive, FullTimeSalaried, FullTimeHourly, PartTimeHourly, Contractor, Customer.
 *
 * @author Diem.Vu
 * @version: 1.0
 */
public class BusinessTest {
    /**
     * In the body of the main() method,
     * at least 2 instances of each of the leaf classes is created: executive,
     * full time salaried employee, full time hourly employee, part time hourly employee,
     * hourly paid contractor, and customer.
     *
     * @param args
     */
    public static void main (String[]args){
        //2 instances of each of the leaf class executive
        Address addE1 = new Address(58, "Avin Rd", "San Jose", "CA", "95121");
        Executive ex1 = new Executive("John", "Matt", addE1, "123456789", 119031, 100000, 10000);
        Address addE2 = new Address(102, "Alameda Av", "San Jose", "CA", "94327");
        Executive ex2 = new Executive("Christina", "Adsander", addE2, "246436864", 119735, 150000, 15000);

        //2 instances of each of the leaf class full time salaried employee, salary is paid weekly
        Address addFS1 = new Address(770, "Senter Rd", "San Jose", "CA", "95121");
        FullTimeSalaried FS1 = new FullTimeSalaried("Rose", "Blade", addFS1, "654346764", 119153, 80000);
        Address addFS2 = new Address(1111, "Bereyessa", "Mipitas", "CA", "93211");
        FullTimeSalaried FS2 = new FullTimeSalaried("Alex", "Alma", addFS2, "728460724", 119333, 85000);

        //2 instances of each of the leaf class full time hourly employee, basePay per hour
        Address addFH1 = new Address(821, "Khrme Ct", "Santa Clara", "CA", "93221");
        FullTimeHourly FH1 = new FullTimeHourly("Ema", "Charex", addFH1, "374859273", 119234, 45, 50);
        Address addFH2 = new Address(9231, "Rane Ave", "Cupertino", "CA", "91221");
        FullTimeHourly FH2 = new FullTimeHourly("Tom", "Max", addFH2, "394857102", 119255, 40, 45);

        //2 instances of each of the leaf class part time hourly employee
        Address addPH1 = new Address(911, "Trin Way", "Paolo Alto", "CA", "93211");
        PartTimeHourly PH1 = new PartTimeHourly("Jun", "Kang", addPH1, "284625865", 119355, 25);
        Address addPH2 = new Address(213, "Rhine Rd", "Redwood", "CA", "94521");
        PartTimeHourly PH2 = new PartTimeHourly("Luo", "Jing", addPH2, "728746378", 119375, 20);

        //2 instances of each of the leaf class hourly paid contractor
        Address addCH1 = new Address(242, "Hnong Way", "Paolo Alto", "CA", "93321");
        Contractor CH1 = new Contractor("Jerry" ,"Han", addCH1, "738495234", 119385, 20);
        Address addCH2 = new Address(6543, "Capital Ave", "San Jose", "CA", "95221");
        Contractor CH2 = new Contractor("Kitty" ,"Jun", addCH2, "394723845", 119355, 20);

        //2 instances of each of the leaf class customer
        Address addCS1 = new Address(442, "Alexander Blvd", "Cupertino", "CA", "94221");
        Customer CS1 = new Customer("Jack", "Lee", addCS1, "937482923", 129050);
        Address addCS2 = new Address(423, "3th Ave", "Stanford", "CA", "91311");
        Customer CS2 = new Customer("Mickey", "Suhoo", addCS2, "658754339", 129477);

        /**Display output: call out methods introduce() and computePay() for each instance of leaf classes of Employee */

        System.out.println("Hierarchy Bussiness Management System \n");
        // Output of Executive 1
        ex1.introduce(false);
        System.out.printf("total pay each year: $%.2f\n", ex1.computePay());
        System.out.println();
        // Output of Executive 2
        ex2.introduce(false);
        System.out.printf("total pay each year: $%.2f\n", ex2.computePay());
        System.out.println();

        // Output of FullTimeSalaried 1
        FS1.introduce(false);
        System.out.printf("total pay for 2 weeks: $%.2fl\n", FS1.computePay(2));
        System.out.println();
        // Output of FullTimeSalaried 2
        FS2.introduce(true);
        System.out.printf("total pay for 1 week: $%.2f\n", FS1.computePay(1));
        System.out.println();

        // Output of FullTimeHourly 1
        FH1.introduce(true);
        System.out.printf("total pay each week: $%.2f\n", FH1.computePay(50));
        System.out.println();
        // Output of FullTimeHourly 2
        FH2.introduce(false);
        System.out.printf("total pay each week: $%.2f\n", FH2.computePay(40));
        System.out.println();

        // Output of PartTimeHourly 1
        PH1.introduce(true);
        System.out.printf("total pay each week: $%.2f\n", PH1.computePay(20));
        System.out.println();
        // Output of PartTimeHourly 1
        PH2.introduce(false);
        System.out.printf("total pay each week: $%.2f\n", PH2.computePay(45));
        System.out.println();

        // Output of Contractor 1
        CH1.introduce(false);
        System.out.printf("total pay each week: $%.2f\n", CH1.computePay(25));
        System.out.println();
        // Output of Contractor 1
        CH2.introduce(true);
        System.out.printf("total pay each week: $%.2f\n", CH2.computePay(25));
        System.out.println();

        /** call out methods introduce() and makePayment() for each customers */

        // Output of Customer 1
        CS1.introduce(false);
        CS1.makePayment();
        System.out.println();
        // Output of Customer 2
        CS2.introduce(true);    //The customer introduction will not display SSN even when flagg == true due to set up of Customer
        CS2.makePayment();
        System.out.println();


        System.out.println("Thank you for visiting!");
    }
}
