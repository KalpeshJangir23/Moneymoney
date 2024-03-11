
/**
 * B_Make_It_Increasing
 */
import java.util.*;

public class B_Make_It_Increasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                arr[i] = val;
            }
            solve(arr, n);

            t--;
        }
        scanner.close();
    }

    static void solve(int[] arr, int n) {
        int count = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i + 1] == 0) {
                System.out.println(-1);
                return;
            }
            while (arr[i] >= arr[i + 1]) {
                arr[i] = arr[i] / 2;
                count++;
            }

        }
        System.out.println(count);
    }
}