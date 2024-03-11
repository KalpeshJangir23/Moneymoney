import java.util.HashSet;

public class cpTry {
    public static void main(String[] args) {
        String inputString = "ababa";

        HashSet<String> distinctStrings = new HashSet<>();

        performOperations(inputString, distinctStrings);

        // Display the distinct strings in the HashSet
        System.out.println("Distinct Strings: " + distinctStrings);
        System.out.println(distinctStrings.size());
    }

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
}
