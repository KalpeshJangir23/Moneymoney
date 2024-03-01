
/**
 * B_Longest_Divisors_Interval
 */
import java.util.*;

public class B_Longest_Divisors_Interval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextInt();
        while (t > 0) {
            Long n = scanner.nextLong();
            int maxSize = 0;
            

            for (int l = 1; l <= n; l++) {
                for (int r = l; r <= n; r++) {
                    boolean validInterval = true;
                    for (int i = l; i <= r; i++) {
                        if (n % i != 0) {
                            validInterval = false;
                            break;
                        }
                    }

                    if (validInterval && (r - l + 1) > maxSize) {
                        maxSize = r - l + 1;

                    }
                }
            }
            System.out.println(maxSize);
            t--;
        }

        scanner.close();
    }
}
