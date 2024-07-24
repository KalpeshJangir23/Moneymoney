package PrefixSum;

import java.util.*;

public class TrappingTheRainWater {
    public int trap(int[] height) {
        int count = 0;
        int n = height.length;
        int[] maxl = new int[n];
        maxl[0] = height[0];
        int[] maxR = new int[n];
        for (int i = 1; i < maxl.length; i++) {
            maxl[i] = Math.max(height[i], maxl[i - 1]);
        }
        maxR[maxR.length - 1] = 0;
        for (int i = maxR.length - 2; i > 0; i--) {
            maxR[i] = Math.max(height[i], maxl[i + 1]);
        }
        for (int i = 0; i < maxR.length; i++) {
            int val = 0;
            val = Math.min(maxR[i], maxl[i]) - height[i];
            if (val > 0) {
                count += val;
            }
        }
        return count;
    }
}
