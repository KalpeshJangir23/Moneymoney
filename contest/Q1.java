package contest;

public class Q1 {
    public static int smallestMissingInteger(int[] nums) {
        int longestSeqSum = 0;
        int currSum = 0;

        // Calculate the sum of the longest sequential prefix
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] == nums[i - 1] + 1) {
                currSum += nums[i];
            } else {
                longestSeqSum = Math.max(longestSeqSum, currSum);
                currSum = nums[i];
            }
        }
        longestSeqSum = Math.max(longestSeqSum, currSum);

        int missing = longestSeqSum;

        // Find the smallest missing integer greater than or equal to the sum
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == missing) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
            missing++;
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,12,14,13};
        System.out.println(smallestMissingInteger(nums));
    }
}
