public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Pes", 3);
        System.out.println(dog1);
        Dog dog2 = new Dog("Barbos");
        System.out.println(dog2);
        Dog dog3 = new Dog();
        System.out.println(dog3);
        Dog dog4 = new Dog(7);
        System.out.println(dog4);
    }
}
