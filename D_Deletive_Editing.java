import java.util.Arrays;
import java.util.Scanner;

public class D_Deletive_Editing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = scanner.nextLine();
            String tStr = scanner.nextLine();
            String ans = "";

            int[] a = new int[s.length()];
            Arrays.fill(a, 0);

            for (int i = 0; i < tStr.length(); i++) {
                int x = tStr.charAt(i) - 'A';
                a[x]++;
            }

            for (int i = s.length() - 1; i >= 0; i--) {
                int x = s.charAt(i) - 'A';
                if (a[x] > 0) {
                    ans += s.charAt(i);
                    a[x]--;
                }
            }

            ans = new StringBuilder(ans).reverse().toString();

            if (ans.equals(tStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
