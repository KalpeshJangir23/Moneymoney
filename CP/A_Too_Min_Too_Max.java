import java.util.Arrays;
import java.util.Scanner;

/**
 * A_Too_Min_Too_Max
 */

public class A_Too_Min_Too_Max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int[] val = new int[n];
            for (int i = 0; i < n; i++) {
                int v = scanner.nextInt();
                val[i] = v;
            }
            Arrays.sort(val);
            int i = val[0];
            int j = val[n-2];
            int k = val[1];
            int l = val[n-1];
            int x =Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-l)  + Math.abs(l-i);
            System.out.println(x);
            t--;
        }
        scanner.close();
    }
}