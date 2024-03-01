/**
 * A_Make_It_Zero
 */
import java.util.*;
public class A_Make_It_Zero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            } else {
                System.out.println(4);
                System.out.println("1 " + n);
                System.out.println("2 " + n);
                System.out.println("1 2");
                System.out.println("1 2");
            }
        }

        scanner.close();
    }
}