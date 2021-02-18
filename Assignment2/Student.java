
/**
 * <h1> Student </h1>
 * <p>
 * The Student class represents a student's information including: first name, last name, age, gpa, major, department.
 * It includes an inner class - Course, which has a method to print out the student’s course schedule to command line.
 * 
 * @author Diem.Vu
 * @version 1.0
 * @since   2021-02-10
 */
public class Student {

    private String firstname;
    private String lastname;
    private int age;
    private double gpa;
    private String major;
    private String department;

    public Student() {
    }

    /**
     * Constructor includes all arguments
     * @param firstname
     * @param lastname
     * @param age
     * @param gpa
     * @param major
     * @param department
     */
    public Student(String firstname, String lastname, int age, double gpa, String major, String department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    class Course {
        /**
         * This method is used to print out the student’s course schedule to command line.
         */
        public void printSchedule() {
            // print CS151 Tue/Thur 6-7:15
            System.out.println("CS151 Tue/Thur 6-7:15\n"
                    + "Eng101 Mon/Wed 10-11:15\n"
                    + "Hist100 Tue/Thur 1:30-2:45");
        }
    }
}

