import java.util.*;
class Solution {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
         int max = 0;

        for (int i = 0; i < k; i++) {
            int count = 0;
            int tempBudget = budget;
            List<Integer> tempStock = new ArrayList<>(stock);

            while (true) {
                int totalCost = 0;

                for (int j = 0; j < n; j++) {
                    int required = composition.get(i).get(j);
                    if (tempStock.get(j) < required) {
                        int needed = required - tempStock.get(j);
                        totalCost += needed * cost.get(j);
                    }
                }

                if (totalCost > tempBudget) {
                    break;
                }

                for (int j = 0; j < n; j++) {
                    int required = composition.get(i).get(j);
                    if (tempStock.get(j) < required) {
                        int needed = required - tempStock.get(j);
                        tempStock.set(j, 0);
                    } else {
                        tempStock.set(j, tempStock.get(j) - required);
                    }
                }

                tempBudget -= totalCost;
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}