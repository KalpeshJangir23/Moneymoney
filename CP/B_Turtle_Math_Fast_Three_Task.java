
/**
 * B_Turtle_Math_Fast_Three_Task
 */
import java.util.*;

public class B_Turtle_Math_Fast_Three_Task {
    static void solve(int[] arr, int sum , int n) {
        if (sum % 3 == 0) {
            System.out.println(0);
            return;
        }
        if (sum % 3 == 2) {
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n; i++) {
            int temp = sum - arr[i];
            if (temp % 3 == 0) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                arr[i] = val;
                sum += val;

            }
          
            solve(arr, sum, n);
            t--;
        }
        scanner.close();
    }
}