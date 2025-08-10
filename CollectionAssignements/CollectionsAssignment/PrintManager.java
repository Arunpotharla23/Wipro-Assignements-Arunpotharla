package CollectionsAssignment;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class PrintManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayBlockingQueue<String> q = new ArrayBlockingQueue<>(3);

        System.out.print("How many jobs? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " job names:");
        for (int i = 0; i < n; i++) {
            String job = sc.nextLine();
            if (!q.offer(job)) {
                System.out.println("Queue full. Skipped: " + job);
            }
        }

        while (!q.isEmpty()) {
            System.out.println("Printing: " + q.poll());
        }
    }
}
