import java.util.Scanner;

public class C_Prepend_and_Append {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading t

        while (t > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading n
            String str = scanner.nextLine();
            int N = n;
            int s = 0, e = n - 1;

            while (s < e) {
                if (str.charAt(s) != str.charAt(e)) {
                    s++;
                    e--;
                    N -= 2;
                } else {
                    break;
                }
            }

            System.out.println(N);
            t--;
        }

        scanner.close();
    }
}
