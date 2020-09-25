public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super("blue", true);
        this.width = 2.3;
        this.length = 3.4;
    }

    public Rectangle(double width, double length) {
        super("black", true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
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

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Shape: rectangle, width: " + this.width +
                ", length: " + this.length + ", color: " +
                this.color + ", filled: " + this.filled;
    }
}
