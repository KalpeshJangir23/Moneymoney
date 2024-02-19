import java.util.Arrays;

public class Polygon {
    public static long largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int j = n - 1; j >= 2; j--) {
            long preSum = 0;
            int count = 0;

            for (int i = 0; i < j; i++) {
                preSum += nums[i];
                count++;
            }

            if (preSum > nums[j] && count >= 2) {
                return preSum + nums[j];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, 1, 2, 5, 50, 3};
        System.out.println(largestPerimeter(nums));
    }
}
