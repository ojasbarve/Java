class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object created " + count);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("New counter value: " + Counter.count);
    }
}