package DP_Practice;

import java.util.*;

public class Lc1239 {
    public static String mergeUniqueStrings(List<String> str) {
        String result = "";
        for (String s : str) {

            if (areAllCharactersUnique(result + s)) {
                result += s;
            } else {
                return " ";
            }
        }
        return result;
    }

    static int solve(int index, List<String> arr, List<String> list) {
        if (arr.size() <= index) {
            return mergeUniqueStrings(list).length();
        }

        int maxi1 = 0;
        if (areAllCharactersUnique(arr.get(index))) {
            list.add(arr.get(index));
             maxi1 = solve(index + 1, arr, list);
             list.remove(list.size() - 1);
        }
        
        int maxi2 = solve(index + 1, arr, list);

        return Math.max(maxi2, maxi1);
    }

    private static boolean areAllCharactersUnique(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        String string1 = "aa";
        String string2 = "bb";
        
        List<String> arr = new ArrayList<>();
        arr.add(string1);
        arr.add(string2);
       // arr.add(string3);

        System.out.println(solve(0, arr, new ArrayList<>()));
    }
}
