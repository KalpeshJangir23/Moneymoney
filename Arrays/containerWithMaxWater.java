package arrays;

public class containerWithMaxWater {
    public static int maxArea(int[] height) {
        int s = 0;
        int e = height.length - 1;
        int area = Integer.MIN_VALUE;
        while (e > s) {
            int min = Math.min(height[s], height[e]);
            int dist = e - s;
            area = Math.max(area, dist * min);
            if (height[e] > height[s]) {
                s++;
            } else {
                e--;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
