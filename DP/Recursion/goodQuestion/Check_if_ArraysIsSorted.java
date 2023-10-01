package DP.Recursion.goodQuestion;

public class Check_if_ArraysIsSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(isSorted(0, nums));
        
    }


    static boolean isSorted(int index , int[] nums){
        if (index == nums.length-1){
            return true;
        }

        return nums[index] < nums[index+1] && isSorted(index+1, nums);
    }
}
