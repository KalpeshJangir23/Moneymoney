import java.util.*;

public class A_Doremy_s_Paint_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t > 0) {
            solve();
            t--;
        }
        scanner.close();  // Close the Scanner at the end to avoid resource leak
    }

    static void solve() {
        int n = scanner.nextInt();
        long[] arr = new long[n];
        Set<Long> secret = new HashSet<>();
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            secret.add(arr[i]);
        }

        Arrays.sort(arr);

        if (secret.size() > 2) {
            System.out.println("No");
        } else if (secret.size() == 1) {
            System.out.println("Yes");
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] == arr[0]) {
                    cnt1++;
                }
                if (arr[i] == arr[n - 1]) {
                    cnt2++;
                }
            }
            if (cnt1 == cnt2 || Math.abs(cnt1 - cnt2) == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
