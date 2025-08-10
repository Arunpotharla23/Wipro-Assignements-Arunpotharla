package CollectionsAssignment;

import java.util.*;

class ChatHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> chat = new ArrayDeque<>();

        System.out.print("How many messages? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " messages:");
        for (int i = 0; i < n; i++) {
            String msg = sc.nextLine();
            if (chat.size() == 3) {
                chat.removeFirst();
            }
            chat.addLast(msg);
        }

        System.out.println("Last 3 messages: " + chat);
    }
}
