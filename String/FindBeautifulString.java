package String;
import java.util.*;

public class FindBeautifulString {
    public static List<Integer> beautifulIndices(String s, String a, String b, int k) {
        HashSet<Integer> result = new HashSet<>();
              
        for (int i = 0; i <= s.length() - a.length(); i++) {
            if (s.substring(i, i + a.length()).equals(a)) {
                for (int j = 0; j <= s.length() - b.length(); j++) {
                    if (s.substring(j, j + b.length()).equals(b)) {
                        if (i - j <= k && i - j >= -k) {
                            result.add(i);
                        }
                    }
                }
                
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(result);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "isawsquirrelnearmysquirrelhouseohmy";
        String a = "my";
        String b = "squirrel";
        int k = 15;
        System.out.println(beautifulIndices(s, a, b, k));
    }
}
