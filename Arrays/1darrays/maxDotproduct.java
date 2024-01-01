import java.util.Arrays;
import java.util.LinkedHashSet;

public class maxDotproduct {
    public static int maxProductDifference(int[] nums) {
        int[] result = removeDuplicates(nums);
        Arrays.sort(result);
        int n = result.length;
        int w = result[n - 2];
        int x = result[n - 1];
        int y = result[1];
        int z = result[0];
        return w * x - y * z;
    }

    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        System.out.println(maxProductDifference(nums));
    }
}
