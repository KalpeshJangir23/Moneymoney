package contest;

public class Q2 {
    public static int minimumOperationsToMakeEqual(int x, int y) {
        int count = 0;

        while (x != y) {
            if (x < y) {
                if (y % 11 == 0 && y / 11 >= x) {
                    y /= 11;
                } else if (y % 5 == 0 && y / 5 >= x) {
                    y /= 5;
                } else {
                    y--;
                }
            } else {
                if (x % 11 == 0 && x / 11 >= y) {
                    x /= 11;
                } else if (x % 5 == 0 && x / 5 >= y) {
                    x /= 5;
                } else {
                    x--;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 54;
        int y = 2;
        System.out.println(minimumOperationsToMakeEqual(x, y));
    }
}
