// Given an array a
//  of length n
// , which elements are equal to −1
//  and 1
// . Let's call the array a
//  good if the following conditions are held at the same time:

// a1+a2+…+an≥0
// ;
// a1⋅a2⋅…⋅an=1

/**
 * A_Unit_Array
 */
import java.util.*;

public class A_Unit_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            int nev = 0;
            int pos = 0;
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                if (val > 0) {
                    pos++;
                } else {
                    nev++;
                }
            }
            if (n <= 3) {
                System.out.println(n);
            } else if (nev == 0) {
                System.out.println(0);
            } else if (pos == nev) {
                System.out.println(0);

            } else if (nev > pos && nev > 3) {
                if (nev % 2 == 0) {
                    System.out.println(nev / 2);
                } else {
                    System.out.println(nev / 2 + 1);
                }
            } else {
                if (nev % 2 != 0) {
                    System.out.println(1);
                }
            }
            t--;
        }
        scanner.close();
    }
}