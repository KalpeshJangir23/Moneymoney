
/**
 * A_Vlad_and_the_Best_of_Five
 */
import java.util.*;

public class A_Vlad_and_the_Best_of_Five {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {
            String s = scanner.nextLine();
            int ca = 0;
            int cb = 0;
            for (int i = 0; i < s.length(); i++) {
                char val = s.charAt(i);
                if (val == 'A') {
                    ca++;
                } else {
                    cb++;
                }

            }
            if (ca > cb) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
            t--;
        }
        scanner.close();
    }
}