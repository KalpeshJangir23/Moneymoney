import java.util.Scanner;

public class C_Target_Practice {

    static int[] row = {1, 0, -1, 0};
    static int[] col = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading t

        while (t-- > 0) {
            solve(scanner);
        }

        scanner.close();
    }

    static void solve(Scanner scanner) {
        char[][] a = new char[10][10];

        for (int i = 0; i < 10; i++) {
            a[i] = scanner.next().toCharArray();
        }

        int sm = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i][j] == 'X') {
                    if (i == 0 || i == 9 || j == 0 || j == 9) sm += 1;
                    else if (i == 1 || i == 8 || j == 1 || j == 8) sm += 2;
                    else if (i == 2 || i == 7 || j == 2 || j == 7) sm += 3;
                    else if (i == 3 || i == 6 || j == 3 || j == 6) sm += 4;
                    else if (i == 4 || i == 5 || j == 4 || j == 5) sm += 5;
                }
            }
        }

        System.out.println(sm);
    }
}
