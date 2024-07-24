package DP_Practice;

import java.util.*;

public class DistinctSubsequence {
    public static int numDistinct(String s, String t) {
        int[][] memo = new int[s.length()][t.length()];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        //return solveR(s.length() - 1, t.length() - 1, s, t);
        return solveM(s.length() - 1, t.length() - 1, s, t, memo);
    }

    static int solveR(int i, int j, String s, String t) {
        if (j < 0)
            return 1;
        if (i < 0)
            return 0;

        if (s.charAt(i) == t.charAt(j)) {
            return solveR(i - 1, j - 1, s, t) + solveR(i - 1, j, s, t);
        } else {
            return solveR(i - 1, j, s, t);
        }
    }

    static int solveM(int i, int j, String s, String t, int[][] memo) {
        if (j < 0)
            return 1; 
        if (i < 0)
            return 0; 
        if (memo[i][j] != -1)
            return memo[i][j]; 

        if (s.charAt(i) == t.charAt(j)) {
            memo[i][j] = solveM(i - 1, j - 1, s, t, memo) + solveM(i - 1, j, s, t, memo);
        } else {
            memo[i][j] = solveM(i - 1, j, s, t, memo);
        }

        return memo[i][j];
    }

    public static void main(String[] args) {
        System.out.println(numDistinct("babgbag", "bag")); // Output: 5
    }
}
