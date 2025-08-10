package CollectionsAssignment;

import java.util.*;

class Job {
    String name;
    int urgency;

    Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    public String toString() {
        return name + " (" + urgency + ")";
    }
}

class SmartJobPicker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many jobs? ");
        int n = sc.nextInt();
        sc.nextLine();

        PriorityQueue<Job> jobs = new PriorityQueue<>(
            (a, b) -> a.urgency != b.urgency ? a.urgency - b.urgency : a.name.length() - b.name.length()
        );

        for (int i = 0; i < n; i++) {
            System.out.print("Job name: ");
            String name = sc.nextLine();
            System.out.print("Urgency (1-5): ");
            int urg = sc.nextInt();
            sc.nextLine();
            jobs.add(new Job(name, urg));
        }

        System.out.println("Jobs in priority:");
        while (!jobs.isEmpty()) {
            System.out.println(jobs.poll());
        }
    }
}
