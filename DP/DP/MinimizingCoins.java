

//Consider a money system consisting of 
//n coins. Each coin has a positive integer value. Your task is to produce a sum of money 
// x using the available coins in such a way that the number of coins is minimal.
//n different coins of {1,5,7} , x = 11 total no coins = 3 (1+5+5)

import java.util.*;

public class MinimizingCoins {
    public static int solve(List<Integer> a, int n, int x, int[] dp) {
        if (x == 0)
            return 0;
        if (x < 0)
            return -1;

        if (dp[x] != -2)
            return dp[x];

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int val = solve(a, n, x - a.get(i), dp);

            if (val != -1)
                ans = Math.min(ans, val + 1);
        }

        if (ans == Integer.MAX_VALUE)
            ans = -1;
        return dp[x] = ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int[] dp = new int[x + 1];
        Arrays.fill(dp, -2);

        int ans = solve(a, n, x, dp);
        System.out.println(ans);
    }
}
