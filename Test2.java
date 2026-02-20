class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
}

class HOD extends Teacher {
    String dept;

    HOD(String name, String subject, String dept) {
        super(name, subject);
        this.dept = dept;
    }

    void show() {
        System.out.println(name + " | " + subject + " | " + dept);
    }
}

public class Test2 {
    public static void main(String[] args) {
        HOD h = new HOD("Dr Rao", "Java", "CSE");
        h.show();
    }
}