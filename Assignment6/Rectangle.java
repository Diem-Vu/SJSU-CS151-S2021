/**
 * Class Rectangle
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */


public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    synchronized public double computeArea() {
        return width * length;
    }

    public String toString() {
        return super.toString() + " width " + width + ", length " + length + ".\n";
    }
}
