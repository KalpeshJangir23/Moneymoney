import java.util.HashMap;
import java.util.Map;

public class trykarna {
    public static void main(String[] args) {
        // Sample input array after the virus attack
        String[] encodedArray = {"A1A3", "AAB" , "BD1"};

        // Decode the array
        int[] decodedArray = decodeIntegers(encodedArray);

        // Print the decoded array
        for (int num : decodedArray) {
            System.out.println(num);
        }
    }

    static int[] decodeIntegers(String[] encodedArray) {
        int[] decodedArray = new int[encodedArray.length];

        for (int i = 0; i < encodedArray.length; i++) {
            decodedArray[i] = decodeInteger(encodedArray[i]);
        }

        return decodedArray;
    }

    static int decodeInteger(String encodedInteger) {
        Map<Character, Integer> charToDigit = new HashMap<>();

        // Add mappings for characters A-Z
        for (char c = 'A'; c <= 'Z'; c++) {
            charToDigit.put(c, c - 'A');
        }

        int decodedInteger = 0;

        for (char c : encodedInteger.toCharArray()) {
            if (Character.isDigit(c)) {
                decodedInteger = decodedInteger * 10 + Character.getNumericValue(c);
            } else {
                decodedInteger = decodedInteger * 10 + charToDigit.getOrDefault(c, 0);
            }
        }

        return decodedInteger;
    }
}
