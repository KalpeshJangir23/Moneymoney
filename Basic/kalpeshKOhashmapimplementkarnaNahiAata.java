package Basic;

import java.util.*;

public class kalpeshKOhashmapimplementkarnaNahiAata {
    public static void main(String[] args) {
        int[] nums = new int[4];
        HashMap<Integer, Integer> tmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tmap.containsKey(nums[i])) {
                tmap.put(nums[i], tmap.get(nums[i]) + 1);
            } else {
                tmap.put(nums[i], 1);
            }
        }
    }
}
