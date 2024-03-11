import java.util.Arrays;
import java.util.Scanner;

public class C_Array_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            Arrays.sort(a);

            long ans = -1;

            if (k == 1) {
                ans = a[0];
                for (int i = 1; i < n; i++) {
                    ans = Math.min(ans, a[i] - a[i - 1]);
                }

                System.out.println(ans);
            } else if (k == 2) {
                ans = a[0];
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        long val = Math.abs(a[j] - a[i]);

                        ans = Math.min(ans, val);

                        int indx = -1;
                        int low = 0, high = n - 1;
                        while (low <= high) {
                            int mid = low + (high - low) / 2;
                            if (a[mid] >= val) {
                                indx = mid;
                                high = mid - 1;
                            } else {
                                low = mid + 1;
                            }
                        }

                        if (indx == -1) {
                            ans = Math.min(ans, val - a[n - 1]);
                        } else {
                            ans = Math.min(ans, a[indx] - val);
                        }

                        if (indx == 0) {
                            ans = Math.min(ans, a[0] - val);
                        } else {
                            ans = Math.min(ans, Math.abs(val - a[indx - 1]));
                        }
                    }
                }

                System.out.println(ans);
            } else if (k > 2) {
                System.out.println(0);
            }
        }
    }
}
