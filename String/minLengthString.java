package String;

public class minLengthString {
    public static int minimumLength(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j && s.charAt(i) == s.charAt(j)) {

            for (int k = i+1; k < j; k++) {
                if (s.charAt(i) != s.charAt(k)) {
                    i = k;
                    break;
                }
            }
            for (int k = j-1; k > i; k--) {
                if (s.charAt(j) != s.charAt(k)) {
                    j = k;
                    break;
                }
            }

        }

        s = s.substring(i, j+1);
        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        String s = "aabccabba";
        // output = 3 "cca"
        System.out.println(minimumLength(s));
    }
}
