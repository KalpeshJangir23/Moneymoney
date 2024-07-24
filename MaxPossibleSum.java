import java.util.*;

public class MaxPossibleSum {
    public static int minimumPossibleSum(int n, int target) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int j = 1;
        boolean big = false;
        while (n > 0) {
            if (!list.contains(j) && !big) {
                sum = sum + j;
                System.out.println(sum);
                list.add(target - j);
                System.out.println(list);
                n--;
            }
            if (list.contains(0)) {
                System.out.println(list);
                j = target + 1;
                big = true;
            }

            if (big && n > 0 ) {
                sum = sum + j;
                n--;
            }
            j++;

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 16;
        int target = 6;
        System.out.println(minimumPossibleSum(n, target));
    }
}
