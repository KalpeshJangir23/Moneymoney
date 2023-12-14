package String;

import java.util.*;

public class findStringThatCanformFromCharString {
    public static int countCharacters(String[] words, String chars) {
        int sum = 0;
        ArrayList<Character> charlist = new ArrayList<>();
        for (int i = 0; i < chars.length(); i++) {
            charlist.add(chars.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            ArrayList<Character> checklist = new ArrayList<>(charlist);
            String val = words[i];
            int count = 0; 
            boolean found = true;
            for (int j = 0; j < val.length(); j++) {
                if (checklist.contains(val.charAt(j))) {
                    count++;
                    checklist.remove(Character.valueOf(val.charAt(j)));
                } else {
                    found = false;
                    break;
                }
            }
            if (found) {
                sum += count; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] words = { "cat", "bt", "hat", "tree" };
        String chars = "atach";
        System.out.println(countCharacters(words, chars)); // Output: 6
        // Explanation: The strings that can be formed are "cat" and "hat" so the answer
        // is 3 + 3 = 6.
    }
}
