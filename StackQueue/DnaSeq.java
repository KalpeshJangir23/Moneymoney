package StackQueue;

import java.util.*;

public class DnaSeq {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int i = 0;
        int j = 10;
        while (j <= s.length()) {
            String val = s.substring(i, j);
            if (list.contains(val) && !result.contains(val)) {
                result.add(val);
            } else {
                list.add(val); 
            }
            i++;
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s));
    }
}
