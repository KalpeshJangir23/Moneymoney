package contest;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class phone {

    public static int[] minStreetPairs(int n, int x, int y) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int house1 = 1; house1 <= n; house1++) {
            for (int house2 = 1; house2 <= n; house2++) {
                if (house1 == house2) {
                    continue;
                }

                int minStreets = Math.min(Math.abs(house1 - house2),
                        Math.min(1 + Math.abs(house1 - x) + Math.abs(house2 - y),
                                1 + Math.abs(house1 - y) + Math.abs(house2 - x)));

                resultMap.put(minStreets, resultMap.getOrDefault(minStreets, 0) + 1);
            }
        }

        int[] result = new int[n];

        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            result[entry.getKey() - 1] = entry.getValue();
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 3;
        int x = 1;
        int y = 3;
        int[] output = minStreetPairs(n, x, y);

        // Print the result
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
