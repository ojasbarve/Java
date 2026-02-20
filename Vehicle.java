abstract class Vehicle {
    abstract void fuelType();
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses Petrol");
    }
}

class Bike extends Vehicle {
    void fuelType() {
        System.out.println("Bike uses Petrol");
    }
}

public class Vehicle{
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.fuelType();

        v = new Bike();
        v.fuelType();
    }
}