package Sliding_Window;

public class MaximumPointofkCard {
    public int maxScore(int[] nums, int k) {
        int lsum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum + nums[i];
        }
        int max = lsum;
        int rsum = 0;
        int rindx = nums.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - nums[i];
            rsum = rsum + nums[rindx];
            rindx = rindx - 1;
            max = Math.max(max, lsum + rsum);
        }
        return max;
    }
}
