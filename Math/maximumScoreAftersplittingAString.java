package Math;
import java.util.ArrayList;

public class maximumScoreAftersplittingAString {

    public static int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            right.add(s.charAt(i) - '0');
        }

        for (int i = 1; i < right.size(); i++) {
            ArrayList<Integer> left = new ArrayList<>(right.subList(0, i));
            ArrayList<Integer> tempRight = new ArrayList<>(right.subList(i, right.size()));

            int countLeft = i - countOnes(left);
            int countRight = countOnes(tempRight);
            int sum = countLeft + countRight;

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static int countOnes(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "1111";
        System.out.println(maxScore(s));
    }
}
