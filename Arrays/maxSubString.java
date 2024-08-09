package arrays;

import java.util.HashMap;

public class maxSubString {

  public static int maximumLengthSubstring(String s) {
    int maxLen = 0;
    HashMap<Character, Integer> hmap = new HashMap<>();
    int i = 0;
    int j = 0;
    while (j < s.length()) {
      hmap.put(s.charAt(j), hmap.getOrDefault(s.charAt(j), 0) + 1);
      int val = hmap.get(s.charAt(j));
      if (hmap.containsKey(s.charAt(j))) {
        if (val <= 2) {
          maxLen = Math.max(maxLen, j - i + 1);
          j++;
        } else {
          hmap.put(s.charAt(j), hmap.get(s.charAt(j)) - 1);
          hmap.put(s.charAt(i), hmap.get(s.charAt(i)) - 1);
          i++;
        }
      } else {
        j++;
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    System.out.println(maximumLengthSubstring("aaaaa"));
  }
}
