public class FloatAddition {

    static double add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        float a = 5.5f;
        float b = 4.5f;

        double result = add(a, b);
        System.out.println("Addition result: " + result);
    }
}
