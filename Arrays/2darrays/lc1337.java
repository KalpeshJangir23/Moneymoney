import java.util.HashMap;

public class lc1337 {

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] rows = new int[k];

        // (row no / Count )
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < mat.length; i++) {
            // i => Iterating over all 1-D arrays in 2-D array
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                // j => Printing all elements of ith row
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            hmap.put(i, count);
        }

        int i = 0;
        while (i < k) {
            int keyToRemove = -1;
            int smallestValue = Integer.MAX_VALUE;

            for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
                int value = entry.getValue();
                if (value < smallestValue) {
                    smallestValue = value;
                    keyToRemove = entry.getKey();
                }
            }

            rows[i] = keyToRemove;
            hmap.remove(keyToRemove);
            i++;
        }

        return rows;
    }

    public static void main(String[] args) {
        int[][] mat = {
            { 1, 1, 0, 0, 0 },
            { 1, 1, 1, 1, 0 },
            { 1, 0, 0, 0, 0 },
            { 1, 1, 0, 0, 0 },
            { 1, 1, 1, 1, 1 }
        };
        int k = 3;
        int[] arr = kWeakestRows(mat, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
