package CP;
/**
 * A_Halloumi_Boxes
 */
import java.util.*;
public class A_Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while (t>0) {
            int n  = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            } 
            int[] temp  = arr.clone();
            Arrays.sort(temp);
            if (k==1 && !Arrays.equals(arr,temp)) {
                System.out.println("NO");
            }
            else{
            System.out.println("YES");
            }
            t--;    
        }
        scanner.close(); 
    }
}