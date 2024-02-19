
import java.util.*;

public class leastnumberofUnique {
    public int findLeastNumOfUniqueInts(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {

            if (map.containsKey(nums[j])) {
                map.put(nums[j], map.get(nums[j]) + 1);
            }
            else{
                map.put(nums[j],1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}