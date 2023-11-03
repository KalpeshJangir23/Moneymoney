
import java.util.*;

public class RemovingDigit {
    static int removingdigitAndCounting(int n) {
        // if (n == 0 && n > 0)  {
        //     return count;
        // }
        // int ans = n % 10;
        // count = count+1;
        // return removingdigitAndCounting(n - ans,count);
        if (n == 0) {
            return 0; // Base case: If n is already 0, no more steps are needed.
        }

        int maxDigit = -1;
        int temp = n;

        // Find the maximum digit in the number
        while (temp > 0) {
            int digit = temp % 10;
            maxDigit = Math.max(maxDigit, digit);
            temp /= 10;
        }
    
        return 1+removingdigitAndCounting(n - maxDigit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(removingdigitAndCounting(n));
    }
}
