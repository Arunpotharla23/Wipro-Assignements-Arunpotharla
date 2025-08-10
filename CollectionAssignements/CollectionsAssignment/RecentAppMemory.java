package CollectionsAssignment;

import java.util.*;

class RecentApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> apps = new LinkedList<>();

        System.out.print("enter total Apps ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " app names:");
        for (int i = 0; i < n; i++) {
            String app = sc.nextLine();
            apps.remove(app);
            apps.addFirst(app);
        }

        System.out.println("Recent apps: " + apps);
    }
}
