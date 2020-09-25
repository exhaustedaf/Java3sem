public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "topLeft: " + this.topLeft + ", bottomRight: " + this.bottomRight;
    }

    public boolean speedIsEqual() {
        if (this.topLeft.xSpeed == this.bottomRight.xSpeed &&
                this.topLeft.ySpeed == this.bottomRight.ySpeed)
            return true;
        else
            return false;
    }

    public void moveUp() {
        if (speedIsEqual()) {
            this.topLeft.y -= this.topLeft.ySpeed;
            this.bottomRight.y -= this.topLeft.ySpeed;
        }
    }

    public void moveDown() {
        if (speedIsEqual()) {
            this.topLeft.y += this.topLeft.ySpeed;
            this.bottomRight.y += this.topLeft.ySpeed;
        }
    }

    public void moveLeft() {
        if (speedIsEqual()) {
            this.topLeft.x -= this.topLeft.xSpeed;
            this.bottomRight.x -= this.topLeft.xSpeed;
        }
    }

    public void moveRight() {
        if (speedIsEqual()) {
            this.topLeft.x += this.topLeft.xSpeed;
            this.bottomRight.x += this.topLeft.xSpeed;
        }
    }
}