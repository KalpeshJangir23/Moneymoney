import java.util.*;

public class Lc2225WinwithZeroLoss {
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> loserList = new ArrayList<>();
        List<Integer> winnerList = new ArrayList<>();
        if (matches.length == 1) {
            winnerList.add(matches[0][0]);
            loserList.add(matches[0][1]);
            ans.add(winnerList);
            ans.add(loserList);
            return ans;
        }
        int maxi = Integer.MIN_VALUE;
        int[] arrLoss = new int[100005];
        Arrays.fill(arrLoss, 0);
        int[] winner = new int[100005];
        Arrays.fill(winner, 0);
        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int loser = matches[i][1];
            maxi = Math.max(maxi, Math.max(win, loser));

            winner[loser] = -1;
            
            if(winner[win] != -1){
                winner[win] = 1;
            }

            arrLoss[loser]++;

        }

        for (int i = 1; i <= maxi; i++) {
            if (arrLoss[i] == 1) {
                loserList.add(i);
            }
            if (winner[i] == 1) {
                winnerList.add(i);
            }
        }

        ans.add(winnerList);
        ans.add(loserList);
        return ans;
    }



    public static void main(String[] args) {
        int[][] matches = {
                { 1, 3 },
                { 2, 3 },
                { 3, 6 },
                { 5, 6 },
                { 5, 7 },
                { 4, 5 },
                { 4, 8 },
                { 4, 9 },
                { 10, 4 },
                { 10, 9 }
        };
        System.out.println(findWinners(matches));
    }
}
