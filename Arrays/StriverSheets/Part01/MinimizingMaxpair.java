package Arrays.StriverSheets.Part01;

import java.util.Arrays;

public class MinimizingMaxpair {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum > max) {
                max = sum;
            }
            i++;
            j--;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}
