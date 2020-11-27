public class Client {
    Chair chair;

    public void sit() {
        System.out.println("You are sitting on " + Chair.class.getName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
