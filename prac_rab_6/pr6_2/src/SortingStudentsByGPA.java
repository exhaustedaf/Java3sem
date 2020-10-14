import java.util.Comparator;

public class SortingStudentsByGPA extends Student implements Comparator<Student> {
    public SortingStudentsByGPA(Integer GPA, String name, int age) {
        super(GPA, name, age);
    }

    public static void quickSort(Student[] students, int low, int high) {
        if (students.length == 0)
            return;
        int i = low, j = high;
        Student middle = students[(low + high) / 2];

        do {
            while (students[i].compare(students[i], middle) < 0)
                i++;
            while(students[i].compare(students[j], middle) > 0)
                j--;

            if (i <= j) {
                if (i < j) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (i < high) {
            quickSort(students, i, high);
        }
        if (low < j) {
            quickSort(students, low, j);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        String[] names = new String[] {"Ivan Smirnov", "Nikolay Ivanov",
                "Sergey Vorobiov", "Alexander Blok",
                "Alexander Pushkin", "Maxim Gorkiy",
                "Lev Tolstoy", "Mihail Lermontov",
                "Fedor Dostoevskiy", "Anton Chehov"};
        for (int i = 0; i < 10; i++) {
            Student student = new Student((int) (Math.random() * 100), names[i], i + (int) (Math.random() * 10) + 16);
            students[i] = student;
        }
        System.out.println("Первоначальный массив students[]: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
        }
        quickSort(students, 0, students.length - 1);
        System.out.println("");
        System.out.println("Результат: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
        }
    }
}
