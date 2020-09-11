public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(150.0,150.0);
        System.out.println(b1);
        b1.move(30.0, 15.0);
        System.out.println(b1);
    }
}
