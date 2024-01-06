package DP.Recursion.goodQuestion;

import java.util.*;

public class MaximumEarningFromTaxi {

    public static int find(int[][] rides, int start, int toFind) {
        int low = start;
        int high = rides.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (rides[mid][0] > toFind) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static long ans(int[][]rides, int i) {
        if (i >= rides.length) {
            return 0;
        }

        if (i < 0) {
            return 0;
        }

        int idx = find(rides, i + 1, rides[i][1]);
        long take = rides[i][1] - rides[i][0] + rides[i][2] + ans(rides, idx);
        long not_take = ans(rides, i + 1);

        return Math.max(take, not_take);
    }

    public static long maxTaxiEarnings(int n, int[][] rides) {
         Arrays.sort(rides, (a, b) -> Integer.compare(a[0], b[0]));

        return ans(rides, 0);
    }

 }