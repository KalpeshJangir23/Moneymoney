package DP;
public class arthemeticSlice {
    public static int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length < 3) {
            return 0;
        }
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i-1] - nums[i-2]) {
                dp[i] = dp[i-1] + 1;
                sum = sum + dp[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        System.out.println(numberOfArithmeticSlices(nums));

    }
}
