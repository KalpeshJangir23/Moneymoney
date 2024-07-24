package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sortTheJumble {

  public static int[] sortJumbled(int[] mapping, int[] nums) {
    int[] res = new int[nums.length];
    HashMap<Integer, Integer> hmap = new HashMap<>(); /// res ke creation
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i < mapping.length; i++) {
      hmap.put(i, mapping[i]);
    }
    HashMap<Integer, Integer> hm = new HashMap<>();

    System.out.println(hmap);
    for (int i = 0; i < nums.length; i++) {
      if (freq.containsKey(nums[i])) {
        freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
      } else {
        freq.put(nums[i], freq.getOrDefault(nums[i], 0));
      }
      res[i] = numCreation(hmap, nums[i]);
      hm.put(nums[i], res[i]);
    }
    System.out.println(freq);
    System.out.println(hm);
    Arrays.sort(res);
    for (int i = 0; i < res.length; i++) {
      for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        if (entry.getValue() == res[i]) {
          res[i] = entry.getKey();
          if (freq.get(entry.getKey()) <= 0) {
            hm.put(entry.getKey(), -1);
          } else {
            freq.put(nums[i], freq.get(nums[i]) - 1);
          }
        }
      }
    }
    System.out.println(Arrays.toString(res));
    return res;
  }

  static int numCreation(HashMap<Integer, Integer> hmap, int num) {
    String val = String.valueOf(num);
    char[] arr = val.toCharArray();
    StringBuilder str = new StringBuilder();
    for (int j = 0; j < arr.length; j++) {
      str.append(hmap.get(arr[j] - '0'));
    }
    return Integer.parseInt(str.toString());
  }

  public static void main(String[] args) {
    int[] mapping = { 8, 9, 4, 0, 2, 1, 3, 5, 7, 6 };
    int[] nums = { 991, 338, 38 };
    System.out.println(sortJumbled(mapping, nums));
  }
}
