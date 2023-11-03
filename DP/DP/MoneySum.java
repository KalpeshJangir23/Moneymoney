
import java.util.*;
public class MoneySum {
    static int calculateMoney(int[] money, int index, Set<Integer> set) {
        if (index == money.length) {
            int sum = 0;
            for (int value : set) {
                sum += value;
            }
            return sum;
        }

        // Include the current money[index] in the set
        set.add(money[index]);
        int picked_value = calculateMoney(money, index + 1, set);
        
        set.remove(set.size() - 1); // Backtrack by removing the last element

        // Exclude the current money[index] from the set
        int not_picked_value = calculateMoney(money, index + 1, set);
        
        
        
        // Return the maximum of picked and not picked values
        return Math.max(picked_value, not_picked_value);
    }

    public static void main(String[] args) {
        int[] money = {4, 2, 5, 2};
        Set<Integer> set = new HashSet<>();
        System.out.println(calculateMoney(money, 0, set));
    }
}
