package BitManipulation;

import java.util.*;

public class SumOfValuewithKsetBits {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int val = k;
            int j = i;
            while (j != 0) {

                if ((j & 1) == 1) {
                    val--;
                }
                j >>= 1;

            }
            if (val == 0) {
                sum = sum + nums.get(i);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 10, 1, 5, 2);
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(list, k));

    }

}
