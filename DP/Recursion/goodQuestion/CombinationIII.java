package DP.Recursion.goodQuestion;

import java.util.ArrayList;
import java.util.List;

public class CombinationIII {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        solve(1, k, n, result, new ArrayList<>());
        return result;
    }

    static void solve(int index, int k, int n, List<List<Integer>> listoflist, List<Integer> list) {
        if (list.size() == k && n == 0) {
            listoflist.add(new ArrayList<>(list));
            return;
        }
        if (list.size() >= k || index > 9 || n < 0) {
            return;
        }

        for (int i = index; i <= 9; i++) {
            list.add(i);
            solve(i + 1, k, n - i, listoflist, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        List<List<Integer>> ans = combinationSum3(k, n);
        System.out.println(ans);
    }
}
