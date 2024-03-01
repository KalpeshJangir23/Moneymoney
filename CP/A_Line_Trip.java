
/**
 * A_Line_Trip
 */
import java.util.*;

public class A_Line_Trip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int start = 0;
            int prev = 0;
            for (int i = 0; i < n; i++) {
                
                prev = Math.max(prev, arr[i] - start);
                start = arr[i];
                
            }
            prev = Math.max(prev, 2*(x-start) );
            System.out.println(prev);
            t--;

        }
    }
}