package contest;
import java.util.*;

public class DivideInto3 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 12};
        findThreeContiguousSubarrays(nums);
    }

    public static void findThreeContiguousSubarrays(int[] nums) {
        int n = nums.length; 
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = j + 1;

                int[] a1 = Arrays.copyOfRange(nums, 0, i + 1);
                int[] a2 = Arrays.copyOfRange(nums, i + 1, j + 1);
                int[] a3 = Arrays.copyOfRange(nums, j + 1, k + 1);

                int sum = a1[0] + a2[0] + a3[0];

                if (mini > sum) {
                    mini = sum;
                }
            }
        }
        System.out.println(mini);
    }
}
