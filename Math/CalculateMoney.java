package Math;

public class CalculateMoney {
    public static int totalMoney(int n) {
        int sum = 0;
        int j = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (j <= 7) {
                sum += j;
                j++;
            } else {
                j = 1+ count;
                count++;
            }
            
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));
    }
}
