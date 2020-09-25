public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super("green", false);
        this.radius = 2;
    }

    public Circle(double radius) {
        super("green", false);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " +
                this.color + ", filled: " + this.filled;
    }
}
