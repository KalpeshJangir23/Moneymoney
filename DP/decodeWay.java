package DP;

import java.util.*;

public class decodeWay {

    public int numDecodings(String s) {
        int[] dp = new int[101];
        Arrays.fill(dp, -1);
        return solveM(0, s, dp);
    }

    int solveM(int i, String s, int[] dp) {
        if (dp[i] != -1)
            return dp[i];
        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }
        int count1 = solveM(i + 1, s, dp);
        int count2 = 0;
        if (i + 1 < s.length() && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
            count2 = solveM(i + 2, s, dp);
        }
        return dp[i] = count1 + count2;

    }

    static int solve(int i, String s) {
        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        int count1 = solve(i + 1, s);
        int count2 = 0;

        if (i + 1 < s.length() && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
            count2 = solve(i + 2, s);
        }

        return count1 + count2;
    }
}