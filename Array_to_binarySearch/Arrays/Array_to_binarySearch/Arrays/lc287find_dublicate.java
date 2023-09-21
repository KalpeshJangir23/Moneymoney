package Array_to_binarySearch.Arrays;

import java.util.Arrays;

class lc287find_dublicate {
    public static int findDuplicate(int[] nums) {
        int i =  0;
        int ans  = 0;
        Arrays.sort(nums);
        while (i+1 < nums.length) {
            if (nums[i] == nums[i+1]) {
                ans = nums[i];
                
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }    
}
