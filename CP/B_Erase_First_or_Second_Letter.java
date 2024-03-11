import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_Erase_First_or_Second_Letter {

    private static void performOperations(String str, HashSet<String> distinctStrings) {
        if (!str.isEmpty()) {
            distinctStrings.add(str);

            performOperations(removeIndex(str, 0), distinctStrings);

            performOperations(removeIndex(str, 1), distinctStrings);
        }
    }

    private static String removeIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.substring(0, index) + str.substring(index + 1);
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            String s = scanner.next();

            HashSet<String> distinctStrings = new HashSet<>();
            performOperations(s, distinctStrings);  
            System.out.println(distinctStrings.size());
        }
        scanner.close();
    }
}
