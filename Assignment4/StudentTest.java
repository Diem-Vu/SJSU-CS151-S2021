

/**
 * class StudentTest.
 * <p>
 * This class implements main() method.
 *
 * @author Diem.Vu
 */
public class StudentTest {
    public static void main(String[]args){
        //Create a course instance
        Course course = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        // create a student instance
        Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science", course);
        Student student2 = null;
        try{
            student2 = (Student) student1.clone();
        }
        catch(CloneNotSupportedException e)
        {
                e.printStackTrace();
        }

        student2.setFirstName("Tom");
        student1.printInfo();
        student2.printInfo();
    }
}
