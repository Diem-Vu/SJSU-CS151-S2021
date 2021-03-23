/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package assignment5;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Class Student.
 * <p>
 * java.util.Collections.sort
 * java.util.Collections.reverse
 * java.util.Comparator
 * java.util.HashMap
 * java.util.LinkedList
 * 
 * Attributes:
 * private String firstName
 * private String lastName
 * private int age
 * private double gpa
 * private String major
 * private String department
 * 
 * Constructor:
 * public Student(String firstName, String lastName, int age, double gpa, String major, String department, LinkedList courses)
 * 
 * Methods:
 * void     printInfo()
 * void     addCourse(Course s)
 * void     removeCourse(Course s)
 * void     sortCourses(String attribute, boolean ascending)
 * 
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    //Courses should be a linked list of Course variables. 
    LinkedList <Course> courses = new LinkedList<>();

    public Student(String firstName, String lastName, int age, double gpa, String major, String department, LinkedList courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
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

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String Department) {
        this.department = Department;
    }

    public LinkedList<Course> getCourses(){
        return (LinkedList<Course>) courses;
    }

    public void setCourse(LinkedList<Course> courses) {
        this.courses = courses;
    }
    
    public void printInfo(){
        System.out.println("Student " + firstName + " " + lastName 
                + " is " + age + " years old. His GPA is " 
                + gpa + ". He is in " + major + " major of department " 
                + department + ".\n He is taking courses: \n" 
                + courses.toString()
        );
    }
    
    //addCourse() to add a new course, 
    public void addCourse(Course s){
        courses.addLast(s);
    }
    
    //removeCourse() to remove a course from this student, 
    public void removeCourse(Course s){
        courses.remove(s);
    }
    
    //sortCourses() to print out a sorted list of courses.
    public void sortCourses(String attribute, boolean ascending){
        
        //comparator based on courseName;
        Comparator <Course> nameCompare = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2){
                return c1.getCourseName().compareTo(c2.getCourseName());
            }
        };
        
        //comparator based on courseDescription;
        Comparator <Course> descripCompare = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2){
                return c1.getCourseDescription().compareTo(c2.getCourseDescription());
            }
        };
        //comparator based on courseDepartment;
        Comparator <Course> departmtCompare = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2){
                return c1.getCourseDepartment().compareTo(c2.getCourseDepartment());
            }
        };
        //comparator based on startTime;
        Comparator <Course> timeCompare = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2){
                return c1.getStartTime().compareTo(c2.getStartTime());
            }
        };
        //create a table of days
        HashMap <String, Integer> days = new HashMap<>();
        days.put("Sunday", 1);
        days.put("Monday", 2);
        days.put("Tuesday", 3);
        days.put("Wednesday", 4);
        days.put("Thursday", 5);
        days.put("Friday", 6);
        days.put("Sartuday", 7);
        
        //comparator based on weekdayHold;
        Comparator <Course> dayCompare = new Comparator<Course>(){
            @Override
            public int compare(Course c1, Course c2){
                return days.get(c1.getWeekdayHold()) - days.get(c2.getWeekdayHold());
            }
        };
        
        //compare by attribute
        if (ascending == true){
            if(null != attribute)switch (attribute) {
                case "name":
                    Collections.sort(courses, nameCompare);
                    break;
                case "time":
                    Collections.sort(courses, timeCompare);
                    break;
                case "department":
                    Collections.sort(courses, departmtCompare);
                    break;
                case "day":
                    Collections.sort(courses, dayCompare);
                    break;
                default:
                    break;
            }
        }else{
            Collections.reverse(courses);
        }
        //print out the sorted List
        for(Course c: courses){
            System.out.println(c.toString());
        }
  
        
    }
}
