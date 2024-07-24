package PrefixSum;
//https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/submissions/1313642745/
import java.util.*;

public class SumOfAbsoluteDifference {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] result = new int[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int leftSum = prefixSum[i] - nums[i];
            int rightSum = prefixSum[n - 1] - prefixSum[i];

            int leftCount = i;
            int rightCount = n - i - 1;

            int leftTotal = (leftCount * nums[i]) - leftSum;
            int rightTotal = rightSum - (rightCount * nums[i]);

            result[i] = leftTotal + rightTotal;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 10};
        int[] val = getSumAbsoluteDifferences(nums);
        System.out.println(Arrays.toString(val));
    }
}
