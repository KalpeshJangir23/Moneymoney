package String;

import java.util.ArrayList;
import java.util.Arrays;

public class sortVowels {
    public static String sortVowels(String s) {
        boolean[] found = new boolean[s.length()];
        Arrays.fill(found, false);
        ArrayList<Character> vowels = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) >= 0) {
                found[i] = true;
                vowels.add(ch);
            }
        }

        // Sorting the vowels ArrayList
        vowels.sort(Character::compareTo);

        StringBuilder stringBuilder = new StringBuilder();
        int vowelIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (found[i]) {
                stringBuilder.append(vowels.get(vowelIndex));
                vowelIndex++;
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
}


// package String;

// import java.util.Arrays;

// public class sortVowels {
//     public static String sortVowels(String s) {
//         Boolean[] found = new Boolean[s.length()];
//         Arrays.fill(found, Boolean.FALSE);
//         int[] asciiVal = new int[s.length()];
//         for (int i = 0; i < asciiVal.length; i++) {
            
//             if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
//                     s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
//                     s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
//                     s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
//                     s.charAt(i) == 'u' || s.charAt(i) == 'U') {
//                 found[i] = true;
//                 asciiVal[i] = (int) s.charAt(i);
//             }

//         }
//         Arrays.sort(asciiVal);
//         int j = 0;
//         StringBuilder stringBuilder = new StringBuilder();
//         for (int i = 0; i < s.length() && j < s.length(); i++) {
//             if (found[i]) {
//                 //System.out.println((char) asciiVal[j]);
//                 stringBuilder.append((char) asciiVal[j]);
//                 j++;
//             }
//             else{
//                 stringBuilder.append(s.charAt(i));
//             }
//         }


//         return stringBuilder.toString();
//     }

//     public static void main(String[] args) {
//         String s = "lEetcOde";
//         System.out.println(
//         sortVowels(s)
//         );
//     }
// }
