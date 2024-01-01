/**
 * buyTwoChocolate
 */
public class buyTwoChocolate {
    public static int buyChoco(int[] prices, int money) {
     
        int min = money; 
        for (int i = 0; i < prices.length - 1; i++) {
            int mon = money;
            
            for (int j = 1; j < prices.length && i<j; j++) {
                if (mon - (prices[i]+prices[j]) > 0) {
                    if (mon < min) {
                        min = mon;
                    }
                }
                else if (mon - (prices[i]+prices[j]) == 0){
                    return 0;
                }
                else{
                    return money;
                }
            }
        }
       return min;
    }

    public static void main(String[] args) {
        int[] prices = {3,2,3};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }
}