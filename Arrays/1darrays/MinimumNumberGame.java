import java.util.*;
public class MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
     Arrays.sort(nums);
     int[] arr = new int[nums.length];
        int alice = 0;
        int bob = 1;
        int i = 0;
        while (bob < nums.length) {
            arr[i] = nums[bob];
            arr[i + 1] = nums[alice];
            alice = alice + 2;
            bob += 2;
            i+=2; 
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        int[] arr = numberGame(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
