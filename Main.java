// File: Student.java
class Student {
    // Instance variables
    private String name;
    private int rollNumber;
    private double marks;
    
    // Parameterized method to set student details
    public void setDetails(String studentName, int roll, double studentMarks) {
        this.name = studentName;
        this.rollNumber = roll;
        this.marks = studentMarks;
    }
    
    // Parameterized method to display student info
    public void displayInfo(String prefix) {
        System.out.println(prefix + " Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
    
    // Parameterized method to calculate grade
    public String calculateGrade(double passingMarks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= passingMarks) return "C";
        else return "F";
    }
}

// File: Employee.java
class Employee {
    // Instance variables
    private String empName;
    private int empId;
    private double salary;
    
    // Parameterized method to set employee details
    public void setEmployeeData(String name, int id, double sal) {
        this.empName = name;
        this.empId = id;
        this.salary = sal;
    }
    
    // Parameterized method to calculate bonus
    public double calculateBonus(double bonusPercentage) {
        return salary * (bonusPercentage / 100);
    }
    
    // Parameterized method to display employee info
    public void showDetails(boolean showSalary) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        if (showSalary) {
            System.out.println("Salary: $" + salary);
        }
        System.out.println();
    }
}

// File: Product.java
class Product {
    // Instance variables
    private String productName;
    private int productId;
    private double price;
    private int stock;
    
    // Parameterized method to set product details
    public void initializeProduct(String name, int id, double priceValue, int stockCount) {
        this.productName = name;
        this.productId = id;
        this.price = priceValue;
        this.stock = stockCount;
    }
    
    // Parameterized method to apply discount
    public double applyDiscount(double discountPercent) {
        return price - (price * discountPercent / 100);
    }
    
    // Parameterized method to update stock
    public void updateStock(int quantity, String operation) {
        if (operation.equals("add")) {
            stock += quantity;
            System.out.println("Added " + quantity + " units. New stock: " + stock);
        } else if (operation.equals("remove")) {
            if (stock >= quantity) {
                stock -= quantity;
                System.out.println("Removed " + quantity + " units. New stock: " + stock);
            } else {
                System.out.println("Insufficient stock!");
            }
        }
    }
    
    // Parameterized method to display product info
    public void displayProduct(String displayType) {
        System.out.println("=== Product Information ===");
        System.out.println("Name: " + productName);
        System.out.println("ID: " + productId);
        
        if (displayType.equals("detailed")) {
            System.out.println("Price: $" + price);
            System.out.println("Stock: " + stock + " units");
        }
        System.out.println();
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java Parameterized Methods Demo ===\n");
        
        // Creating 3 objects of different classes
        Student student1 = new Student();
        Employee employee1 = new Employee();
        Product product1 = new Product();
        
        // Using command-line arguments if provided, otherwise use predefined values
        if (args.length >= 3) {
            System.out.println("Using command-line arguments...\n");
            
            // Object 1: Student - accessing variables through parameterized methods
            student1.setDetails(args[0], Integer.parseInt(args[1]), Double.parseDouble(args[2]));
            student1.displayInfo("Object 1");
            String grade = student1.calculateGrade(60.0);
            System.out.println("Grade: " + grade + "\n");
            
        } else {
            System.out.println("No command-line arguments. Using predefined values...\n");
            
            // Object 1: Student - accessing variables through parameterized methods
            student1.setDetails("Alice Johnson", 101, 85.5);
            student1.displayInfo("Object 1");
            String grade = student1.calculateGrade(60.0);
            System.out.println("Grade: " + grade + "\n");
        }
        
        // Object 2: Employee - accessing variables through parameterized methods
        employee1.setEmployeeData("Bob Smith", 5001, 75000.0);
        employee1.showDetails(true);
        double bonus = employee1.calculateBonus(10.0);
        System.out.println("Bonus (10%): $" + bonus + "\n");
        
        // Object 3: Product - accessing variables through parameterized methods
        product1.initializeProduct("Laptop", 2001, 1200.0, 50);
        product1.displayProduct("detailed");
        double discountedPrice = product1.applyDiscount(15.0);
        System.out.println("Discounted Price (15% off): $" + discountedPrice);
        product1.updateStock(10, "remove");
        product1.updateStock(5, "add");
        
        System.out.println("\n=== Program Completed ===");
    }
}