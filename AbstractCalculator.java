abstract class CalcBase {
    abstract void operation(double x, double y);
}

class AddOperation extends CalcBase {
    void operation(double x, double y) {
        System.out.println("Sum = " + (x + y));
    }
}

class SubOperation extends CalcBase {
    void operation(double x, double y) {
        System.out.println("Difference = " + (x - y));
    }
}

public class AbstractCalculator {
    public static void main(String[] args) {
        CalcBase add = new AddOperation();
        CalcBase sub = new SubOperation();

        add.operation(10, 5);
        sub.operation(10, 5);
    }
}
