import java.util.Comparator;

public class Student implements Comparator<Student> {
    protected final Integer GPA;
    protected final String name;

    public Integer getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    protected final Integer age;

    public Student(Integer GPA, String name, int age) {
        this.GPA = GPA;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.GPA.compareTo(o2.GPA);
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
