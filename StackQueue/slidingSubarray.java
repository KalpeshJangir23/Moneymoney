package StackQueue;

import java.util.PriorityQueue;

public class slidingSubarray {

  public static int[] findMthSmallestInSubarrays(int[] nums, int k, int x) {
    int n = nums.length;

    int[] result = new int[n - k + 1];

    for (int i = 0; i <= n - k; i++) {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();

      for (int j = i; j < i + k; j++) {
        minHeap.offer(nums[j]);
      }

      for (int j = 0; j < x - 1; j++) {
        minHeap.poll();
      }
      int val = minHeap.poll();

      if (val > 0) {
        result[i] = 0;
      } else {
        result[i] = val;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { -3, 1, 2, -3, 0, -3 };
    int k = 2;
    int m = 1;

    int[] mthSmallestArray = findMthSmallestInSubarrays(nums, k, m);
    for (int num : mthSmallestArray) {
      System.out.print(num + " ");
    }
  }
}
