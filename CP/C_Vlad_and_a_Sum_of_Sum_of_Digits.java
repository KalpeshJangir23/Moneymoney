
/**
 * C_Vlad_and_a_Sum_of_Sum_of_Digits
 */
import java.util.*;

public class C_Vlad_and_a_Sum_of_Sum_of_Digits {
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 2 * (int) Math.pow(10, 5);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        for (int i = 1; i < result + 1; i++) {
            list.add(list.get(i-1) + sumOfDigits(i));
        }
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            System.out.println(list.get(n));
            t--;
        }

        scanner.close();
    }

}