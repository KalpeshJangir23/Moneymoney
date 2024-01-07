package Basic;

import java.util.ArrayList;
import java.util.List;

public class trykarna {
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(result, tempList, nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        if (tempList.size() >= 3) {
            result.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < nums.length; i++) {
            if (tempList.isEmpty() || nums[i] >= tempList.get(tempList.size() - 1)) {
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    public static boolean isArithmeticProgression(List<Integer> list) {
        if (list == null || list.size() < 2) {
            return false; 
        }

        int diff = list.get(1) - list.get(0);

        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) != diff) {
                return false; 
            }
        }

        return true; 
    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        List<List<Integer>> subsequences = findSubsequences(arr);
        int count = 0;
        
        for (List<Integer> subsequence : subsequences) {
            if (isArithmeticProgression(subsequence)) {
                count++;
            }
          
        }

        System.out.println(count);
    }
}
