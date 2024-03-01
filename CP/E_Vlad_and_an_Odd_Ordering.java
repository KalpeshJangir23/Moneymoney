
/**
 * E_Vlad_and_an_Odd_Ordering
 */
import java.util.*;

public class E_Vlad_and_an_Odd_Ordering {
    public static int multiplyby2(List<Integer> list, int k, int n) {
        for (int i = 1; i <= n; i++) {
            int a = list.get(i);
            if (a * 2 <= n) {
                list.add(a * 2);
            }
        }

        if (list.size() >= k) {
            return list.get(k);
        }
        return multiplyby3(list, k, n);
    }

    public static int multiplyby3(List<Integer> list, int k, int n) {
        for (int i = 1; i <= n; i++) {
            int a = list.get(i);
            if (a * 3 <= n) {
                list.add(a * 2);
            }
        }

        if (list.size() >= k) {
            return list.get(k);
        }
        return multiplyby4(list, k, n);
    }

    public static int multiplyby4(List<Integer> list, int k, int n) {
        for (int i = 1; i <= n; i++) {
            int a = list.get(i);
            if (a * 4 <= n) {
                list.add(a * 4);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        return list.get(k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    list.add(i);
                }
            }

            if (list.size() > k) {
                System.out.println(list.get(k));
            } else if (list.size() < n) {
                for (int i = 1; i <= n; i++) {
                    int a = list.get(i);
                    if (a * 2 <= n) {
                        list.add(a * 2);
                    }
                    if (a * 3 <= n) {
                        list.add(a * 3);
                    }

                    if (a * 4 <= n) {
                        list.add(a * 4);
                    }
                }

            }
            System.out.println(list.get(k));

            t--;

        }
        scanner.close();
    }
}