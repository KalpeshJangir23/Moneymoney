/**
 * A_Odd_One_Out
 */
import java.util.*;
public class A_Odd_One_Out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t>0) {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int c = scanner.nextInt();
           if (a != b) {
                if (a != c) {
                    System.out.println(a);
                }
                else{
                    System.out.println(b);
                }
           }
           else{
            System.out.println(c);
           }
            t--;
        } 
        scanner.close();
    }
}