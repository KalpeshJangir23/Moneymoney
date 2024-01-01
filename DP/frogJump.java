package DP;

//! https://www.codingninjas.com/studio/problems/frog-jump_3621012?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class frogJump {
    public static int frogJump(int n, int heights[]) {
        return noOfWays(n, heights);
    }

    static int noOfWays(int n, int[] heights) {
        if (n >= heights.length - 1) {
           
            return 0;
        }
        int oneStep = Integer.MAX_VALUE;
        int twoSteps = Integer.MAX_VALUE;
        
        if (n + 1 < heights.length) {
            oneStep = noOfWays(n + 1, heights) +  Math.abs(heights[n] - heights[n + 1]);
            // Math.abs(heights[n] - heights[n + 1]) === Energy wala part


            
        }
       
        if (n + 2 < heights.length) {
            twoSteps = noOfWays(n + 2, heights) + Math.abs(heights[n] - heights[n + 2]);
        }
        return Math.min(oneStep, twoSteps);
    }

    public static void main(String[] args) {
        int[] heights = {10, 50, 10};
        int n = 0;
        System.out.println(frogJump(n, heights));
    }
}
