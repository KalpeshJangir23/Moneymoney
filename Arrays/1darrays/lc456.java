
public class lc456 {

    public static boolean find132pattern(int[] nums) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    if (nums[i] < nums[k]  && nums[k] < nums[j]) {
                        found = true;
                        break;
                    } 
                }
            }
        }

        return found;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,4,2};
        System.out.println(find132pattern(nums));
    }
}
