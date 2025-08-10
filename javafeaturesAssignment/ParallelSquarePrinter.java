package javafeaturesAssignment;

import java.util.*;
import java.util.stream.*;

class ParallelSquarePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("Squares using parallel stream:");
        nums.parallelStream()
            .forEach(x -> System.out.println(x * x));
    }
}
