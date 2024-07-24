import java.util.*;

public class FindWidth {

  public int[] findColumnWidth(int[][] grid) {
    int[] res = new int[grid[0].length];
    for (int j = 0; j < res.length; j++) {
      int maxlen = 0;
      for (int i = 0; i < grid.length; i++) {
        String s = grid[i][j] + "";
        if (maxlen < s.length()) {
          maxlen = s.length();
        }
      }
      res[j] = maxlen;
    }
    return res;
  }
  
}
