/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * class PersonTest.
 * <p>
 * java.util.ArrayList<Person>
 * java.util.Collections.sort
 * java.util.Comparator<Person>
 * This class implements main() method. 
 * 
 * Instance of Person.java:
 * create an array list of persons with the following 
 * Person instances: 
 * ArrayList <Person> list = new ArrayList<>()
 * 
 * The list elements:
 * Joe Smith, 40 
 * Amy Gold, 32 
 * Tony Stork, 21 
 * Sean Irish, 24 
 * Tina Brock, 28 
 * Lenny Hep, 18 
 * 
 * Comparators:
 * Comparator <Person> ageCompare = new Comparator<Person>()
 * Comparator <Person> firstNameCompare = new Comparator<Person>()
 * Comparator <Person> lastNameCompare = new Comparator<Person>()
 * 
 * The class create an ArrayList of Person objects, then sort it by age, first name, last name in ascending and descending order.
 * 
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */
public class PersonTest {
    public static void main(String[]args){
        ArrayList <Person> list = new ArrayList<>();
        
        Person p1 = new Person("Joe", "Smith", 40);
        Person p2 = new Person("Amy", "Gold", 32);
        Person p3 = new Person("Tony", "Stork", 21);
        Person p4 = new Person("Sean", "Irish", 24);
        Person p5 = new Person("Tina", "Brock", 28);
        Person p6 = new Person("Lenny", "Hep", 18);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        
        /** Compare AGE */
        Comparator <Person> ageCompare = new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.getAge() - p2.getAge();
            }
        };
  
        System.out.println("The sorted list of persons based on their age, ascending");
        Collections.sort(list, ageCompare);
        //print out the List following ASCENDING AGE ORDER
        for(Person p: list){
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
        }
        
        System.out.println("The sorted list of persons based on their age, decending");
        Collections.reverse(list);
        //print out the List following DECENDING AGE ORDER
        for(Person p: list){
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
        }
        
        
        /** Compare FIRST NAME */
        Comparator <Person> firstNameCompare = new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        };
        
        System.out.println("The sorted list of persons based on their first name, ascending");
        Collections.sort(list, firstNameCompare);
        //print out the List following ASCENDING FIRST NAME ORDER
        for(Person p: list){
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
        }
        
        System.out.println("The sorted list of persons based on their first name, decending");
        Collections.reverse(list);
        //print out the List following DECENDING FIRST NAME ORDER
        for(Person p: list){
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
        }
        
        
        /** Compare LAST NAME */
        Comparator <Person> lastNameCompare = new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.getLastName().compareTo(p2.getLastName());
            }
        };
        
        System.out.println("The sorted list of persons based on their first name, ascending");
        Collections.sort(list, lastNameCompare);
        //print out the List following ASCENDING LAST NAME ORDER
        for(Person p: list){
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
        }
        
        System.out.println("The sorted list of persons based on their first name, decending");
        Collections.reverse(list);
        //print out the List following DECENDING LAST NAME ORDER
        for(Person p: list){
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
        }
        
    }
}
