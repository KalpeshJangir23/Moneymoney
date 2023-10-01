import java.util.*;

public class lc2679 {
    public static int matrixSum(int[][] mat) {
        int sum = 0;
        sortbyColumn(mat, mat[0].length - 1);
        for (int j = 0; j < mat[0].length; j++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < mat.length; i++) {
                pq.offer(mat[i][j]);
            }
           
            sum = sum + pq.peek();
        }
        return sum;

    }
    public static void sortbyColumn(int arr[][], int col)
    {
        
       
      Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col])); // increasing order
         
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 7, 2, 1 },
                { 6, 4, 2 },
                { 6, 5, 3 },
                { 3, 2, 1 },
        };
        System.out.println(matrixSum(mat));

    }
}
