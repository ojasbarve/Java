class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String n, double s, double b) {
        super(n, s);
        bonus = b;
    }

    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Manager m = new Manager("Ojas", 50000, 10000);
        System.out.println("Final Salary = " + m.calculateSalary());
    }
}