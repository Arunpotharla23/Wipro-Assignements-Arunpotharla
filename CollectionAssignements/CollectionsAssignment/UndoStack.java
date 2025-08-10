package CollectionsAssignment;

import java.util.*;

class UndoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();

        System.out.print("How many items? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter " + n + " items:");
        for (int i = 0; i < n; i++) {
            String item = sc.nextLine();
            st.push(item);
        }

        System.out.println("Stack: " + st);

        String last = st.pop(); 
        System.out.println("After undo: " + st);

        st.push(last); 
        System.out.println("After redo: " + st);
    }
}
