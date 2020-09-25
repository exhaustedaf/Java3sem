public class Square extends Rectangle {
    public Square() {
        super(4.4, 4.4, "blue", true);
    }

    public Square(double side) {
        super(side, side, "blue", true);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return "Shape: square, color: " + this.color + ", filled: " + this.filled;
    }
}
