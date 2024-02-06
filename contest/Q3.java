package contest;
import java.util.*;

public class Q3 {
    public int minimumArrayLength(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        // Copy elements from nums to list
        for (int num : nums) {
            list.add(num);
        }

        int i = 0;
        while (!list.isEmpty()) {
            int div = (i + 1 < list.size()) ? list.get(i + 1) : 0;

            if (div != 0) {
                int add = list.get(i) % div;
                list.remove(i);
                list.remove(i); 
                list.add(add);
            } else {
                list.remove(i);
                if (i < list.size()) {
                    list.remove(i); 
                }
                list.add(0);
            }
        }

        return list.size();
    }
}
