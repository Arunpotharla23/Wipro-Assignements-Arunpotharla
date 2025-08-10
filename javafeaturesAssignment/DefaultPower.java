package javafeaturesAssignment;

interface Device {
    void turnOn();

    default void showStatus() {
        System.out.println("Device is ON");
    }
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan started");
    }
}

class DefaultPowerTest {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.showStatus();
    }
}
