package BinarySearch;

public class bouquetCreation {

    public static int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int i : bloomDay) {
            low = Math.min(low, i);
            high = Math.max(i, high);
        }
        if (m*k>= bloomDay.length) {
            return -1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int val = solve(bloomDay, mid, k);
            if (val >= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int solve(int[] nums, int currday, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= currday) {
                count++;
                if (count == k) {
                    sum++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 12, 7, 7 };
        int m = 2;
        int k = 3;
        System.out.println(minDays(nums, m, k)); // Output: 12
    }
}
