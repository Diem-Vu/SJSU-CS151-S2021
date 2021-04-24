/**
 * Implement a generic method called count()
 * to count the number of elements in a list of generic elements.
 * Inside the main() method create an ArrayList of
 * 5 String objects, 6 Integer objects, and 8 Double objects.
 * Make three different calls to the count() method,
 * once for each of the three lists, and print the result to command line.
 * Save your program in a file called MethodTest.java. */
/**
 * class MethodTest
 * @author Diem.Vu
 * @since 04.11.2021
 * @version 1.0
 *
 * Assignment 7: Generic
 * */
import java.util.List;
import java.util.ArrayList;

public class MethodTest{
    public static <E> int count(List<E> list){
        List <E> thislist = list;
        int count = 0;
        for (E element: thislist){
            count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        List <String> stringList = new ArrayList<>();
        stringList.add("string 1");
        stringList.add("string 2");
        stringList.add("string 3");
        stringList.add("string 4");
        stringList.add("string 5");
        System.out.println("the number of elements in the String list: " + count(stringList));

        List <Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        System.out.println("the number of elements in the Integer list: " + count(intList));

        List <Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(4.0);
        doubleList.add(5.0);
        doubleList.add(6.0);
        doubleList.add(7.0);
        doubleList.add(8.0);
        System.out.println("the number of elements in the Double list: " + count(doubleList));
    }
}
