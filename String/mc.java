package String;

import java.util.*;

public class mc {
    public static String lastNonEmptyString(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (hmap.containsKey(s.charAt(i))) {
                arr[i] = hmap.get(s.charAt(i)) + 1;
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            } else {
                arr[i] = 0;
                hmap.put(s.charAt(i), 0);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int num : hmap.values()) {
            max = Math.max(num, max);
        }
        System.out.println(max);
        System.out.println(
        Arrays.toString(arr));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(lastNonEmptyString(s));

    }
}
