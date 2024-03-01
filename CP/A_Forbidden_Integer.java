import java.util.Scanner;

public class A_Forbidden_Integer {
    static final long INF = 1000000000000000000L;
    static final long MOD = 1000000007L;
    static Scanner scanner = new Scanner(System.in);
    public static void solve() {
        
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long x = scanner.nextLong();

        if (k == 1) {
            System.out.println("NO");
            return;
        }

        if (x != 1) {
            System.out.println("YES");
            System.out.println(n);
            for (long i = 0; i < n; i++)
                System.out.print("1 ");
            System.out.println();
            return;
        }

        if (n % 2 == 1 && k == 2) {
            System.out.println("NO");
            return;
        }

        if (n % 2 == 0) {
            System.out.println("YES");
            System.out.println(n / 2);
            for (long i = 0; i < n / 2; i++) {
                System.out.print("2 ");
            }
            System.out.println();
            return;
        }

        long tot = n / 2;

        System.out.println("YES");
        System.out.println(tot);

        for (long i = 0; i < n / 2 - 1; i++)
            System.out.print("2 ");

        System.out.println("3 ");
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve();
        }
    }
    
}
