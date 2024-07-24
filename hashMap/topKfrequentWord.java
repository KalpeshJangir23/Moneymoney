package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKfrequentWord {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String val = words[i];
            hmap.put(val, hmap.getOrDefault(val, 0) + 1);
        }

        List<String>[] freq = new List[words.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        List<String> result = new ArrayList<>();
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (String n : freq[i]) {
                result.add(n);
                index++;
                if (index == k) {
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}
