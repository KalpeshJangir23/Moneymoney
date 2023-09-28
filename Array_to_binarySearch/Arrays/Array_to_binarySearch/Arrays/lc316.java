package Array_to_binarySearch.Arrays;
import java.util.*;

public class lc316 {

        public static String removeDuplicateLetters(String s) {
            Set<Character> set = new TreeSet<Character> (); 
            for(int i = 0 ; i< s.length() ; i++ ){
                set.add(s.charAt(i));
            }
            StringBuilder resultString = new StringBuilder();
    
            for (Character c : set) {
                resultString.append(c);
            }
            
            return resultString.toString();
        }

        public static void main(String[] args) {
            String s = "bcabc";
            System.out.println(removeDuplicateLetters(s));

        }
    }
