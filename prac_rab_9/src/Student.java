public class Student implements Comparable<Student> {
    private final int grade;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getGrade(), o.getGrade());
    }
}