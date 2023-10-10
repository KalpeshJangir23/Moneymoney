import java.util.*;

public class tryout {
    public static int[] kthSmallestPairs(int[] arr, int k) {
        int n = arr.length;
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] pair = {arr[i], arr[j]};
                pairs.add(pair);
            }
        }

        Collections.sort(pairs, (a, b) -> {
            double divisionA = (double) a[0] / a[1];
            double divisionB = (double) b[0] / b[1];
            return Double.compare(divisionA, divisionB);
        });

        if (k <= pairs.size()) {
            return pairs.get(k - 1);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] result = kthSmallestPairs(arr, k);

        if (result != null) {
            System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No result found.");
        }
    }
}
