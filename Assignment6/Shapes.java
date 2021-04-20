import java.util.ArrayList;

/**
 * class Shapes
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */

public class Shapes {
    /**
     * a private ArrayList attribute that can contain shapes (any shape).
     */
    private ArrayList<Shape> shapeList;

    public Shapes() {
    }

    public Shapes(ArrayList<Shape> list) {
        this.shapeList = list;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void add(Shape e) {
        this.shapeList.add(e);
    }

    public void remove(Shape e) {
        this.shapeList.remove(e);
    }

    /**
     * compute()
     * in which you iterate through the members of shapeList
     * and make a call to compute the shape’s area
     * and print the result to command line output
     */

    synchronized public void compute() {
        for (Shape e : shapeList) {
            System.out.printf("Shape %s, area %5.2f\n", e.getShapeType(), e.computeArea());
        }
    }

    //* max() and min() methods to class Shapes.
    // * These methods will return the shape with biggest or the smallest area respectively.
    public void max() {
        Shape maxShape = new Shape();
        double maxArea = shapeList.get(0).computeArea();
        for (Shape s : shapeList) {
            if (s.computeArea() > maxArea) {
                maxArea = s.computeArea();
                maxShape = s;
            }
        }
        System.out.println("The shape with smallest area is: " + maxShape.toString() + " with the Max area " + maxArea);
    }

    public void min() {
        Shape minShape = new Shape();
        double minArea = shapeList.get(0).computeArea();
        for (Shape s : shapeList) {
            if (s.computeArea() < minArea) {
                minArea = s.computeArea();
                minShape = s;
            }
        }
        System.out.println("The shape with biggest area is: " + minShape.toString() + " with the Min area " + minArea);
    }
}
