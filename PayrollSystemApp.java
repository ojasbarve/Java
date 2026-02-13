import java.util.*;

class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double calculatedSalary;

    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary() {
        switch (role.toLowerCase()) {
            case "manager":
                calculatedSalary = baseSalary + baseSalary * 0.20;
                break;
            case "developer":
                calculatedSalary = baseSalary + baseSalary * 0.10;
                break;
            case "designer":
                calculatedSalary = baseSalary + baseSalary * 0.05;
                break;
            case "intern":
                calculatedSalary = 1000;
                break;
            default:
                calculatedSalary = baseSalary;
        }
    }

    public void applyDeduction(double amount) {
        calculatedSalary -= amount;
        if (calculatedSalary < 0) calculatedSalary = 0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + calculatedSalary);
        System.out.println();
    }
}

class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findEmployeeById(String id) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(id))
                return e;
        }
        return null;
    }

    public void calculateAllSalaries() {
        for (Employee e : employees) {
            e.calculateSalary();
            e.displayEmployeeDetails();
        }
    }
}

public class PayrollSystemApp {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        payroll.addEmployee(new Employee("E101", "Alice", "Manager", 5000));
        payroll.addEmployee(new Employee("E102", "Bob", "Developer", 4000));
        payroll.addEmployee(new Employee("E103", "Charlie", "Designer", 3500));
        payroll.addEmployee(new Employee("E104", "David", "Intern", 2000));

        payroll.calculateAllSalaries();

        Employee emp = payroll.findEmployeeById("E102");
        if (emp != null) {
            emp.applyDeduction(300);
            emp.displayEmployeeDetails();
        }
    }
}
