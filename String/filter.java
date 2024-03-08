package String;

import java.util.*;

public class filter {
    public static void main(String[] args) {
        

        String givenString = "DEINSTITUTIONALIZATION";
        List<Character> charList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder(givenString);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        for (char c : stringBuilder.toString().toCharArray()) {
            charList.add(c);
        }
        
        List<Character> list = new ArrayList<Character>(charList);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        List<Character> filteredList = filterChars(list, "DONATION");
        StringBuilder aval = new StringBuilder(filteredList.size());
        System.out.println(filteredList);
        for (Character ch : filteredList) {
            aval.append(ch);
        }
        System.out.println(aval);

        if (aval.toString().equals("DONATION")) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    static List<Character> filterChars(List<Character> charList, String inputString) {
        List<Character> filteredList = new ArrayList<>();

        for (char c : charList) {
            if (inputString.contains(String.valueOf(c))) {
                filteredList.add(c);
            }
        }

        return filteredList;
    }
}
