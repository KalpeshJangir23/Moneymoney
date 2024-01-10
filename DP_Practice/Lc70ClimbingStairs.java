package DP_Practice;

public class Lc70ClimbingStairs {
    public int climbStairs(int n) {
        return countNoway(n, n, 0);
    }

    static int countNoway(int n, int currVal, int count) {
       
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] dp = new int[n+1];
        dp[1]  = 1; 
        dp[2] = 2;
        for(int i = 3 ; i <= n ; i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
