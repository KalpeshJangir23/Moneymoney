package Sliding_Window;

import java.util.HashSet;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        HashSet<Character> set = new HashSet<>();

        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(max, set.size());
            } else {
                System.out.println(set);
                set.clear();
                set.add(s.charAt(i));
            }

            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
