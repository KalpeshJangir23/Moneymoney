import java.util.*;

public class C_Rudolf_and_the_Ugly_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int cnt = 0;
            int i = 0;

            while (i < n - 2) {
                String s1 = "map";
                String s2 = "pie";

                if (s.charAt(i) == s1.charAt(0) && s.charAt(i + 1) == s1.charAt(1) && s.charAt(i + 2) == s1.charAt(2)) {
                    cnt++;
                    i += 3;
                } else if (s.charAt(i) == s2.charAt(0) && s.charAt(i + 1) == s2.charAt(1)
                        && s.charAt(i + 2) == s2.charAt(2)) {
                    cnt++;
                    i += 3;
                } else {
                    i++;
                }
            }
            System.out.println(cnt);
            t--;
        }

    }

}