import java.util.Scanner;

/**
 * B_Comparison_String
 */

public class B_Comparison_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int count = 1;
            int max = 1;
            for (int i = 1; i < n ; i++) {
                
                if ( s.charAt(i) == s.charAt(i - 1) ) {
                    count++;
                    
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
            System.out.println(max + 1);
            t--;
        }
        scanner.close();
    }
}