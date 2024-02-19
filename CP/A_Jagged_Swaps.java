import java.util.Arrays;
import java.util.Scanner;

public class A_Jagged_Swaps {
    static Scanner scanner = new Scanner(System.in);

    static void solve() {
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("YES");
        } else {
            for (int j = 1; j <= 9; j++) {
                for (int i = 1; i < n - 1; i++) {
                    if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }

            if (isSorted(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve();
        }
    }
}
