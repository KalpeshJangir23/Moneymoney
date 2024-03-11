
/**
 * B_Not_Dividing
 */
import java.util.*;
import static java.lang.Math.abs; //ease of calling

public class B_Not_Dividing {
    public static int sign(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n / abs(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // write code here
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    arr[i]++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i != n - 1) {
                    switch (sign(arr[i + 1] - arr[i])) {
                        case 0:
                            arr[i + 1]++;
                            break;
                        case -1:
                            break;
                        case 1:
                            if (arr[i] % 2 == 0) {
                                if (arr[i + 1] % 2 == 0) {
                                    arr[i + 1]++;
                                }
                            } else {
                                if (arr[i + 1] % arr[i] == 0) {
                                    arr[i + 1]++;
                                }
                            }
                            break;
                    }
                }
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
