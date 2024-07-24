import java.util.*;

/**
 * B_Array_merging
 */
public class B_Array_merging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            HashMap<Integer, Integer> tmap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                list.add(val);
            }

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                list2.add(val);
            }
            list.addAll(list2);
            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i);
                tmap.put(val, tmap.getOrDefault(val, 0) + 1);
            }

            int maxFrequency = tmap.get(list.get(0));

            for (Map.Entry<Integer, Integer> entry : tmap.entrySet()) {
                int currentFrequency = entry.getValue();

                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                }
            }
            System.out.println(maxFrequency);

            t--;
        }
        scanner.close();
    }
}
