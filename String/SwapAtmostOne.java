package String;

import java.util.*;

public class SwapAtmostOne {

  public static String getSmallestString(String s) {
    StringBuilder str = new StringBuilder(s);
    for (int i = 1; i < s.length(); i++) {
      int val = s.charAt(i) - '0';
      int val2 = s.charAt(i - 1) - '0';
      if (
        val < val2 &&
        (val % 2 != 0 && val2 % 2 != 0) ||
        (val % 2 == 0 && val2 % 2 == 0)
      ) {
        char temp = s.charAt(i - 1);
        str.setCharAt(i - 1, s.charAt(i));
        str.setCharAt(i, temp);
        break;
      }
    }
    return str.toString();
  }
  public static void main(String[] args) {
    System.out.println(getSmallestString("10"));
  }
}
