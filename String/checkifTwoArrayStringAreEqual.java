package String;

public class checkifTwoArrayStringAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // ! Brute force toh ye hi hoga ki saari index ki string le ke saare char ko string builder mai apppend karte hai fir string mai convert kar ke compare karte reh
        
        
        
        // StringBuilder stringBuilderfor1 = new StringBuilder();
        // for (int i = 0; i < word1.length; i++) {
        //     String m = word1[i];
        //     int j = 0 ;
        //     while (j< m.length()) {
        //         stringBuilderfor1.append(m.charAt(j));
        //         j++;
        //     }
        // }
        // StringBuilder stringBuilderfor2 = new StringBuilder();
        // for (int i = 0; i < word2.length; i++) {
        //     String m = word2[i];
        //     int j = 0 ;
        //     while (j< m.length()) {
        //         stringBuilderfor2.append(m.charAt(j));
        //         j++;
        //     }
        // }
        // String result1 = stringBuilderfor1.toString();
        // String result2 = stringBuilderfor2.toString(); 


        // return result1.equals(result2);
        StringBuilder stringBuilderfor1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
         stringBuilderfor1.append(word1[i]);    
        }
        StringBuilder stringBuilderfor2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            stringBuilderfor2.append(word2[i]);
        }
        String result1 = stringBuilderfor1.toString();
        String result2 = stringBuilderfor2.toString(); 


        return result1.equals(result2);
    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "cd"};
        String[] word2 = {"a", "bcd"};

        System.out.println(arrayStringsAreEqual(word1, word2));
        }
}
