package Basic;
import java.util.*;
public class trykarna {
    public static void main(String[] args) {
        int[] nums = {0,3,4,5,2,3,4,1,4 };
        int[] result = findGreaterIndices(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Result Array:   " + Arrays.toString(result));
    }

    public static int[] findGreaterIndices(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int currentIndex = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[i]) {
                    currentIndex = j;
                    break;
                }
            }

            result[i] = currentIndex;
        }

        return result;
    }
}
