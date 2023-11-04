package Sliding_Window;

/**
 * MaximumAverage
 */
public class MaximumAverage {

    public static void main(String[] args) {
        int arr[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double max_average = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int sum = 0;
        while (j < arr.length) {
            sum = sum + arr[j]; // Always add the current element to the sum.

            if (j - i + 1 == k) {
                double average = (double) sum / k; // Cast to double to get the correct average.
                if (average > max_average) {
                    max_average = average;
                }
                sum = sum - arr[i]; // Remove the element at the start of the window.
                i++;
            }
            j++;
        }

        System.out.println(max_average);
    }
}
