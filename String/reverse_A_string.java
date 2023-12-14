package String;

import java.util.Stack;

public class reverse_A_string {
    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        Stack<String> reverse = new Stack<>();
        for (String string : words) {
            reverse.push(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i != words.length) {

            stringBuilder.append(reverse.pop());
            
            
            i++;
        }
        String result = stringBuilder.toString();

        return result;
    }

    public static void main(String[] args) {
        String s = "kalpesj a jsf nsl kvc";
        System.out.println(reverseWords(s));
    }
}
