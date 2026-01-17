public class NumberOperations {

    public static void main(String[] args) {

        int a = 10;
        int b = 7;

        int sum = a + b;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Sum: " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is Even");
        } else {
            System.out.println("The sum is Odd");
        }
    }
}
