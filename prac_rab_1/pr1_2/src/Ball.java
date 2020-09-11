public class Ball {
    private String color;
    private int size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Ball() {
        size = 7;
        color = "red";
    }

    public Ball(int size) {
        this.size = size;
        color = "red";
    }

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Ball(String color) {
        this.color = color;
        size = 7;
    }

    public String toString() {
        return "The ball is " + this.getColor() +
                " and has size " + this.getSize();
    }
}
