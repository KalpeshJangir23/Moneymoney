package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MostFrequentIDs {

  public long[] mostFrequentIDs(int[] nums, int[] freq) {
    HashMap<Integer, Long> hmap = new HashMap<>();
    long[] res = new long[nums.length];
    for (int i = 0; i < res.length; i++) {
      if (hmap.containsKey(nums[i])) {
        long val = hmap.get(nums[i]);
        val = val + freq[i];
        hmap.put(nums[i], val);
      } else {
        hmap.put(nums[i], (long) freq[i]);
      }
      long maxValue = 0;
      for (long val : hmap.values()) {
        if (val > maxValue) {
          maxValue = val;
        }
      }
      res[i] = maxValue;
    }
    return res;
  }
}
