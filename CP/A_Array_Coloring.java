/**
 * A_Array_Coloring
 */
import java.util.*;
public class A_Array_Coloring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt() ;
        while (t>0) {
            int n  = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + scanner.nextInt();
            }
            if (sum%2 == 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;

        } 
            scanner.close();
    }
}