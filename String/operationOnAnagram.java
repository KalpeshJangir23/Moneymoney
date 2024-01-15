package String;
import java.util.*;
public class operationOnAnagram {
    public static int minSteps(String s, String t) {
        int count = 0;
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (!list.contains(t.charAt(i))) {
               
                count++;
            }
            else{
                list.remove(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        System.out.println(minSteps(s, t));
    }
}
