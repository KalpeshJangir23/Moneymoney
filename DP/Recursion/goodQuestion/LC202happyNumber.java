package DP.Recursion.goodQuestion;

public class LC202happyNumber {
    static boolean happy(int n) {
        int a = n;
        int rem = 0;
        int sum = 0;
        rem = a % 10;
        sum = sum + (rem * rem);
        a = a / 10;
        if (sum%10 == sum && sum != 1){
            return false;
        }
        if (sum == 1 ) {
            return true;
        }
        return happy(sum);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(happy(n));
    }
}
