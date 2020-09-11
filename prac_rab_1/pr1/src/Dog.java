public class Dog {
    private String name;
    private int age;

    public Dog(int age) {
        this.age = age;
        name = "Sharik";
    }

    public Dog(String name) {
        this.name = name;
        age = 5;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        name = "Sharik";
        age = 5;
    }

    public String toString() {
        return "The dog is " + this.getName() +
                " ," + this.getAge() + " years old";
    }
}
