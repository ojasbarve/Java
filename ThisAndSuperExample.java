class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student123 extends Person {
    int rollNo;

    Student123(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNo);
    }
}

public class ThisAndSuperExample {
    public static void main(String[] args) {
        Student123 s = new Student123("Ojas", 20, 101);
        s.display();
    }
}
