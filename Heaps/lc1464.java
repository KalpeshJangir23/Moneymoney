package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class lc1464 {
    public static int maxProduct(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(i<j){
                int ans = (nums[i] -1) * (nums[j] -1);
                queue.offer(ans);
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,2}
        ;
        System.out.println(maxProduct(nums));
    }
}
