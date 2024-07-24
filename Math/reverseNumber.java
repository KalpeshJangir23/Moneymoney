package Math;

/**
 * reverseNumber
 */
public class reverseNumber {

    public static int reverse(int x) {
        long val = Math.abs(x);
        System.out.println(val);
        StringBuilder str = new StringBuilder(String.valueOf(val));
        System.out.println(str.toString());
        str.reverse();
        val = Integer.parseInt(str.toString());
        if (x < 0) {
            val = -1 * val;
        }
        return (int) val;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}