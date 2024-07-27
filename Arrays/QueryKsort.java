package arrays;

import java.util.*;

public class QueryKsort {

    static class Element {
        String trimmedValue;
        int originalIndex;

        Element(String trimmedValue, int originalIndex) {
            this.trimmedValue = trimmedValue;
            this.originalIndex = originalIndex;
        }
    }

    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0];
            int trim = queries[i][1];
            
            List<Element> trimmedList = new ArrayList<>();
            
            for (int j = 0; j < nums.length; j++) {
                String trimmedValue = nums[j].substring(nums[j].length() - trim);
                trimmedList.add(new Element(trimmedValue, j));
            }
            
            trimmedList.sort((a, b) -> {
                int cmp = a.trimmedValue.compareTo(b.trimmedValue);
                if (cmp == 0) {
                    return Integer.compare(a.originalIndex, b.originalIndex);
                }
                return cmp;
            });
            
            result[i] = trimmedList.get(k - 1).originalIndex;
        }
        
        return result;
    }

    public static void main(String[] args) {
        String[] nums = { "24", "37", "96", "04" };
        int[][] queries = { { 2, 1 }, { 2, 2 } };
        System.out.println(Arrays.toString(smallestTrimmedNumbers(nums, queries)));
    }
}
