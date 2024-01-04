public class laserBeam {
    public static int numberOfBeams(String[] bank) {
        if (bank == null || bank.length < 2) {
            return 0; 
        }

        int count = 0;
        for (int i = 0; i < bank.length - 1; i++) {
            int r1 = Integer.parseInt(bank[i]);
            int r2 = Integer.parseInt(bank[i + 1]);
            
            int a = hammingWeight(r1);
            int b = hammingWeight(r2);
            
            if (a == 0 || b == 0) {
                continue;  
            }

            int c = r1 * r2;
            count += c;
        }
        return count;
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
        String[] bank = {"011001", "000000", "010100", "001000"};
        System.out.println(numberOfBeams(bank));
    }
}
