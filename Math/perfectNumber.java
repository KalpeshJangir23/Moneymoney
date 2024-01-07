package Math;

public class perfectNumber {
    public static int solve(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (detailWithdigit(i) || i < 10) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean detailWithdigit(int n) {
        if (n < 10) {
            return true;
        }

        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || temp % digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 4;
        int end = 44;
        System.out.println(solve(start, end));
    }
}
