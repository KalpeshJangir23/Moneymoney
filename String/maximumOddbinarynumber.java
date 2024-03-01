package String;

public class maximumOddbinarynumber {
    public static String maximumOddBinaryNumber(String s) {
        int countOne = 0;
        int countZero = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                countZero++;
            } else {
                countOne++;
            }
        }

        int[] arr = new int[s.length()];
        int n = s.length();

        arr[n - 1] = 1;
        countOne--;
        if (countOne != 0) {
            for (int i = 0; i < countOne; i++) {
                arr[i] = 1;
            }
        }

        for (int i = countOne; i < countZero; i++) {
            arr[i] = 0;
        }
        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "1000";
        System.out.println(maximumOddBinaryNumber(s));
    }

}