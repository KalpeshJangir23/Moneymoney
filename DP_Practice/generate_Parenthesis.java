package DP_Practice;

import java.util.*;

public class generate_Parenthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(n, 0, 0, current, list);
        return list;
    }

    public static void backtrack(int n, int openN, int closeN, StringBuilder current, List<String> list) {
        if (openN == n && closeN == n) {
            list.add(current.toString());
            return;
        }

        if (openN < n) {
            current.append('(');
            backtrack(n, openN + 1, closeN, current, list);
            current.deleteCharAt(current.length() - 1);
        }

        if (closeN < openN) {
            current.append(')');
            backtrack(n, openN, closeN + 1, current, list);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
