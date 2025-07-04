package RestartingIn2025;

import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencingGreedy {

    public static void printJobScheduling(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        Job[] jobs = new Job[n];

        // Create job objects
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job((char)('a' + i), deadlines[i], profits[i]);
        }

        // Sort jobs in decreasing order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        System.out.println("HIIIIIIIIIIIII");

        // Find the maximum deadline
        int maxDeadline = 0;
        for (int deadline : deadlines) {
            maxDeadline = Math.max(maxDeadline, deadline);
        }

        // To store result (sequence of jobs)
        char[] result = new char[maxDeadline];
        // To keep track of free time slots
        boolean[] slot = new boolean[maxDeadline];

        // Initialize all slots to be free
        Arrays.fill(slot, false);

        // Iterate through all jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (we start from the last possible slot)
            for (int j = Math.min(maxDeadline - 1, jobs[i].deadline - 1); j >= 0; j--) {
                // If free slot found
                if (!slot[j]) {
                    result[j] = jobs[i].id;
                    slot[j] = true;
                    break;
                }
            }
        }

        // Calculate total profit and print the sequence
        int totalProfit = 0;
        System.out.print("Selected Jobs: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
                // Find the profit of this job
                for (Job job : jobs) {
                    if (job.id == result[i]) {
                        totalProfit += job.profit;
                        break;
                    }
                }
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

























    // Alternative implementation with job numbers instead of characters
    public static void printJobSchedulingWithNumbers(int[] deadlines, int[] profits) {
        int n = deadlines.length;

        // Create a class to represent a job
        class JobInfo {
            int jobId;
            int deadline;
            int profit;

            JobInfo(int jobId, int deadline, int profit) {
                this.jobId = jobId;
                this.deadline = deadline;
                this.profit = profit;
            }

            @Override
            public String toString() {
//                return "JobInfo{jobId=" + jobId + ", deadline=" + deadline + ",profit=" +profit+"}";
                return jobId+" "+deadline+" "+profit;
            }
        }

        // Create job objects


        JobInfo[] jobs = new JobInfo[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new JobInfo(i + 1, deadlines[i], profits[i]); // Job IDs start from 1
        }

        System.out.println(Arrays.toString(jobs));
        // Sort jobs in decreasing order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        System.out.println("SORTED");
        System.out.println(Arrays.toString(jobs));

        // Find the maximum deadline
        int maxDeadline = Arrays.stream(deadlines).max().getAsInt();

        System.out.println(maxDeadline);

        // To store result (sequence of jobs)
        int[] result = new int[maxDeadline];
        // To keep track of free time slots
        boolean[] slot = new boolean[maxDeadline];

        // Initialize all slots to be free
        Arrays.fill(slot, false);

        // Iterate through all jobs
        for (JobInfo job : jobs) {
            // Find a free slot for this job (we start from the last possible slot)
            for (int j = Math.min(maxDeadline - 1, job.deadline - 1); j >= 0; j--) {
                // If free slot found
                if (!slot[j]) {
                    result[j] = job.jobId;
                    slot[j] = true;
                    break;
                }
            }
        }

        // Calculate total profit
        int totalProfit = 0;
        System.out.print("Selected Jobs: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                System.out.print("Job " + result[i] + " ");
                // Find the profit of this job
                for (JobInfo job : jobs) {
                    if (job.jobId == result[i]) {
                        totalProfit += job.profit;
                        break;
                    }
                }
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
//         Example 1
        int[] deadlines1 = {2, 1, 2, 1, 3};
        int[] profits1 = {100, 19, 27, 25, 15};
        System.out.println("Example 1:");
        printJobSchedulingWithNumbers(deadlines1, profits1);

        // Example 2
        int[] deadlines2 = {4, 1, 1, 1};
        int[] profits2 = {20, 10, 40, 30};
        System.out.println("\nExample 2:");
        printJobSchedulingWithNumbers(deadlines2, profits2);

        // Example 3
        int[] deadlines3 = {2, 2, 1, 3, 3, 1};
        int[] profits3 = {50, 20, 30, 25, 15, 10};
        System.out.println("\nExample 3:");
        printJobSchedulingWithNumbers(deadlines3, profits3);




//        int[] deadlines1 = {2, 1, 2, 1, 3};
//        int[] profits1 = {100, 19, 27, 25, 15};
//        System.out.println("Example 1:");
//        printJobScheduling(deadlines1, profits1);
//
//        // Example 2
//        int[] deadlines2 = {4, 1, 1, 1};
//        int[] profits2 = {20, 10, 40, 30};
//        System.out.println("\nExample 2:");
//        printJobScheduling(deadlines2, profits2);
//
//        // Example 3
//        int[] deadlines3 = {2, 2, 1, 3, 3, 1};
//        int[] profits3 = {50, 20, 30, 25, 15, 10};
//        System.out.println("\nExample 3:");
//        printJobScheduling(deadlines3, profits3);
    }
}