package DP.Recursion.Baap_Question;

public class laserBeam {
    static int countBeams(int r1, int r2, int count) {
        
    }

    public static int numberOfBeams(String[] bank) {
        int i = 0;
        int j = i + 1;
        int count = 0;
        while (j < bank.length) {
            int a = Integer.parseInt(bank[i]);
            int b = Integer.parseInt(bank[j]);
            int r1 = hammingWeight(a);
            int r2 = hammingWeight(b);
            if (r1 == 0) {
                i++;
                j++;
                break;
            }
            if (r2 == 0) {
                j++;
                break;
            }
            int c = r1 * r2;
            count = count + c;

        }
        return 0;
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

}
