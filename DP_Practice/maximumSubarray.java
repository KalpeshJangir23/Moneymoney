package DP_Practice;

public class maximumSubarray {
    // Driver Code
    public static void main(String[] args) {
        int[] a = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        maxSubArraySum(a, k);
    }

    // Function Call
    static void maxSubArraySum(int a[], int k) {
        int n = a.length;
        int sum = 0;
        int maxVal;

        for (int i = 0; i <= n - k; i++) {
            maxVal = a[i];
            for (int j = 1; j < k; j++) {
                if (a[i + j] > maxVal) {
                    maxVal = a[i + j];
                }
            }
            for (int j = 0; j < k && (i + j) < n; j++) {
                a[i + j] = maxVal;
                sum += a[i + j];
            }
        }
        System.out.println(sum);
    }
}
