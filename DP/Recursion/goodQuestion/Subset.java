package DP.Recursion.goodQuestion;

import java.util.*;

public class Subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resuList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0, resuList, list, nums);
        return resuList;
    }

    static void solve(int index, List<List<Integer>> listoflist, List<Integer> list, int[] nums) {
        if (nums.length <= index) {
            listoflist.add(new ArrayList<>(list)); // Create a new copy of 'list' and add it to 'listoflist'
            return;
        }

        // Take wala part
        list.add(nums[index]);
        solve(index + 1, listoflist, list, nums);
        list.remove(list.size() - 1); // Backtrack - remove the last element from 'list'

        solve(index + 1, listoflist, list, nums);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}
