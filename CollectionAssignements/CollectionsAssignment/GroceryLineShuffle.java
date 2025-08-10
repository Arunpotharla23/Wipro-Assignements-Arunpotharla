package CollectionsAssignment;

import java.util.*;

class GroceryLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> line = new ArrayDeque<>();

        System.out.print("How many customers? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (name.length() % 2 == 0) {
                line.addFirst(name);
            } else {
                line.addLast(name);
            }
        }

        System.out.println("Serving order: " + line);
    }
}
