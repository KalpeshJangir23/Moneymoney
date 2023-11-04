package Stack;
import java.util.*;

public class achaQuestion01 {
    public static List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        String take = "Push";
        String notTake = "Pop";
        int i = 1;
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < target.length; j++) {
            list.add(target[j]);
        }
        int count = 0;
        
        while (i<=n) {
            if (list.contains(i)) {
                ans.add(take);
                count++;
            }
            else{
                ans.add(take);
                ans.add(notTake);
            }

            if (count == target.length) {
                break;
            }
            i++;
        }

        return ans;
    }

    // -- Better Solution
    class Solution {
        public List<String> buildArray(int[] target, int n) {
            List<String> ans = new ArrayList<String>();
            String take = "Push";
            String notTake = "Pop";
            int i = 1;
            int index = 0; // Track the current index in the target array
    
            while (i <= n) {
                if (index == target.length) {
                    break; // All elements in the target array have been processed
                }
    
                ans.add(take); // Always "Push" at this step
    
                if (target[index] == i) {
                    index++; // Move to the next element in the target array
                } else {
                    ans.add(notTake); // If the current element is not the target, "Pop"
                }
    
                i++;
            }
    
            return ans;
        }
    }
    
    public static void main(String[] args) {
        int[] target = {1,2};
        int n =4 ;
        List<String> val = buildArray(target, n);

        System.out.println(val);
    }
}
