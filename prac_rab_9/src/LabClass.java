import java.util.ArrayList;

public class LabClass {
    private ArrayList<Student> studentsList;
    Student reqStudent;

    public LabClass() {
        this.studentsList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        studentsList.sort(Student::compareTo);
    }

    public Student search(String studentsName) throws NoSuchStudentException {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getName().equals(studentsName)) {
                reqStudent = studentsList.get(i);
                return reqStudent;
            }
        }
        throw new NoSuchStudentException("Student " + studentsName + " was not found");
    }

    public Student remove() {
        return studentsList.remove(0);
    }

    public boolean isEmpty() {
        return studentsList.isEmpty();
    }
}
