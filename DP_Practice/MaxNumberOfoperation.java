package DP_Practice;

import java.util.Arrays;

public class MaxNumberOfoperation {
    private int[][] memo; // Memoization table
    
    // Helper function to calculate the maximum operations
    private int maxOps(int start, int end, int[] nums, int targetSum) {
        if (end <= start)
            return 0;

        // If already calculated, return the result
        if (memo[start][end] != -1)
            return memo[start][end];

        int maxOperations = 0;

        // Check if the sum of current and next element equals the target
        if (nums[start] + nums[start + 1] == targetSum)
            maxOperations = Math.max(maxOperations, 1 + maxOps(start + 2, end, nums, targetSum));

        // Check if the sum of first and last element equals the target
        if (nums[start] + nums[end] == targetSum)
            maxOperations = Math.max(maxOperations, 1 + maxOps(start + 1, end - 1, nums, targetSum));

        // Check if the sum of last two elements equals the target
        if (nums[end] + nums[end - 1] == targetSum)
            maxOperations = Math.max(maxOperations, 1 + maxOps(start, end - 2, nums, targetSum));

        // Memoize the result and return
        return memo[start][end] = maxOperations;
    }

    public int maxOperations(int[] nums) {
        int n = nums.length;
        
        // Initialize memoization table
        memo = new int[n][n];
        for (int[] row : memo)
            Arrays.fill(row, -1);

        // Calculate max operations for each starting position
        int result = 0;
        result = 1 + maxOps(0, n - 3, nums, nums[n - 1] + nums[n - 2]);
        result = Math.max(result, 1 + maxOps(1, n - 2, nums, nums[0] + nums[n - 1]));
        result = Math.max(result, 1 + maxOps(2, n - 1, nums, nums[0] + nums[1]));

        return result;
    }
}