// import java.util.*;

// /**
//  * B_Swap_and_Delete
//  */
// public class B_Swap_and_Delete {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt();
//         while (t > 0) {
//             int coin = 0;
//             String s = scanner.next();
//             int one = 0;
//             int zero = 0;
//             for (int i = 0; i < s.length(); i++) {
//                 if (s.charAt(i) == '1') {
//                     one++;

//                 } else {
//                     zero++;
//                 }
//             }
//             if (s.length() == 1) {
//                 System.out.println(1);
//             } else if (one == zero) {
//                 System.out.println(0);

//             } else {
//                 coin = Math.abs(one - zero);
//                 if (one > zero) {
//                     one = one - coin;
//                 } else {
//                     zero = zero - coin;
//                 }

//                 int temp = s.length() - coin;
//                 String a = s.substring(0, temp);
//                 int newOne = 0;
//                 int newZero = 0;

//                 for (int i = 0; i < a.length(); i++) {
//                     if (a.charAt(i) == '1') {
//                         newOne++;

//                     } else {
//                         newZero++;
//                     }
//                 }

//                 if (newOne == zero && newZero == one) {
//                     System.out.println(coin);
//                 } else {
//                     int ncz = 0;
//                     int nco = 0;
//                     if (newOne > zero) {
//                         ncz = newOne - zero;
//                     }
//                     if (newZero > one) {
//                         nco = newZero - one;
//                     }
//                     System.out.println(coin + nco + ncz);

//                 }
//             }
//             t--;
//         }
//         scanner.close();
//     }
// }








import java.util.Scanner;

public class B_Swap_and_Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int zero = 0;
            int one = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (one > 0) {
                        one--;
                    } else {
                        break;
                    }
                } else {
                    if (zero > 0) {
                        zero--;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(one + zero);
        }
    }
}
