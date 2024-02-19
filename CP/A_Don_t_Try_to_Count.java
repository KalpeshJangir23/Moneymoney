import java.util.*;

public class A_Don_t_Try_to_Count {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            long n, m, cnt = 6, f = 0, res = 0;
            String x, s;
            n = scanner.nextLong();
            m = scanner.nextLong();
            x = scanner.next();
            s = scanner.next();

            while (cnt-- > 0) {
                if (x.contains(s)) {
                    f = 1;
                    break;
                }
                res++;
                x += x;
            }

            if (f == 1)
                System.out.println(res);
            else
                System.out.println(-1);
        }

    }
}
