import java.util.*;

/**
 * MaxRowMinCol
 *
 */

public class MaxRowMinCol {

  public static List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> list = new ArrayList<>();
    List<Integer> minlist = new ArrayList<>();
    List<Integer> maxlist = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
     
      for (int j = 0; j < matrix[0].length; j++) {
        min = Math.min(min, matrix[i][j]);
      }
      minlist.add(min);

      for (int j = 0; j < matrix.length; j++) {
        max = Math.max(max, matrix[j][i]);
      }
      maxlist.add(max);
      System.out.println(maxlist);
      if (maxlist.contains(min) && minlist.contains(max)) list.add(max);
    }
    return list;
  }

  public static void main(String[] args) {
    int[][] nums = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
    System.out.println(luckyNumbers(nums));
  }
}
