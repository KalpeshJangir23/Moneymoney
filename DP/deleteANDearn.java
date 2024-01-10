package DP;

public class deleteANDearn {
    public static int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        int[] values = new int[maxVal + 1];

        for (int num : nums) {
            values[num] += num;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        int[] dp = new int[maxVal + 1];

        dp[1] = values[1];
        dp[2] = Math.max(dp[1], values[2]);
        for (int i = 3; i <= maxVal; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + values[i]);
        }

        return dp[maxVal];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 4, 5, 5, 5, 6};
        System.out.println(deleteAndEarn(nums));
    }
}
