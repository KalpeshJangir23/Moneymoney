
public class findValidMatrix {

  public static  int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    int n = rowSum.length;
    int m = colSum.length;
    int[][] res = new int[n][m];
    int i = 0;
    int j = 0;
    while (i < n && j < m) {
      int val = Math.min(rowSum[i], colSum[j]);
      res[i][j] = val;
      if (rowSum[i] - val == 0) {
        rowSum[i] = 0;
        i++;
      }
      if (colSum[j] - val == 0) {
        colSum[j] = 0;
        j++;
      }
    }
      return res;
  }

  public static void main(String[] args) {
    int[] row = { 5, 7, 10 };
    int[] col = { 8, 6, 8 };
    System.out.println(restoreMatrix(row, col));
  }
}
