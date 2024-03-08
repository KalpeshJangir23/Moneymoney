
/**
 * D_Balanced_Round
 */
import java.util.*;

public class D_Balanced_Round {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int count = 1;
            int ans = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                arr[i] = val;
            }
            Arrays.sort(arr);
            for (int i = 0; i < n - 1; i++) {
                if ((arr[i + 1] - arr[i]) > k) {
                    ans = Math.max(ans, count);
                    count = 1;
                } else {
                    count++;
                }
            }
            ans = Math.max(ans, count);

            System.out.println(n - ans);

            t--;
        }
        scanner.close();
    }
}