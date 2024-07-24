package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * findString
 */
public class findString {

    public static boolean isSubstringPresent(String s) {
        StringBuilder str = new StringBuilder(s).reverse();
        String rev = str.toString();
        List<String> list = new ArrayList<>();
        List<String> revList = new ArrayList<>();
        for (int i = 2; i <= s.length(); i++) {
            list.add(s.substring(i - 2, i));
        }
        System.out.println(list);
        for (int i = 2; i <= s.length(); i++) {
            revList.add(rev.substring(i - 2, i));
        }
        System.out.println(revList);
        for (int i = 0; i < list.size(); i++) {
            if (revList.contains(list.get(i))) {
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(isSubstringPresent(s));

    }
}