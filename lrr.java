import java.util.*;

public class lrr {
    public static String number(Integer[] nums) {
        Arrays.sort(nums, (a, b) -> {
            String strA = String.valueOf(a);
            String strB = String.valueOf(b);
            return strA.compareTo(strB);
        });
       
        System.out.println(Arrays.toString(nums));
        return "";
    }

    public static void main(String[] args) {
        Integer[] nums = { 30, 3};
        System.out.println(number(nums));
    }
}
