



import java.util.*;

public class MinimizingCoinsUsingTabulation {
    public static int solve(int[] a, int n, int x) {
        int[] dp = new int[x + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int j = 1; j <= x; j++) {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (j - a[i] < 0)
                    return 0;

                int val = dp[j - a[i]];
                if (val != Integer.MAX_VALUE)
                    ans = Math.min(ans, val + 1);
            }

            if (ans == Integer.MAX_VALUE)
                dp[j] = -1;
            else
                dp[j] = ans;
        }

        return dp[x];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int ans = solve(a, n, x);
        System.out.println(ans);
    }
}
