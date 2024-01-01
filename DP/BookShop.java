package DP;

import java.util.*;

public class BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int amount_x = scanner.nextInt();
        int[] price = new int[n];
        int[] book =    new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = scanner.nextInt();
        }
        for (int i = 0; i < book.length; i++) {
            book[i] = scanner.nextInt();
        }
        
        int maxDigit = 0;
        for (int i = 0; i < book.length; i++) {
            for (int j = i + 1; j < book.length; j++) {
                if (price[i] + price[j] <= amount_x) {  // Changed < to <= to include cases where the price matches the budget
                    int ans = book[i] + book[j];
                    maxDigit = Math.max(maxDigit, ans);
                }
            }
        }
        

        System.out.println(maxDigit);
    }
}
