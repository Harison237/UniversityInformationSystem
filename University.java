import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Department> departments;

    public University() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void listDepartments() {
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public Department getDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }
}
