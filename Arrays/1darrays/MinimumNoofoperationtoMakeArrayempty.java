import java.util.HashMap;
import java.util.Map;

public class MinimumNoofoperationtoMakeArrayempty {
    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> tmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (tmap.containsKey(nums[i])) {
                tmap.put(nums[i], tmap.get(nums[i]) + 1);
            } else {
                tmap.put(nums[i], 1);
            }
        }
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : tmap.entrySet()) {

            if (entry.getValue() == 1) {
                return -1;
            }
            if (entry.getValue() % 3 == 0) {
                int val = entry.getValue() / 3;
                 int check = noWhichisNotdivisbleby2and3(entry.getValue());
                int min = Math.min(val, check);
                count += min;
            } else if (entry.getValue() % 2 == 0) {
                int val = entry.getValue() / 2;
                int check = noWhichisNotdivisbleby2and3(entry.getValue());
                int min = Math.min(val, check);
                count += min;
            } else {
                count += noWhichisNotdivisbleby2and3(entry.getValue());
            }
        }
        return count;
    }

    static int noWhichisNotdivisbleby2and3(int num) {
        int countNondiv = 0;
        int count = 0;
        while (num % 3 != 0) {
            num -= 2;
            countNondiv++;
            if (num < 0) {
                return -1;
            }
        }
        count += countNondiv + num / 3;
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12 };
        System.out.println(minOperations(nums));
    }
}
