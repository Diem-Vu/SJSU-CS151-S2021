import java.util.ArrayList;

/**
 * class ShapeTest
 * <p>
 * Instance of ShapeTest.java: Shapes
 * Shapes shapes = new Shapes(shapeList);
 * <p>
 * The Shapes elements: 2 instances of each Shape Class (including Circle, Triangle, Rectangle, Hexagon)
 * <p>
 * The class make a call to compute() method in class Shapes in multiple threads.
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */


public class ShapeTest {
    public static void main(String[] args) {

        // instantiate an object of Shapes
        ArrayList<Shape> shapeList = new ArrayList<>();
        Shapes shapes = new Shapes(shapeList);

        // instantiate at least 2 objects of each shape type (at least 8 shapes) and add to Shapes.
        Shape s1 = new Circle(20);
        Shape s2 = new Circle(30);
        Shape s3 = new Triangle(5, 5, 5);
        Shape s4 = new Triangle(3, 4, 5);
        Shape s5 = new Rectangle(15, 10);
        Shape s6 = new Rectangle(20, 10);
        Shape s7 = new Hexagon(15);
        Shape s8 = new Hexagon(10);

        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s4);
        shapeList.add(s5);
        shapeList.add(s6);
        shapeList.add(s7);
        shapeList.add(s8);

        //create multiple threads and execute them the call method compute() of class Shapes
        Thread thread1 = new Thread() {
            public void run() {
                try {
                    System.out.println("thread: " + Thread.currentThread().getId() + " starts");
                    shapes.compute();
                    System.out.println("thread: " + Thread.currentThread().getId() + " ends");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                try {
                    System.out.println("thread: " + Thread.currentThread().getId() + " starts");
                    shapes.compute();
                    System.out.println("thread: " + Thread.currentThread().getId() + " ends");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        thread1.start();
        thread2.start();

        // call max() min() to find the biggest and smallest area value.
        shapes.max();
        shapes.min();

    }
}
