public class SortByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[start] = nums[i];
                start++;
            } else {
                ans[end] = nums[i];
                end--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] ans = sortArrayByParity(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
