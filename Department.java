import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listDetails() {
        System.out.println("Department: " + name);
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public String getName() {
        return name;
    }
}
