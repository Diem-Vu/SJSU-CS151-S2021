//package assignment5;

/**
 * class Hexagon
 * <p>
 * Attributes:
 * private double side;
 * </p>
 * <p>
 * Methods:
 * Hexagon(double side),
 * double getSide(),
 * void setSide(),
 * double computeArea(),
 * String toString().
 * </p>
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */
public class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        super("Hexagon");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    synchronized public double computeArea() {
        return (3 * Math.cbrt(3) / 2) * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " side " + side + "\n";
    }
}
