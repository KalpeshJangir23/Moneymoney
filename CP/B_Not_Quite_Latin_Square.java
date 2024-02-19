import java.util.*;

public class B_Not_Quite_Latin_Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        // Consume the newline character after reading the integer
        scanner.nextLine();

        while (t > 0) {
            HashMap<Character, Integer> hmap = new HashMap<>();

            char[][] latinSquare = new char[3][3];

            for (int i = 0; i < 3; i++) {
                String line = scanner.nextLine();
                latinSquare[i] = line.toCharArray();
                for (int j = 0; j < latinSquare.length; j++) {

                    char a = latinSquare[i][j];
                    if (hmap.containsKey(a)) {
                        hmap.put(a, hmap.get(a) + 1);
                    } else {
                        hmap.put(a, 1);
                    }
                }
            }
            int targetValue = 2;

            for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
                if (entry.getValue().equals(targetValue)) {
                    System.out.println(entry.getKey());
                }
            }
           
            t--;
        }
        scanner.close();
    }
}
