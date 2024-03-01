import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class B_Chemistry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine(); 
            String s = scanner.nextLine();
            Map<Character, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                m.put(c, m.getOrDefault(c, 0) + 1);
            }
            int count = 0;
            for (Map.Entry<Character, Integer> entry : m.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    count++;
                }
            }
            if (k >= n) {
                System.out.println("NO");
            } else if (k >= count - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
