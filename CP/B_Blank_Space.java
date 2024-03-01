
/**
 * B_Blank_Space
 */
import java.util.*;

public class B_Blank_Space {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int maxZeros = 0;
            int currentZeros = 0;
            for (int i = 0; i < n; i++) {
                int a= scanner.nextInt();
                if (a == 0) {
                    currentZeros++;
                    maxZeros = Math.max(maxZeros, currentZeros);
                }
                else{
                    currentZeros = 0;
                }
            }
            System.out.println(maxZeros);

            t--;
        }
        scanner.close();
    }
}