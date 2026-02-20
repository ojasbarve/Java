public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] s = {
            new Circle(),
            new Rectangle(),
            new Triangle()
        };

        for (Shape sh : s)
            sh.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle"); }
}

class Triangle extends Shape {
    void draw() { System.out.println("Drawing Triangle"); }
}