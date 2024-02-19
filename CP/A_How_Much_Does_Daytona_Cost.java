
/**
 * A_How_Much_Does_Daytona_Cost
 */
import java.util.*;

public class A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());

            }
            if (list.contains(k)) {
                System.out.println("Yes");
                //break;
            } else {
                System.out.println("NO");
            }
            t--;

        }
        scanner.close();
    }
}