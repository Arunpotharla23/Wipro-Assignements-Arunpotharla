package javafeaturesAssignment;

import java.util.*;
import java.util.stream.*;

class PrettyJoiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cities = new ArrayList<>();

        System.out.print("Enter total no of  cities: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the city names:");
        for (int i = 0; i < n; i++) {
            cities.add(sc.nextLine());
        }

        String result = cities.stream()
                              .collect(Collectors.joining(", "));

        System.out.println("Cities: " + result);
    }
}
