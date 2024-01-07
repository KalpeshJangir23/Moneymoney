package contest;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static int longestConsecutiveSequence(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }
        
        int longestStreak = 0;
        int longestStart = 0;
        
        for(int num : numSet) {
            if(!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                while(numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                if(currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                    longestStart = num;
                }
            }
        }
        
        List<Integer> longestSequence = new ArrayList<>();
        int sum = 0;
        for (int i = longestStart; i < longestStart + longestStreak; i++) {
            longestSequence.add(i);
            sum += i;
        }
        int ans = -1;
        while (ans == -1) {
            if (!numSet.contains(sum)) {
                ans = sum;
            }
            else{
                sum++;
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
       // Q2 solution = new Q2();
        int[] nums = {3,4,5,1,12,14,13};
        System.out.println(longestConsecutiveSequence(nums));
        //List<Integer> longestSequence = solution.longestConsecutiveSequence(nums);
        
       // System.out.println("Longest consecutive sequence: " + longestSequence);
    }
}
