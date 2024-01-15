package Math;

public class MinimumMovetoCaptureQueen {
    public static int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if ((a == c && c == e) || (b == d && d == f)) {
            return 2;
        }
                if (areAllEvenOrOdd(c, d, e, f) && (c != e || d != f)) {
                    return 1;
                }
                if (areAllEvenOrOdd(c, d, e, f) && (c == e || d == f)) {
                    return 2; 
                }
                if (a == e || b == f) {
                    return 1; 
                }
                return 2; 
            }

    public static boolean areAllEvenOrOdd(int... numbers) {
        boolean allEven = true;
        boolean allOdd = true;

        for (int num : numbers) {
            if (num % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
            }
        }

        return allEven || allOdd;
    }
    class Solution {
        public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
            if(a == e || b == f) {
                if(a == e && a == c && ((d-b) * (d-f) < 0)) return 2;
                if(b == f && b == d && ((c-a) * (c-e) < 0)) return 2;
                return 1;
            }
            if(Math.abs(c - e) == Math.abs(d - f)) {
                if(Math.abs(c - a) == Math.abs(d - b) && ((b-f) * (b-d) < 0))  return 2;
                return 1;
            }
            return 2;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 4;
        int e = 1;
        int f = 8;
        System.out.println(minMovesToCaptureTheQueen(a, b, c, d, e, f));
    }
}
