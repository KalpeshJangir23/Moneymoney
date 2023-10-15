package DP.Recursion.goodQuestion;

import java.util.*;

public class remove_the_character {

    // ! Without recursion
    static String remove(String string, char car) {
        ArrayList<Character> charList = new ArrayList<Character>();
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) != car)) {
                charList.add(string.charAt(i));
            }

        }

        StringBuilder sb = new StringBuilder(charList.size());

        for (Character c : charList) {
            sb.append(c);
        }

        return sb.toString();

    }

    // ! With recursion
    static String remove_using_recursion(String string, int index, char a, ArrayList<Character> list) {
        if (string.length() == index) {
            StringBuilder sb = new StringBuilder(list.size());

            for (Character c : list) {
                sb.append(c);
            }

            return sb.toString();
        }

        if (string.charAt(index) != a) {
            list.add(string.charAt(index));
        }
        return remove_using_recursion(string, index + 1, a, list);
    }

    public static void main(String[] args) {
        String string = "baaacba";
        Character car = 'a';
        System.out.println(remove(string, car));
        ArrayList<Character> list = new ArrayList<Character>();


        System.out.println("********************************");
        System.out.println(remove_using_recursion(string, 0, car, list));

    }
}
