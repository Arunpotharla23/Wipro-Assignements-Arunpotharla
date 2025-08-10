package javafeaturesAssignment;

import java.util.*;

class SafeDivider {
    public static Optional<Double> divide(double num1, double num2) {
        if (num2 == 0) {
            return Optional.empty();
        } else {
            return Optional.of(num1 / num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Optional<Double> result = divide(num1, num2);

        if (result.isPresent()) {
            System.out.println("Result: " + result.get());
        } else {
            System.out.println("Not Allowed");
        }
    }
}
