import java.util.*;

public class MinimumTimetomakeAropeColourfull {
    public static int minCost(String colors, int[] neededTime) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < colors.length(); i++) {
            list.add(colors.charAt(i));
        }
        int i = 0;
        int j = 1;
        int minTime = 0;
        while (i < j) {
            if (j == list.size() && list.get(i) != list.get(j)) {
                return minTime;
            }
            if (list.get(i) != list.get(j)) {
                i++;
                j++;
            } else {
                if (neededTime[i] < neededTime[j]) {
                    minTime = minTime + neededTime[i];
                    //System.out.println(minTime);
                    list.remove(i);
                    i++;

                } else {
                    minTime = minTime + neededTime[j];
                    //System.out.println(minTime);
                    list.remove(j);
                    j++;
                }
                
            }

        }
        return minTime;
    }

    public static void main(String[] args) {
        String colors = "aa";
        int[] neededTime = { 1, 2};
        System.out.println(minCost(colors, neededTime));
    }
}
