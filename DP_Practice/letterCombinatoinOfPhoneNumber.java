package DP_Practice;

import java.util.*;

public class letterCombinatoinOfPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        HashMap<Character, String> hmap = new HashMap<>();
        hmap.put('2', "abc");
        hmap.put('3', "def");
        hmap.put('4', "ghi");
        hmap.put('5', "jkl");
        hmap.put('6', "mno");
        hmap.put('7', "pqrs");
        hmap.put('8', "tuv");
        hmap.put('9', "wxyz");
        
        result.add("");  // Start with an empty combination
        
        for (int i = 0; i < digits.length(); i++) {
            List<String> tempList = new ArrayList<>();
            String letters = hmap.get(digits.charAt(i));
            
            for (String combination : result) {
                for (int j = 0; j < letters.length(); j++) {
                    tempList.add(combination + letters.charAt(j));
                }
            }
            
            result = tempList;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}
