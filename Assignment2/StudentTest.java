

/** 
 * <h1>StudentTest</h1>
 * <p>
 * The class implement main() method to create one instance of class Student 
 * and exam the output of some functionalities of the class.
 *
 * @author Diem.Vu
 */
public class StudentTest extends Student {
    
    /**
     * <p>
     * The main() method creates an instance of Student
     * with the following information: 
     * John Smith, 20 year old, 3.6 GPA, Computer Science major,
     * School of Computer Science department.
     * 
     * @param args Unused
     */
    
    public static void main(String[] args) {
        //create an instance of Student
        //John Smith, 20 year old, 3.6 gpa, Computer Science major, School of Computer Science department.
        Student st = new Student();
        st.setFirstname("John");
        st.setLastname("Smith");
        st.setAge(20);
        st.setGpa(3.6);
        st.setMajor("Computer Science");
        st.setDepartment("School of Computer Science");
        Student.Course stc = st.new Course();
        System.out.println("Student: " + st.getFirstname());
        stc.printSchedule();
    }

}
