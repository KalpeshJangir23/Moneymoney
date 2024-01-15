package Math;

import java.util.*;
public class MaxSetAfterRemoval {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int x : nums1) {
            s1.add(x);
        }
        for (int x : nums2) {
            s2.add(x);
        }
        HashSet<Integer> common = new HashSet<>(s1);
        common.retainAll(s2);
        int n = nums1.length, n1 = s1.size(), n2 = s2.size(), c = common.size();
        return Math.min(n, Math.min(n1 - c, n / 2) + Math.min(n2 - c, n / 2) + c);
    }
}