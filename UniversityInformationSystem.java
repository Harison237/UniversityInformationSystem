import java.util.Scanner;

public class UniversityInformationSystem {
    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nUniversity Information System");
            System.out.println("1. Add Department");
            System.out.println("2. Add Professor");
            System.out.println("3. Add Student");
            System.out.println("4. List Department Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    System.out.print("Enter department name: ");
                    String departmentName = scanner.nextLine();
                    Department department = new Department(departmentName);
                    university.addDepartment(department);
                    System.out.println("Department added successfully!");
                    break;
                case 2:
                    System.out.print("Enter department name: ");
                    departmentName = scanner.nextLine();
                    Department foundDepartment = university.getDepartment(departmentName);
                    if (foundDepartment != null) {
                        System.out.print("Enter professor name: ");
                        String professorName = scanner.nextLine();
                        Professor professor = new Professor(professorName);
                        foundDepartment.addProfessor(professor);
                        System.out.println("Professor added successfully!");
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter department name: ");
                    departmentName = scanner.nextLine();
                    foundDepartment = university.getDepartment(departmentName);
                    if (foundDepartment != null) {
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine();
                        Student student = new Student(studentName);
                        foundDepartment.addStudent(student);
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter department name: ");
                    departmentName = scanner.nextLine();
                    foundDepartment = university.getDepartment(departmentName);
                    if (foundDepartment != null) {
                        foundDepartment.listDetails();
                    } else {
                        System.out.println("Department not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}