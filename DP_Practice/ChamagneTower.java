package DP_Practice;

public class ChamagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[101][101];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }

        return Math.min(1.0, solve(query_row, query_glass, poured, dp));
    }

    static double solve(int i, int j, int k, double[][] dp) {
        if (i < 0 || j < 0 || i < j) {
            return 0.0;
        }
        if (i == 0 && j == 0) {
            return k;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        double left = (double) ((solve(i - 1, j - 1, k, dp) - 1) / 2);
        double right = (double) ((solve(i - 1, j, k, dp) - 1) / 2);
        if (left < 0) {
            left = 0;
        }
        if (right < 0) {
            right = 0;
        }
        return dp[i][j] = left + right;

    }
}
