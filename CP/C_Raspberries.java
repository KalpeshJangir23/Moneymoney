
/**
 * C_Raspberries
 */
import java.util.*;

public class C_Raspberries {
    private static int lowerBound(List<Integer> array, long target) {
        int low = 0;
        int high = array.size();

        while (low < high) {
            int mid = (low + high) / 2;
            if (array.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long product = 1;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                product = product * val;
                list.add(val);
            }
            int count = 0;
            if (product % k == 0) {
                System.out.println(0);
            } else {
                int index = lowerBound(list, k);
                if (index == 0) {
                    while (product % k != 0) {
                        int a = list.get(index);
                        a = a + 1;
                        list.set(index, a);
                        product *= a; // Update the product after modifying the element
                        count++;
                    }
                    System.out.println(count);
                } else {
                    index = index - 1;
                    while (product % k != 0) {
                        int a = list.get(index);
                        a = a + 1;
                        list.set(index, a);
                        product *= a; // Update the product after modifying the element
                        count++;
                    }
                    System.out.println(count);
                }

            }

            t--;
        }
        scanner.close();
    }
}