package arrays;

import java.util.PriorityQueue;

/**
 * MinimizeManhattanDistances
 */
public class MinimizeManhattanDistances {

  public static int minimumDistance(int[][] points) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < points.length; i++) {
      int val1 = points[i][0];
      int val2 = points[i][1];
      int val3 = 0;
      int val4 = 0;
      int val5 = 0;
      int val6 = 0;
      int dist1 = Integer.MAX_VALUE;
      if (i + 1 < points.length) {
        val3 = points[i + 1][0];
        val4 = points[i + 1][1];
        dist1 = Math.abs(val3 - val1) + Math.abs(val4 - val2);
      }
      int dist2 = Integer.MAX_VALUE;
      int dist3 = Integer.MAX_VALUE;
      if (i + 2 < points.length) {
        val5 = points[i + 2][0];
        val6 = points[i + 2][1];
        dist2 = Math.abs(val5 - val1) + Math.abs(val6 - val2);
        dist3 = Math.abs(val5 - val3) + Math.abs(val4 - val6);
      }

      int val = Math.max(dist1, dist2);
      pq.offer(val);
      val = Math.max(dist2, dist3);
      pq.offer(val);
      val = Math.max(dist1, dist3);
      pq.offer(val);
    }
    return pq.peek();
  }

  public static void main(String[] args) {
    int[][] points = { { 3, 10 }, { 5, 15 }, { 10, 2 }, { 4, 4 } };
    System.out.println(minimumDistance(points));
  }
}
