package greedyAlgo;

import java.util.*;

public class jobSequence {
    class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    int[] JobScheduling(Job arr[], int n) {
        // Your code here
        // SORT ACC TO profit abe chutiye ye list sort karne ke kaam aata hai
        
        Comparator<Job> com = new Comparator<jobSequence.Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if (o1.profit < o2.profit) {
                    return 1;
                } else if (o1.profit > o2.profit) {
                    return -1;
                }
                return 0;
            }
        };

        int[] result = new int[n + 1];
        Arrays.fill(result, -1);
        int countJobs = 0, jobProfit = 0;
        for (int i = 0; i < n; i++) {

            for (int j = arr[i].deadline; j > 0; j--) {

                // Free slot found
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;

    }

}