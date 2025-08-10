package javafeaturesAssignment;

import java.util.*;

class NameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];

        System.out.println("Enter  names:");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        for(String name : arr){
            System.out.println(name);
        }
    }
}
