package PrefixSum;

import java.util.*;

public class FindtheScore {

  public static long[] findPrefixScore(int[] nums) {
    int n = nums.length;
    long[] res = new long[n];
    int[] maxpre = new int[n];
    int max = 0;
    for (int i = 0; i < maxpre.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
      maxpre[i] = max;
    }
    System.out.println(Arrays.toString(maxpre));
    for (int i = 0; i < maxpre.length; i++) {
      res[i] = nums[i] + maxpre[i];
    }
    long[] result = new long[n];
    long sum = 0;
    result[0] = res[0];

    System.out.println("res " + Arrays.toString(res));

    for (int i = 1; i < result.length; i++) {
      res[i] = res[i] + res[i - 1];
    }
    System.out.println("res " + Arrays.toString(res));
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 7, 5, 10 };
    System.out.println(findPrefixScore(nums));
  }
}
