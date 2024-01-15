package hashMap;
import java.util.*;
public class CountElementWithMaxFreq {
    public static int maxFrequencyElements(int[] nums) {
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (mp.containsKey(nums[i])) 
            {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } 
            else
            {
                mp.put(nums[i], 1);
            }
        }
        int maxi = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
           if (entry.getValue() > maxi) {
            maxi = entry.getValue();
           }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if (entry.getValue() == maxi) {
                count = count + entry.getValue();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }

    
}
