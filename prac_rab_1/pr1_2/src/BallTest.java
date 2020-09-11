public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println(ball1);
        Ball ball2 = new Ball(6);
        System.out.println(ball2);
        Ball ball3 = new Ball("yellow", 8);
        System.out.println(ball3);
        Ball ball4 = new Ball("white");
        System.out.println(ball4);
    }
}
