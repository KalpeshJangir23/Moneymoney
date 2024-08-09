package DP_Practice;

import java.util.*;

public class perfectSquare {

  public static int numSquares(int n) {
    List<Integer> list = new ArrayList<>();
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    for (int i = 1; i * i <= n; i++) {
      list.add(i * i);
    }
    return solve(list, n, dp);
  }

  static int solve(List<Integer> list, int target, int[] dp) {
    if (target == 0) {
      return 0;
    }
    int min = Integer.MAX_VALUE;

    int count = 0;
    if (dp[target] != -1) {
      return dp[target];
    }
    for (int i = 0; i < list.size(); i++) {
      if (target - list.get(i) >= 0) {
        count = 1 + solve(list, target - list.get(i), dp);
        min = Math.min(count, min);
        
      }
    }

    return dp[target] = min;
  }

  public static void main(String[] args) {
    System.out.println(numSquares(13));
  }
}
