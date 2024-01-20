package contest;

import java.util.Arrays;

public class BitQuestion {

    public static boolean canSortArray(int[] nums) {
        int[] setBit = new int[nums.length];
        for (int i = 0; i < setBit.length; i++) {
            setBit[i] = Integer.bitCount(nums[i]);
        }
        

        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);

        for (int i = 0; i < setBit.length ; i++) {
            for (int j = 0; j < setBit.length - 1 - i; j++) {
                if (setBit[i] == setBit[j]) {
                    
                    if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    }
                    
                }
            }
        }
        
        return Arrays.equals(nums, arr);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(canSortArray(nums));  // Output: true
    }
}
