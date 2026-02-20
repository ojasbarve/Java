class Bank {
    final double RATE = 7.5;

    final void displayRate() {
        System.out.println("Rate = " + RATE);
    }
}

class SBI extends Bank {
}

public class BankDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.displayRate();
    }
}