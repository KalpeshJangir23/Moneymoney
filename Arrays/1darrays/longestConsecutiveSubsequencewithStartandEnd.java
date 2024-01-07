import java.util.*;

public class longestConsecutiveSubsequencewithStartandEnd {
    public static int[] longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return new int[0];

        int longest = 1;
        int start = 0;
        int end = 0;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                if (cnt > longest) {
                    longest = cnt;
                    start = it;
                    end = x;
                }
            }
        }
        return new int[]{start, end, longest};
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int[] ans = longestSuccessiveElements(a);
        int start = ans[0];
        int end = ans[1];
        int length = ans[2];
        System.out.println("The longest consecutive sequence is from " + start + " to " + end + " with length " + length);
    }
}
