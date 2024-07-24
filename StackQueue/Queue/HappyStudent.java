package StackQueue.Queue;

import java.util.*;

public class HappyStudent {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int min = nums.get(0);
        int max = nums.get(nums.size() - 1);
        int sum = 0;
        int way = 2;
        while (!nums.isEmpty()) {
            if (nums.get(0) > max + 1) {
                break;
            } else {
                sum = sum + nums.remove(0);
            }
        }
        if (sum > max + 1) {
            way++;
        }

        return way;
    }
}
