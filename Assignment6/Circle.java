/**
 * class Circle
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    synchronized public double computeArea() {
        return radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + " radius " + radius + ".\n";
    }

}
