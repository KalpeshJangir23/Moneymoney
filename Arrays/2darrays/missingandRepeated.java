import java.util.*;

public class missingandRepeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] val = new int[grid.length * grid.length];
        Arrays.fill(val, 0);
        int i =7 ;
        while (i < grid.length) {
            int[] check = grid[i];
            for (int element : check) {
                val[element]++;
            }
            i++;
        }

        int[] ans = new int[2];
        for (int j = 1; j < val.length; j++) {
            if (val[j] == 0) {
                ans[1] = val[j];

            }
            if (val[j] == 2) {
                ans[0] = val[j];
            }
        }
        return ans;
    }
}
