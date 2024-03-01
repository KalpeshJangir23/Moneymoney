import java.util.Scanner;

public class A_Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong(); // value to represent
            long k = scanner.nextLong(); // denomination of the second type of coin

            if (canRepresentCoins(n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean canRepresentCoins(long n, long k) {
        if (n % 2 == 0) {
            // If n is even, it is always possible to represent in coins
            return true;
        } else if (k % 2 == 0) {
            // If k is even, check if (n - k) is even
            return (n - k) % 2 == 0;
        } else {
            // If k is odd, check if (n - 2*k) is even
            return (n - 2 * k) % 2 == 0;
        }
    }
}
