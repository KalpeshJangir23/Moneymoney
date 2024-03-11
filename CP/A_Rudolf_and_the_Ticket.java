import java.util.*;

public class A_Rudolf_and_the_Ticket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] b1 = new int[n];
            int[] c1 = new int[m];
            
            for (int i = 0; i < n; i++) {
                b1[i] = scanner.nextInt();
            }
            
            for (int i = 0; i < m; i++) {
                c1[i] = scanner.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                int val1 = b1[i];
                for (int j = 0; j < m; j++) {
                    int val2 = c1[j];
                    if (val1 + val2 <= k) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            t--;
        }
        scanner.close();
    }

}
