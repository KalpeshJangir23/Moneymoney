/**
 * A_United_We_Stand
 */
public class A_United_We_Stand {

    public static void main(String[] args) {

        int cj = 8;
        int bi = 4;

        boolean result = isDivisor(cj, bi);

        if (result) {
            System.out.println(cj + " is a divisor of " + bi);
        } else {
            System.out.println(cj + " is not a divisor of " + bi);
        }
    }

    private static boolean isDivisor(int cj, int bi) {
        return bi % cj == 0;
    }
}