package CollectionsAssignment;

import java.util.*;

class LastSearches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> box = new ArrayDeque<>();

        System.out.print("total no of items ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " items:");
        for (int i = 0; i < n; i++) {
            String term = sc.nextLine();
            if (box.size() == 3) {
                box.removeFirst();
            }
            box.addLast(term);
        }

        System.out.println("Last 3 items: " + box);
    }
}
