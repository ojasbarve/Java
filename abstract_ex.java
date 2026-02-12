import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract void calculateArea();
}

// Concrete class
class Rectangle extends Shape {
    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implementing abstract method
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class abstract_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Shape s = new Rectangle(l, b); // abstraction
        s.calculateArea();

        sc.close();
    }
}