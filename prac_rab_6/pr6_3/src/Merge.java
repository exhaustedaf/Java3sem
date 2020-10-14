public class Merge {
    public static Student[] mergeSort(Student[] students1, Student[] students2){
        Student[] students3 = new Student[students1.length + students2.length];
        int i = 0, j = 0;

        for (int k = 0; k < students3.length; k++) {

            if (i > students1.length - 1) {
                Student student = students2[j];
                students3[k] = student;
                j++;
            }
            else if (j > students2.length - 1) {
                Student student = students1[i];
                students3[k] = student;
                i++;
            }
            else if (students1[i].compareTo(students2[j]) < 0) {
                Student student = students1[i];
                students3[k] = student;
                i++;
            }
            else {
                Student student = students2[j];
                students3[k] = student;
                j++;
            }
        }
        return students3;
    }

    public static void main(String[] args) {
        Student[] students1 = new Student[10];
        Student[] students2 = new Student[10];
        String[] names1 = new String[] {"Ivan Smirnov", "Nikolay Ivanov",
                "Sergey Vorobiov", "Alexander Blok",
                "Alexander Pushkin", "Maxim Gorkiy",
                "Lev Tolstoy", "Mihail Lermontov",
                "Fedor Dostoevskiy", "Anton Chehov"};
        String[] names2 = new String[] {"Vasiliy Zhukovskiy", "Alexander Griboedov",
                                        "Ivan Krilov", "Nikolay Karamzin",
                                        "Ivan Turgenev", "Nikolay Gogol",
                                        "Ivan Goncharov", "Afanasiy Fet",
                                        "Marina Cvetaeva", "Boris Pasternak"};

        for (int i = 0; i < 10; i++) {
            Student student1 = new Student(10 - i, names1[i], i + (int) (Math.random() * 10) + 16);
            Student student2 = new Student(20 - i, names2[i], i + (int) (Math.random() * 10) + 16);
            students1[i] = student1;
            students2[i] = student2;
        }
        System.out.println("Первоначальный массив students1[]: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(students1[i]);
        }
        System.out.println("Первоначальный массив students2[]: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(students2[i]);
        }
        Student[] students3 = mergeSort(students1, students2);
        System.out.println("");
        System.out.println("Результат: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(students3[i]);
        }
    }
}
