package DP.DP;

import java.util.Arrays;

public class climbingStairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return noOfwaysUsingDP(n,dp);
        
    }  
    // -- Using Recursion
    public  static int  noOfways(int n){    
        if(n == 0) return 1; //! Base Case
        if(n==1)  return 1; //! Edge Case
        int left = noOfways(n-1); //! Step1
        int right = noOfways(n-2); //! Step 2
        return left+right; //! Count all the ways
    }
    // ?? Using Dp
    public static int noOfwaysUsingDP(int n, int[] dp) {
        if (n==0) return 1;
        if (n==1) return 1;
        if (dp[n] != -1) {
            return dp[n];
        }
        int left = noOfwaysUsingDP(n-1 , dp); //! Step1
        int right = noOfwaysUsingDP(n-2 ,dp);
        return dp[n] = left + right;
    }
    public static void main(String[] args) {
        int n = 45;
        
        System.out.println(climbStairs(n));
    }
}
