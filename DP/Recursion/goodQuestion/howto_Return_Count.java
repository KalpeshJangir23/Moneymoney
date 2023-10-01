package DP.Recursion.goodQuestion;

public class howto_Return_Count {
    public static void main(String[] args) {
        int n = 31468480    ;
        System.out.println(countZero(n, 0));
    }
    static int countZero(int n , int count){
        if (n%10 == n) {
            return count;
        }
        if (n%10 == 0) {
            count++;
        }
        return countZero(n/10, count);
    }
}
