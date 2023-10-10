package DP.Recursion.goodQuestion;

public class LC2169 {
    public static int countOperations(int num1, int num2) {
        return countzero(num1, num2, 0);
    }
    static int countzero(int num1, int num2, int count) {
        if(num1 == 0 || num2 == 0){
            return count;
        }
        if (num1 >= num2) {
            count++;
            num1 = num1-num2;
        }
        else {
            count++;
            num2 = num2-num1;
        }
        return countzero(num1, num2, count);
    }
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 3;
        System.out.println(countOperations(num1, num2));
    }

}
