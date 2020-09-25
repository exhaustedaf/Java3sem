public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "center: " + this.center + ", radius: " + this.radius;
    }

    public void moveUp() {
        this.center.y -= this.center.ySpeed;
    }

    public void moveDown() {
        this.center.y += this.center.ySpeed;
    }

    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }

    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }
}