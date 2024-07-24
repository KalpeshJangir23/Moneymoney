package BinarySearch;

public class kokoeats {

  public static int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = 0;
    for (int i = 0; i < piles.length; i++) {
      high = Math.max(high, piles[i]);
    }
    System.out.println(high);

    while (low < high) {
      int mid = low + (high - low) / 2;
      int ans = timereq(piles, mid);
      if (ans <= h) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  private static int timereq(int[] nums, int val) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + (int) Math.ceil((double) nums[i] / (double) val);
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 6, 7, 11 };
    int h = 8;
    System.out.println(minEatingSpeed(nums, h));
  }
}
