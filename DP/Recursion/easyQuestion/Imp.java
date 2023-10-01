package DP.Recursion.easyQuestion;

public class Imp {
    /// ! Print no n to 1
    static void print_number(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        print_number(n - 1);
    }

    /// ! Print the number N to 1
    static void print_number1toN(int n) {
        if (n == 0) {
            return;
        }
        print_number1toN(n - 1);
        System.out.println(n);
    }



    //! Product of a Number N to 1
    static int productNto1(int n) {
        if (n ==1) {
            return 1;
        }
        int ans = productNto1(n-1) * n;

        return ans;
    }

    static int sumNto1(int n){
        if(n == 1){
            return 1;
        }
        return n + sumNto1(n-1);
    }
    static int sumofDigit(int n){
        if(n == 0){
            return n;
        }
          int remainder = n%10;
        return sumNto1(n/10) + remainder;
    }

    public static void main(String[] args) {
        print_number1toN(2);
        System.out.println("===================== product ===========================");
        System.out.println(productNto1(5));
        System.out.println("===================== Sum ===========================");
        System.out.println(sumNto1(3));
        System.out.println("===================== Sum of digit ===========================");
        System.out.println(sumofDigit(13));


    }
}
