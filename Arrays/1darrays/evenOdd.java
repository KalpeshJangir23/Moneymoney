
/**
 * evenOdd
 */
import java.util.*;

public class evenOdd {

    public static int[] sortEvenOdd(int[] nums) {
        List<Integer> elist = new ArrayList<>();
        List<Integer> olist = new ArrayList<>();
        int left = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                elist.add(nums[i]);
            } else {
                olist.add(nums[i]);
            }
        }
        Collections.sort(elist);
        Collections.sort(olist, Collections.reverseOrder());
        int[] result = new int[nums.length];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < result.length; i++) {
            if (nums[i] % 2 == 0 && even < elist.size()) {
                result[i] = elist.get(even);
                even++;
            }
            else{
            result[i] = olist.get(odd);
            odd++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 3 };
        int[] ad = sortEvenOdd(nums);
        for (int i = 0; i < ad.length; i++) {
            System.out.print(ad[i]);
        }
    }
}