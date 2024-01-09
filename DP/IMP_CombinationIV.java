package DP;

import java.util.*;

public class IMP_CombinationIV {


        public static int combinationSum4(int[] nums, int target) {
         
            int [] dp = new int [target+1];
            for(int i=0; i<target+1; i++){
                dp[i] = -1;
            }
               int ans = solve(nums,target,dp);
            return ans;
        }
      static  int solve(int [] nums,int target,int [] dp){
            if(target<0){
                return 0;
            }
            if(target ==0){
                return 1;
            }
            if(dp[target]!= -1){
                    return dp[target];
            }
            int ans =0;
            for(int i=0; i<nums.length; i++){
                
                ans += solve(nums,target-nums[i],dp);
                
            }
            dp[target] = ans;
            return dp[target];
        }
        
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int target = 4;
        System.out.println(combinationSum4(nums, target));
    }

}
