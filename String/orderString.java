package String;

import java.util.*;

public class orderString {
    public static String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder();
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < order.length(); i++) {
            list.add(order.charAt(i));
        }
        
        for (int i = 0; i < order.length(); i++) {
            char val = order.charAt(i);
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == val) {
                    str.append(val);
                }
            }
        }    
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!list.contains(currentChar)) {
                str.append(currentChar);
            }
        }
        
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "abcd";
        String order = "cba";
        System.out.println(customSortString(order, s));
    }
}
