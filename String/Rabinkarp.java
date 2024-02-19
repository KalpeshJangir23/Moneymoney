package String;

public class Rabinkarp {
    private static final int PRIME = 101;

    public static int rabinKarpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        long patternHash = hashFunction(pattern, m);
        long textHash = hashFunction(text, m);

        for (int i = 0; i <= n - m; i++) {
            if (textHash == patternHash && text.substring(i, i + m).equals(pattern)) {
                return i;  // Pattern found at index i
            }

            if (i < n - m) {
                // Update rolling hash for the next window
                textHash = recalculateHash(textHash, text.charAt(i), text.charAt(i + m), m);
            }
        }

        return -1;  // Pattern not found
    }

    private static long hashFunction(String str, int length) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash = (hash * PRIME + str.charAt(i)) % Long.MAX_VALUE;
        }
        return hash;
    }

    private static long recalculateHash(long oldHash, char oldChar, char newChar, int length) {
        long newHash = (oldHash - oldChar * pow(PRIME, length - 1)) % Long.MAX_VALUE;
        newHash = (newHash * PRIME + newChar) % Long.MAX_VALUE;
        return (newHash + Long.MAX_VALUE) % Long.MAX_VALUE;  // Ensure the hash is non-negative
    }

    private static long pow(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        int index = rabinKarpSearch(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}
