//package DP.DP;

import java.util.*;

public class DiceCombinationUsingTabulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] dp = new int[n + 1];

        // Base case: there's one way to make 0 using no dice.
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6 && i - j >= 0; j++) {
                dp[i] += dp[i - j];
                dp[i] %= 1000000007; // To avoid integer overflow
            }
        }

        System.out.println(dp[n]);
    }
}
