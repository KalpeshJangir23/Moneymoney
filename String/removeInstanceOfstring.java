package String;

import java.util.ArrayList;
import java.util.List;

public class removeInstanceOfstring {
    public static String lastNonEmptyString(String s) {
        List<String> list = new ArrayList<>();
        while (!s.isEmpty()) {
            char val = s.charAt(0);
            StringBuilder str = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                if (val != s.charAt(i)) {
                    val = s.charAt(i);
                } else {
                    str.append(s.charAt(i));
                }
            }
            s = str.toString();
            System.out.println(s);
            list.add(s);
        }
        return list.get(list.size() - 2);
    }

    public static String lastNonEmptyString2(String s) {
        List<String> list = new ArrayList<>();

        while (!s.isEmpty()) {
            for (char c = 'a'; c <= 'z'; c++) {
                int index = s.indexOf(c);
                if (index != -1) {
                    s = s.substring(0, index) + s.substring(index + 1);
                }
            }

            System.out.println(s);
            list.add(s);
        }

        return list.get(list.size() - 2);
    }

    public static void main(String[] args) {
        String s = "aabcbbca";
        System.out.println(lastNonEmptyString2(s));
    }
}
