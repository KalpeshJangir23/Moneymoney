package DP.DP;

import java.util.*;

public class DiceCombinations {
    static int solve(int n, int[] dp) {
        // ** Recursion Relaton
        // ! f(n) = f(n-1) + f(n-2) + f(n-3) + f(n-4) + f(n-5) + f(n-6)

        if (n == 0)
            return 1;
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1)
            return dp[n];
        int ans = 0;
        for (int i = 1; i <= 6; i++) {
            ans += solve(n - i, dp);
        }
        return dp[n] = ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n, dp));
    }

}
