/**
 * A_Goals_of_Victory
 */
import java.util.*;
public class A_Goals_of_Victory {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
  int t = scanner.nextInt();

  while (t-- > 0) {
      int n = scanner.nextInt();
      int[] a = new int[n];

      for (int i = 0; i < n - 1; i++) {
          a[i] = scanner.nextInt();
      }

      int sum = 0;
      for (int i = 0; i < n - 1; i++) {
          sum += a[i];
      }

      System.out.println(-sum);
  }

  scanner.close();
    }
}