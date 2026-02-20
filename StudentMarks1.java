class Student {
    int marks;

    Student(int m) {
        marks = m;
    }
}

public class StudentMarks1 {

    static void modify(int num, Student s) {
        num = num + 10;        // primitive change
        s.marks = s.marks + 10; // object change
        System.out.println("Inside method:");
        System.out.println("Primitive = " + num);
        System.out.println("Object marks = " + s.marks);
    }

    public static void main(String[] args) {
        int x = 50;
        Student st = new Student(50);

        modify(x, st);

        System.out.println("\nOutside method:");
        System.out.println("Primitive = " + x);
        System.out.println("Object marks = " + st.marks);
    }
}