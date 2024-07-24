package arrays;

import java.util.Arrays;

public  class cakeCut {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        
        reverseArray(horizontalCut);
        reverseArray(verticalCut);
        
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        
        while (h < horizontalCut.length && v < verticalCut.length) {
            if (horizontalCut[h] > verticalCut[v]) {
                cost += horizontalCut[h] * vp;
                hp++;
                h++;
            } else {
                cost += verticalCut[v] * hp;
                vp++;
                v++;
            }
        }
        while (h < horizontalCut.length) {
            cost += horizontalCut[h] * vp;
            h++;
        }
        
        while (v < verticalCut.length) {
            cost += verticalCut[v] * hp;
            v++;
        }
        
        return cost;
    }
    
    private void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        cakeCut solution = new cakeCut();
        int m = 5;
        int n = 5;
        int[] horizontalCut = {2, 1, 3, 1, 4};
        int[] verticalCut = {4, 1, 2};

        int result = solution.minimumCost(m, n, horizontalCut, verticalCut);
        System.out.println(result);  // Output the minimum cost
    }
}
