package DP;
import java.util.*;
public class maximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxi =Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = 0;
            for (int j = i; j < nums.length; j++) {
                 
                product = product * nums[j];

            }
            if (product > maxi) {
                maxi = product;
            }
        }
        return maxi;
    }
    
}
