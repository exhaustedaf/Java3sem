import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;

    public LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void input() {
        String name;
        int grade;
        System.out.println("Введите имя и оценку студента или end, если больше добавлять никого не нужно:");
        Scanner in = new Scanner(System.in);
        name = in.next();
        while (!name.equals("end")) {
            grade = in.nextInt();
            labClass.addStudent(new Student(name, grade));
            System.out.println("Введите имя и оценку студента или end, если больше добавлять никого не нужно:");
            name = in.next();
        }
    }
}
