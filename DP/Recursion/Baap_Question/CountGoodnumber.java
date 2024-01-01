package DP.Recursion.Baap_Question;

public class CountGoodnumber {
    static long mod = 1000000007;

    static long power(long x, long y) {
        if (y == 0) {
            return 1;
        }

        long ans = power(x, y / 2);
        ans = (ans * ans) % mod;

        if (y % 2 != 0) {
            ans = (ans * x) % mod;
        }

        return ans;
    }

    public static int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n / 2 + n % 2;
        return (int) ((power(5, even) * power(4, odd)) % mod);
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(countGoodNumbers(n));
    }
}
