package DP;


public class longestIncreasingSubSequence {
    // ! Important [4,10,4,3,8,9] exception point idhar aake nahi hoga
    // ! kyu ki sequence mai [4,4.. ] aisa hoga and ye wrong hai

    // -- public static int lengthOfLIS(int[] nums) {
    // --     int count=1;
    // --     int index =0;
    // --   while (index != nums.length-1 && index+1 <= nums.length) {
    // --           if (nums[index] < nums[index+1]) {
    // --                 count++;
    // --           }
    // --         index = index + 1;
    // --     }
    // --  return count ;

    // -- }
    public static void main(String[] args) {
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        //System.out.println(lengthOfLIS(nums));

    }

}
