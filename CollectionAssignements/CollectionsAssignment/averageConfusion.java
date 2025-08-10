package CollectionsAssignment;

import java.util.*;

class AverageConfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter numbers ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 10) {
                numbers[i] = numbers[i] * 2;
            }
            sum += numbers[i];
        }

        double average = sum / (double) n;
        System.out.println("Average: " + average);
    }
}
