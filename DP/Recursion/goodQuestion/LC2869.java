package DP.Recursion.goodQuestion;
import java.util.*;
public class LC2869 {
    static HashSet<Integer> set = new HashSet<>();
    public static int minOperations(List<Integer> nums, int k) {
        int index = nums.size() - 1;
        return countOperation(nums, 0, k, index);
    }

    public static int countOperation(List<Integer> nums, int count, int k, int index) {
        if (nums.isEmpty())
            return count;
        
        if (nums.get(index) > k) {
            count++;
            nums.remove(index);
        } else if (nums.get(index) <= k) {
            count++;
            set.add(nums.get(index));
            nums.remove(index);
        }

        if (isTrue(set, k)) {
            return count;

        }
        System.out.println(set);
        
    return countOperation(nums, count, k, index - 1);
       
    }

    static boolean isTrue(Set<Integer> list, int k) {
        boolean containsOnly1ToK = true;
        for (Integer num : list) {
            if (num < 1 || num > k) {
                containsOnly1ToK = false;
                break;
            }
        }
        return containsOnly1ToK;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 5, 4, 2));
        System.out.println(minOperations(list, 3));
    }
}
