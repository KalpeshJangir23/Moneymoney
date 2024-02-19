/**
 * A_Ambitious_Kid
 */
import java.util.*;
public class A_Ambitious_Kid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int  i = 0; i < arr.length; i++) {
            int a = scanner.nextInt();
            a = Math.abs(a);
            if (a < min) {
                min = a;
            }
            
        }
        System.out.println(min);
            scanner.close();
    }
}