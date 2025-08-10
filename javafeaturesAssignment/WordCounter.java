package javafeaturesAssignment;

import java.util.*;
import java.util.stream.*;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int count = sc.nextInt();
        sc.nextLine(); // clear the leftover newline

        System.out.println("Enter the names:");
        for (int i = 0; i < count; i++) {
            names.add(sc.nextLine());
        }

        long result = names.stream()
                           .filter(name -> name.length() > 5)
                           .count();

        System.out.println("Names more than 5 characters: " + result);
    }
}
