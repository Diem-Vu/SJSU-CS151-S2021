
//package assignment5;

/**
 * Class ListManipulator
 * <p>
 * Attributes:
 * private String courseName
 * private String courseDescription
 * private String courseDepartment
 * private String startTime
 * private String weekdayHold
 * 
 * Constructor:
 * public Course(String courseName, String courseDescription, String courseDepartment, String startTime, String weekdayHold)
 * 
 * Methods:
 * String toString
 * 
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */
public class Course {
    private String courseName;
    private String courseDescription;
    private String courseDepartment;
    private String startTime;
    private String weekdayHold;

    public Course(String courseName, String courseDescription, String courseDepartment, String startTime, String weekdayHold) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDepartment = courseDepartment;
        this.startTime = startTime;
        this.weekdayHold = weekdayHold;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getWeekdayHold() {
        return weekdayHold;
    }

    public void setWeekdayHold(String weekdayHold) {
        this.weekdayHold = weekdayHold;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", " + courseDescription + ", " + courseDepartment 
                + ", from " + startTime + ", on each " + weekdayHold + ";\n";
    }
    
}
