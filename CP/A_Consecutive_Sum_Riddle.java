package CP;
import java.util.*;

public class A_Consecutive_Sum_Riddle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            long n = scanner.nextLong(); 
            System.out.println(-(n - 1) +" "+ n);
            t--;
        }
        scanner.close();
    }
    
}