// package DP.Recursion.goodQuestion;

// import java.util.*;;

// public class longestIncreasingSubsequence {
//     public static int lengthOfLIS(int[] nums) {
//         List<Integer> list = new ArrayList<Integer>();
//         int index = 0;
//         int max = Integer.MIN_VALUE;
//         int n = nums.length;

//         return recursionFunction(list, nums, index, n, max);
//     }

//     static int recursionFunction(List<Integer> list, int[] nums, int index, int n, int max) {
//         if (index == nums.length-1) {
//             return max;
//         }
//         list.add(nums[index]);
//         if (nums[index] < nums[index + 1]) {
//             list.add(nums[index + 1]);
//             index = index + 1;
//             if (list.size() > max) {
//                 max = list.size();
//             } // take
//             recursionFunction(list, nums, index + 1, n, max);
//         }

//         list.remove(nums[index]);
//         if (list.size() > max) {
//             max = list.size();
//         }

//         return recursionFunction(list, nums, index + 1, n, max) ;
//     }
//     public static void main(String[] args) {
//         int[] nums = {10,9,2,5,3,7,101,18};
//         System.out.println(lengthOfLIS(nums));
//     }
// }
package DP.Recursion.goodQuestion;

import java.util.*;

public class longestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int n = nums.length;
        int maxLength = recursionFunction(list, nums, index, n);
        return maxLength;
    }

    static int recursionFunction(List<Integer> list, int[] nums, int index, int n) {
        if (index == n) {
            return list.size();
        }

        int maxLength = 0;
        if (list.isEmpty() || nums[index] > list.get(list.size() - 1)) {
            list.add(nums[index]);
            maxLength = recursionFunction(list, nums, index + 1, n);
            list.remove(list.size() - 1);
        }

        int maxLengthExcludingCurrent = recursionFunction(list, nums, index + 1, n);

        return Math.max(maxLength, maxLengthExcludingCurrent);
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums));
    }
}
