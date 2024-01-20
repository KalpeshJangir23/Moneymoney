package DP;

import java.util.*;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return minSumPath(m, n, grid);
    }

    static int minSumPathUtil(int i, int j, int[][] matrix, int[][] dp) {
        if (i == 0 && j == 0)
            return matrix[0][0];
        if (i < 0 || j < 0)
            return (int) Math.pow(10, 9);
        if (dp[i][j] != -1)
            return dp[i][j];

        int up = matrix[i][j] + minSumPathUtil(i - 1, j, matrix, dp);
        int left = matrix[i][j] + minSumPathUtil(i, j - 1, matrix, dp);

        return dp[i][j] = Math.min(up, left);
    }

    static int minSumPath(int n, int m, int[][] matrix) {
        int dp[][] = new int[n][m];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        return minSumPathUtil(n - 1, m - 1, matrix, dp);
    }
    // int solve(int m, int n, int[][] arr) {
    // if (m == 0 && n == 0) return arr[0][0];
    // if (m < 0 || n < 0) return Integer.MAX_VALUE;

    // int up = arr[m][n] + solve(m - 1, n, arr);
    // int left = arr[m][n] + solve(m, n - 1, arr);

    // return Math.min(up, left);
    // }
}
