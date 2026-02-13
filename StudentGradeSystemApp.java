import java.util.*;

class Student {
    private String name;
    private List<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades)
            sum += g;
        return sum / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}

class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name))
                return s;
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student s : students)
            s.displayStudentDetails();
    }
}

public class StudentGradeSystemApp {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        Student s1 = new Student("Alice");
        s1.addGrade(85);
        s1.addGrade(90);

        Student s2 = new Student("Bob");
        s2.addGrade(70);
        s2.addGrade(80);

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.displayAllStudents();

        Student found = manager.findStudentByName("Alice");
        if (found != null)
            found.displayStudentDetails();
    }
}
