package contest;

import java.util.Arrays;

public class BitQuestion {
    public int countBits(int n) {
        int c = 0;
        while (n > 0) {
            n = n & (n - 1);
            c++;
        }
        return c;
    }

    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (nums[j] > nums[j + 1] && countBits(nums[j]) == countBits(nums[j + 1])) {
                    swap(nums, j, j + 1);
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BitQuestion solution = new BitQuestion();
        int[] nums = {75, 34, 30};
        boolean result = solution.canSortArray(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
