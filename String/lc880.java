package String;

import java.util.ArrayList;

public class lc880 {
    public static String decodeAtIndex(String s, int k) {


        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '1' || s.charAt(i) > '9') {
                char charDigit = s.charAt(i);
                int intValue = Character.getNumericValue(charDigit);
                for (int j = 0; j < intValue -2; j++) {
                    for (int j2 = 0; j2 < list.size(); j2++) {
                        list.add(list.get(j2));
                    }
                }
             }
             else{
                list.add(s.charAt(i));
             }
            
        }
        String ans = String.valueOf(list.get(k));
        return ans;
    }
    public static void main(String[] args) {
        String s ="le2e";
        int k = 4;
        System.out.println(5/2);
        System.out.println(decodeAtIndex(s, k));
    }
}
