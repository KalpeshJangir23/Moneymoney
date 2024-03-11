public class maxOperation {
    public static int maxOperations(int[] nums) {
        int n = nums.length;
        int len = nums[0] + nums[1];
        int count = 1;
        if (n > 2) {
            for (int i = 2; i < n - 1; i = i + 2) {
                if (nums[i + 1] + nums[i] == len) {
                    count++;

                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 1 };
        System.out.println(maxOperations(nums));
    }
}