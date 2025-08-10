package javafeaturesAssignment;

import java.util.*;
import java.util.stream.*;

class EvenNumberCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("enter total numbers: ");
        int n = sc.nextInt();

        System.out.println("enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        List<Integer> evens = numbers.stream()
                                     .filter(num -> num % 2 == 0)
                                     .collect(Collectors.toList());

        System.out.println("Even numbers: " + evens);
    }
}
