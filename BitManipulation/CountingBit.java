package BitManipulation;

public class CountingBit {
    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = hammingWeight(i);
        }
        return result;
    }
    public static int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                res += 1;
            }
        }
        return res;        
    }
    public static void main(String[] args) {
        int n = 5;
        int[] res = countBits(n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
