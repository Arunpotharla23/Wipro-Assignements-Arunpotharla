package CollectionsAssignment;

import java.util.*;

class TaskList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of numbers: ");
        int count = Integer.parseInt(sc.nextLine());

        LinkedList<String> tasks = new LinkedList<>();

        System.out.println("Enter numbers:");
        for (int i = 0; i < count; i++) {
            String t = sc.nextLine();
            if (t.endsWith("!")) {
                tasks.addFirst(t);
            } else {
                tasks.add(t);
            }
        }

        System.out.println("numbers in reverse order:");
        for (int i = tasks.size() - 1; i >= 0; i--) {
            System.out.println(tasks.get(i));
        }
    }
}
