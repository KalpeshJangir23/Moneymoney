package BitManipulation;

public class MaxinXor {
    public int maximumXorProduct(long a, long b, int n) {
        int mod = 1000_000_000 + 7;
        long xorA = 0;
        long xorB = 0;

        for (long i = 49; i >= n; i--) {
            boolean a_ith_bit = ((a >> i) & 1) > 0; // true hua mean set else 0
            boolean b_ith_bit = ((b >> i) & 1) > 0;
            if (a_ith_bit) {
                xorA = (xorA ^ (1 << i));

            }
            if (b_ith_bit) {
                xorB = (xorB ^ (1 << i));
            }

        }

        for (int i = n - 1; i >= 0; i--) {
            boolean a_ith_bit = ((a >> i) & 1) > 0; // true hua mean set else 0
            boolean b_ith_bit = ((b >> i) & 1) > 0;

            if (b_ith_bit == a_ith_bit) {
                xorA = xorA ^ (1 << i);
                xorB = xorB ^ (1 << i);
                continue;
            }

            if (xorA > xorB) {
                xorB = xorB ^ (1 << i);
            } else {
                xorA = xorA ^ (1 << i);
            }

        }
        int axorx = (int) (xorA % mod);
        int bxorx = (int) (xorB % mod);
        return axorx * bxorx;
    }
}
