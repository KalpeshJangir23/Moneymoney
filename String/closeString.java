package String;

import java.util.HashMap;
import java.util.Map;

public class closeString {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        }
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }



        return map1.equals(map2);
    }
}
