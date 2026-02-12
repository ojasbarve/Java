import java.util.Scanner;

abstract class Power {
    abstract void calculate_energy();
}

class Consumption extends Power {

    double pwr, time;

    Consumption(double pwr, double time) {
        this.pwr = pwr;
        this.time = time;
    }

    void calculate_energy() {
        double energy = pwr * time;
        System.out.println("The energy consumption is " + energy);
    }
} 

public class abstract_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter power");
        double pwr = sc.nextDouble();

        System.out.println("enter time");
        double time = sc.nextDouble();

        Power p = new Consumption(pwr, time);
        p.calculate_energy();

        sc.close();
    }
}