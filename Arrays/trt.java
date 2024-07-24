package arrays;

import java.util.*;

public class trt {

  public static List<Long> freqqy(Map<Integer, Integer> fm) {
    List<Long> fvc = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : fm.entrySet()) {
      fvc.add((long) entry.getValue());
    }
    return fvc;
  }

  public static long cmm(List<Long> fv) {
    long max = 0;
    long sum = 0;
    for (int i = 1; i <= fv.size(); ++i) {
      sum += fv.get(i - 1);
      long value = (sum / i) * i;
      max = Math.max(max, value);
    }
    return max;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long[] list = new long[(int) n];
      Map<Integer, Integer> hmap = new HashMap<>();
      for (int i = 0; i < n; ++i) {
        list[i] = sc.nextLong();
        hmap.put((int) list[i], hmap.getOrDefault((int) list[i], 0) + 1);
      }
      List<Long> fvv = freqqy(hmap);
      Collections.sort(fvv, Collections.reverseOrder());

      long maximumK = cmm(fvv);
      System.out.println(maximumK);
    }
    sc.close();
  }
}
