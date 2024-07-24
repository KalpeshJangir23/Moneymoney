package Sliding_Window;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256]; // Assuming ASCII characters
        int l = 0;
        int r = 0;
        int max = 0;
        
        Arrays.fill(arr, -1);
        
        while (r < s.length()) {
            if (arr[s.charAt(r)] != -1 && arr[s.charAt(r)] >= l) {
                l = arr[s.charAt(r)] + 1;
            }
            arr[s.charAt(r)] = r;
            max = Math.max(max, r - l + 1);
            r++;
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
