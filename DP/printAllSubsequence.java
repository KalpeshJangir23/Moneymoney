package DP;
import java.util.*;

public class printAllSubsequence {
    public static List<List<Integer>> printSubsequence(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        print(0, nums, new ArrayList<>(), result);
        return result;
    }

    static void print(int index, int[] nums, List<Integer> list, List<List<Integer>> ans){
        if (index >= nums.length) {
            ans.add(new ArrayList<>(list)); // Create a new ArrayList based on the current list
            return;
        }

        list.add(nums[index]);
        print(index + 1, nums, list, ans);
        list.remove(list.size() - 1);
        print(index + 1, nums, list, ans);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(printSubsequence(nums));
    }
}
