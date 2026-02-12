public class DiviionCheck {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }
}
