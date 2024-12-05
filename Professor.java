import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private List<Student> students;

    public Professor(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }
}
