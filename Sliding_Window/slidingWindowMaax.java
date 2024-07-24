package Sliding_Window;

import java.util.*;

/**
 * slidingWindowMaax
 */
public class slidingWindowMaax {

  public static int[] maxSlidingWindow(int[] nums, int k) {
    int index = -1;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < k - 1; i++) {
      if (nums[i] > max) {
        max = nums[i];
        index = i;
      }
    }
    List<Integer> list = new ArrayList<>();
    list.add(max);
    int left = 1;
    int right = k;
    while (right < nums.length) {
      if (nums[right] > max && index >= left && index <= right) {
        max = nums[right];
        index = right;
        list.add(max);
      }else{
        list.add(max);
      }
      if (index < left) {
        index = left + 1;
      }
      left++;
      right++;
    }
    System.out.println(list);
    return nums;
  }
  public static void main(String[] args) {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    System.out.println(maxSlidingWindow(nums, k));

  }
}
