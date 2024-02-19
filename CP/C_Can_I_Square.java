import java.util.Scanner;

public class C_Can_I_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            long sum = 0;
            long tem;
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum += a[i];
            }

            tem = (long) Math.sqrt(sum);

            if (tem * tem == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
