public class TestStudent {
    private static void insertionSort(Student[] students) {
        for (int left = 0; left < students.length; left++) {
            Student key = students[left];
            int i = left - 1;
            while (i >= 0 && students[i].compareTo(key) > 0) {
                students[i + 1] = students[i];
                i--;
            }
            students[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber = new Student[10];
        String[] names = new String[] {"Ivan Smirnov", "Nikolay Ivanov",
                                        "Sergey Vorobiov", "Alexander Blok",
                                        "Alexander Pushkin", "Maxim Gorkiy",
                                        "Lev Tolstoy", "Mihail Lermontov",
                                        "Fedor Dostoevskiy", "Anton Chehov"};
        for (int i = 0; i < 10; i++) {
            Student student = new Student(10 - i, names[i], i + (int) (Math.random() * 10) + 16);
            iDNumber[i] = student;
        }
        System.out.println("Первоначальный массив iDNumber[]: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(iDNumber[i]);
        }
        insertionSort(iDNumber);
        System.out.println("");
        System.out.println("Результат: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}
