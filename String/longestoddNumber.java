
package String;

/**
 * longestoddNumber
 */
public class longestoddNumber {

    public static String largestOddNumber(String num) {
        // -- Chutiya hai tu
        // int check = Integer.parseInt(s);
        // if (check % 2 != 0) {
        // return s;
        // }

        // int max = Integer.MIN_VALUE;
        // int lastindex = -1;
        // for (int i = s.length()-1; i >= 0; i--) {
        // char charDigit = s.charAt(i);
        // int intValue = Character.getNumericValue(charDigit);
        // if (lastindex == -1 && intValue % 2 != 0) {
        // lastindex = i;
        // }

        // if (intValue % 2 != 0 && intValue > max) {
        // max = intValue;
        // }

        // }
        // System.out.println(lastindex);
        // String sub = s.substring(0, lastindex+1);
        // int finalCheck = Integer.parseInt(sub);
        // if (finalCheck > max) {
        // return sub;
        // }
        // return max == Integer.MIN_VALUE ? " " : Integer.toString(max);

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";

    }

    public static void main(String[] args) {
        String s = "1013380";
        System.out.println(largestOddNumber(s));
    }
}