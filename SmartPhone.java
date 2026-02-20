interface Callable {
    void call();
}

interface Camera {
    void click();
}

class SmartPhone implements Callable, Camera {
    public void call() {
        System.out.println("Calling...");
    }

    public void click() {
        System.out.println("Photo taken");
    }
}

public class SmartPhone {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.click();
    }
}