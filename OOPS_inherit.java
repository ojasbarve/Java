import java.util.*;

class Shape {
    public void area() {
        System.out.println("Area not defined");
    }
}

class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("Triangle area: " + (0.5 * l * b));
    }
}

class Equilateral extends Triangle {
    public void area(int side) {
        System.out.println("Equilateral triangle area: " + (0.433 * side * side));
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Circle area: " + (3.14 * r * r));
    }
}

public class OOPS_inherit {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.area(10, 5);

        Equilateral e1 = new Equilateral();
        e1.area(6);

        Circle c1 = new Circle();
        c1.area(7);
    }
}