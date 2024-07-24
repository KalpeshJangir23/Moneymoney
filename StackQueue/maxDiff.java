package StackQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class maxDiff {
    public static int minDifference(int[] nums) {
        if (nums.length < 4) {
            return 0; 
        }
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            pQueue.add(num);
        }

        pQueue.poll();
        pQueue.poll();
        pQueue.poll();

        int min1 = Integer.MAX_VALUE;
        int min2 = 0;
        
        while (!pQueue.isEmpty()) {
            int current = pQueue.poll();
            if (min1 > current) {
                min2 = min1;
                min1 = current;
            }
        }
        
        if (min1 == Integer.MAX_VALUE) {
            return 0;
        }
        
        return Math.abs(min2 - min1);
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4};
        System.out.println(minDifference(nums)); // Output: 1
    }
}
