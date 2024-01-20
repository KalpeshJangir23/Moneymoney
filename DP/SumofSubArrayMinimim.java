package DP;
import java.util.*;

public class SumofSubArrayMinimim {
    public static final int MODULO = 1000000007;
    public static int printContiguousSubsequences(int[] nums){
        List<Integer> list =  print(nums,new ArrayList<>());
        int sum = 0;
         for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum % MODULO;
    }

    static List<Integer> print(int[] nums, List<Integer> list){
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                List<Integer> subsequence = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subsequence.add(nums[i]);
                }
                Collections.sort(subsequence);
                list.add(subsequence.get(0));
                
            }
        }   
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(printContiguousSubsequences(nums));
    }
}
