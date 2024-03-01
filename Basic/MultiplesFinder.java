package Basic;

import java.util.ArrayList;
import java.util.List;

public class MultiplesFinder {

    public static List<Integer> findMultiples(int number, int limit) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            if (i % number == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }

    public static void main(String[] args) {
        // Example: Find multiples of 3 up to 30
        List<Integer> result = findMultiples(40, 40);
        System.out.println(result);
    }
}
