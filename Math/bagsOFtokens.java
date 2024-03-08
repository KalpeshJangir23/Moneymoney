package Math;

import java.util.*;

public class bagsOFtokens {
    public static int bagOfTokensScore(int[] tokens, int power) {
        int result = 0;
        int n = tokens.length;
        if (n == 0) {
            return 0;
        }
        

        int i = 0;
        int j = n - 1;
        int currScore = 0;
        int max = 0;

        if (tokens[0] > power) {
            return 0;
        }
        Arrays.sort(tokens);
        while (i <= j) {
            // ** face Up
            if (power >= tokens[i]) {
                power = power - tokens[i];
                currScore++;
                i++;
            } else if (currScore >= 1 && power <= tokens[n - 1]) {
                power = power + tokens[j];
                currScore--;
            }
            

            max = Math.max(max, currScore);
        }
        max = Math.max(max, currScore);
        return max;
    }

    public static void main(String[] args) {
        int[] token = { 100, 200, 300, 400 };
        int power = 200;
        System.out.println(bagOfTokensScore(token, power));
    }
}
