package SolidProperties;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Motor extends Vehicle {
    @Override
    void start() {
        System.out.println("Car1 started");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}

public class liskovsubstitutionprinciple {
    public static void main(String[] args) {
        Vehicle car = new Motor();   
        Vehicle bike = new Bike(); 

        car.start();
        bike.start();
    }
}
