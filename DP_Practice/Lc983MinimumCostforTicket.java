package DP_Practice;

import java.util.*;


public class Lc983MinimumCostforTicket {
    public static int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(n, days, costs, 0, dp);
    }

    static int solve(int n, int[] days, int[] costs, int index, int[] dp) {
        if (index >= n) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int option1 = costs[0] + solve(n, days, costs, index + 1, dp);

        int i;
        for (i = index; i < n && days[i] < days[index] + 7; i++)
            ;
        int option2 = costs[1] + solve(n, days, costs, i, dp);

        for (i = index; i < n && days[i] < days[index] + 30; i++)
            ;

        int option3 = costs[2] + solve(n, days, costs, i, dp);
        dp[index] =  Math.min(option1, Math.min(option2, option3));
        return dp[index];
    }

}
