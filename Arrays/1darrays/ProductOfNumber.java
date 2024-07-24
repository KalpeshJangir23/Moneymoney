import java.util.*;

public class ProductOfNumber {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int defaultval = 1;
        prefix[0] = 1 * nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        postfix[n - 1] = defaultval * nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = nums[i] * postfix[i + 1];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(postfix));
        int[] result = new int[n];
        result[0] = defaultval * postfix[1];
        result[n - 1] = defaultval * prefix[n - 2];
        for (int i = 1; i < n - 1; i++) {
            result[i] = prefix[i - 1] * postfix[i + 1];
        }
        System.out.println(Arrays.toString(result));

        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 6 };
        System.out.println(productExceptSelf(nums));
    }
}