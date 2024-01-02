import java.util.*;

public class convertanArrayto2darr {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        boolean check = true;
        while (check) {
            List<Integer> stackArr = new ArrayList<>();
            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (!stackArr.contains(nums[i]) && nums[i] != -1) {
                    stackArr.add(nums[i]);
                    nums[i] = -1;
                    found = true;
                }
            }

            if (found) {
                result.add(stackArr);
            } else {
                check = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2 };
        System.out.println(findMatrix(nums));
    }
}
