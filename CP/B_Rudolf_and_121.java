import java.util.Scanner;

public class B_Rudolf_and_121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextInt();
            }

            for (int i = 1; i < n - 1; i++) {
                if (v[i - 1] <= v[i + 1] && v[i] >= 2 * v[i - 1]) {
                    v[i + 1] -= v[i - 1];
                    v[i] -= 2 * v[i - 1];
                    v[i - 1] = 0;
                }
            }

            boolean allZeros = true;
            for (int value : v) {
                if (value != 0) {
                    allZeros = false;
                    break;
                }
            }

            if (allZeros) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
