import java.util.Arrays;
 
public class DivideTheMaxArray {
    public int[][] divideArray(int[] nums, int k) {
        if (nums == null || nums.length < 3) {
            return new int[0][0];
        }

        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3][3];
        boolean[] used = new boolean[nums.length];
        int resultIndex = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (used[i]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (used[j]) {
                    continue;
                }

                for (int l = j + 1; l < nums.length; l++) {
                    if (used[l]) {
                        continue;
                    }

                    int[] currentArray = new int[]{nums[i], nums[j], nums[l]};
                    if (checkDifference(currentArray, k)) {
                        result[resultIndex++] = currentArray;
                        used[i] = used[j] = used[l] = true;
                        break;
                    }
                }
            }
        }


        
        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                return new int[0][0];
            }
        }
        return (resultIndex > 0) ? Arrays.copyOf(result, resultIndex) : new int[0][0];
    }

    static boolean checkDifference(int[] values, int k) {
        if(values == null || values.length < 3){
            return false;
        }
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                int difference = values[j] - values[i];
                if (difference > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
