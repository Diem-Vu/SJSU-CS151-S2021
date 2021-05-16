//Exercise 1:
//Remember the implementation of a business in homework 3?
//Please use your implementation of the Address and Person classes from that homework in this homework.
//Define and implement class ReflectionTest.
//This class should implement main() method.
//In the body of the main() method you should write Java code that uses only Java reflection libraries
//to perform the following:
//        1.Print out all methods declared in class Person (notice, declared methods only),
//        including the number of input parameters and all input parameter types.
//        2.Print out all methods available to class Address (notice, all methods),
//        including the number of input parameters and all input parameter types.
//        3.Print out all fields declared in class Address (notice, declared fields only),
//        including the access modifier and the type of the field.
//        4.Instantiate 3 new instances of class Person.
//        This should also involve instantiating the Addressclass using reflection.
//        5.Use Java reflection to invoke setFirstName(), setLastName() and setAge()
//        in one or more instance(s) of Person class.
//        To print out your output use System.out.println() or a similar method.
//        Save your program into a file named ReflectionTest.java.


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * class ReflectionTest
 * this class test java.lang.reflection* with class Person and class Address
 *
 * @author Diem.Vu
 * @version 1.0
 */

public class ReflectionTest {
    public static void main(String[] args) {

//        1.Print out all methods declared in class Person
        System.out.println("ALL METHODS DECLARED IN CLASS PERSON");
        Method[] PersonDeclaredMethods = Person.class.getDeclaredMethods();
        for (Method method : PersonDeclaredMethods) {
            String methodName = method.getName();
            @SuppressWarnings("rawtypes")
            Class[] parameters = method.getParameterTypes();
            if (parameters.length == 0) {
                System.out.println("\t" + methodName + "() has " + parameters.length + " parameters.");
            } else {
                System.out.println("\t" + methodName + "() has " + parameters.length + " parameter(s) of the following types:");
            }
            for (@SuppressWarnings("rawtypes") Class p : parameters) {
                System.out.println("\t\t" + p.getName());
            }
        }
        System.out.println();

//        2.Print out all methods available to class Address
        System.out.println("ALL METHODS DECLARED IN CLASS ADDRESS");
        Method[] AddressDeclaredMethods = Address.class.getDeclaredMethods();

        for (Method method : AddressDeclaredMethods) {
            String methodName = method.getName();
            @SuppressWarnings("rawtypes")
            Class[] parameters = method.getParameterTypes();
            if (parameters.length == 0) {
                System.out.println("\t" + methodName + "() has " + parameters.length + " parameters.");
            } else {
                System.out.println("\t" + methodName + "() has " + parameters.length + " parameter(s) of the following types:");
            }
            for (@SuppressWarnings("rawtypes") Class p : parameters) {
                System.out.println("\t\t" + p.getName());
            }
        }
        System.out.println();

//        3.Print out all fields declared in class Address
        System.out.println("ALL FIELDS DECLARED IN CLASS ADDRESS");
        Field[] AddressDeclareFields = Address.class.getDeclaredFields();
        for (Field field : AddressDeclareFields) {
            System.out.println("\t" + field.toString());
        }
        System.out.println();

//        4.Instantiate 3 new instances of class Person.
//        This should also involve instantiating the Address class using reflection.
        System.out.println("3 INSTANCES OF CLASS PERSON");
        try {
            Constructor<Address> addressConstructor1 = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);
            Address addInstance1 = addressConstructor1.newInstance(3723, "Andrew Str", "San Jose", "CA", "95123");
            Constructor<Person> personConstructor1 = Person.class.getConstructor(String.class, String.class, Address.class, String.class);
            Person personInstance1 = personConstructor1.newInstance("Cat", "London", addInstance1, "XXX - XXX - 8513");
            System.out.println(personInstance1.toString());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e);
        }

        try {
            Constructor<Address> addressConstructor2 = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);
            Address addInstance2 = addressConstructor2.newInstance(421, "Holly Str", "Campbell", "CA", "97124");
            Constructor<Person> personConstructor2 = Person.class.getConstructor(String.class, String.class, Address.class, String.class);
            Person personInstance2 = personConstructor2.newInstance("Christina", "Bell", addInstance2, "XXX - XXX - 7821");
            System.out.println(personInstance2.toString());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e);
        }
//        5.Use Java reflection to invoke setFirstName(), setLastName() and setAge()
//        in one or more instance(s) of Person class.
        try {
            Constructor<Address> addressConstructor3 = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);
            Address addInstance3 = addressConstructor3.newInstance(4243, "Anthena Str", "Los Gatos", "CA", "93142");
            @SuppressWarnings("deprecation")
            Person personInstance3 = Person.class.newInstance();
            personInstance3.setFirstname("Edo");
            personInstance3.setLastname("Mark");
            personInstance3.setAddress(addInstance3);
            personInstance3.setSSN("XXX - XXX - 9733");
            System.out.println(personInstance3.toString());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e);
        }


    }
}
