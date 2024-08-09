package DP_Practice;

public class Mintiime_toMake_RopeColorFull {

  public int minCost(String colors, int[] neededTime) {
    int time = 0;
    int n = colors.length();
    StringBuilder str = new StringBuilder(colors);
    for (int i = 1; i < neededTime.length; i++) {
      while (str.charAt(i) == '0' && i < n) {
        i++;
      }
      while (str.charAt(i - 1) == '0' && i < n) {
        i++;
      }
      if (str.charAt(i) == str.charAt(i - 1)) {
        if (neededTime[i] <= neededTime[i - 1]) {
          time += neededTime[i];
          str.setCharAt(i, '0');
        } else {
          time += neededTime[i - 1];
          str.setCharAt(i - 1, '0');
        }
      }
    }
    System.out.println(str.toString());
    return time;
  }
}
