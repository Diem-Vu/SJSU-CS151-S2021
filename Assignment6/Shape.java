public class Shape {
    private String shapeType;

    public Shape() {
    }

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    synchronized public double computeArea() {
        return 0;
    }

    public String toString() {
        return shapeType;
    }
}
