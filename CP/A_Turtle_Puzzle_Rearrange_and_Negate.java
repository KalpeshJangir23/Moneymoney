/**
 * A_Turtle_Puzzle_Rearrange_and_Negate
 */
import java.util.*;
public class A_Turtle_Puzzle_Rearrange_and_Negate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt() ;
        while (t>0) {
            int n = scanner.nextInt();

            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                if (val < 0) {
                    val = -val;
                }
                sum = sum + val;

            }
            System.out.println(sum);
            t--;
        } 
            scanner.close();
    }
}