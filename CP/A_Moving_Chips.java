
/**
 * A_Moving_Chips
 */

 import java.util.*;

 public class A_Moving_Chips {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int t = scanner.nextInt();
         while (t > 0) {
             int n = scanner.nextInt();
             int[] arr = new int[n];
             for (int i = 0; i < n; i++) {
                 int val = scanner.nextInt();
                 arr[i] = val;
             }
 
             int i = 0;
             int j = n - 1;
             int start = -1;
             int end = -1;
             while (i <= j) {
                 if (arr[i] == 1) {
                     start = i;
                     break;
                 }
                 i++;
             }
             while (j >= i) {
                 if (arr[j] == 1) {
                     end = j;
                     break;
                 }
                 j--;
             }
             int count = 0;
 
             if (start == end) {
                 System.out.println(0);
             }else{
                 for (int k = start+1; k < end; k++) {
                     if (arr[k] == 0) {
                         count++;
                     }
                 }
             }
 
             System.out.println(count);
             t--;
         }
         scanner.close();
     }
 }