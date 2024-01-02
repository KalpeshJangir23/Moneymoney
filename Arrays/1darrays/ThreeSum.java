import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
           // Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            Map<List<Integer>, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            Collections.sort(list);
                            if (map.containsKey(list)) {
                                break;
                            } else {
                                map.put(list,1);
                                result.add(list);
                            }
                        }
                    }
                }
            }
            long max = Integer.MIN_VALUE;
            System.out.println(result.size());
            return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }

}
