
package DP.Recursion.goodQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SubSetII
 */
public class SubSetII {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(0, result, new ArrayList<>(), nums);
        System.out.println(result.size());
        return result;
    }

    static void solve(int index, List<List<Integer>> listoflist, List<Integer> list, int[] nums) {
       
            listoflist.add(new ArrayList<>(list)); // Create a new copy of 'list' and add it to 'listoflist'
        
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            list.add(nums[i]);
            solve(i + 1, listoflist, list, nums);
            list.remove(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
}

// package DP.Recursion.goodQuestion;

// import java.util.*;

// public class SubSetII {
// public static List<List<Integer>> subsets(int[] nums) {
// HashSet<List<Integer>> resuList = new HashSet<>();
// List<Integer> list = new ArrayList<>();
// solve(0, resuList, list, nums);
// System.out.println(resuList.size());
// List<List<Integer>> ansList = new ArrayList<>(resuList);
// return ansList;
// }

// static void solve(int index, HashSet<List<Integer>> listoflist, List<Integer>
// list, int[] nums) {
// if (nums.length <= index) {
// listoflist.add(new ArrayList<>(list)); // Create a new copy of 'list' and add
// it to 'listoflist'
// return;
// }

// // Take wala part
// list.add(nums[index]);
// solve(index + 1, listoflist, list, nums);
// list.remove(list.size() - 1); // Backtrack - remove the last element from
// 'list'

// solve(index + 1, listoflist, list, nums);
// }

// }
