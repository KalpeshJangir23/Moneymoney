package BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MapHighestPeak {

  public int[][] highestPeak(int[][] isWater) {
    int m = isWater.length;
    int n = isWater[0].length;
    int[][] height = new int[m][n];
    boolean[][] visited = new boolean[m][n];
    Queue<int[]> queue = new LinkedList<>();

    // Initialize water cells with height 0 and add them to the queue
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (isWater[i][j] == 1) {
          height[i][j] = 0;
          visited[i][j] = true;
          queue.offer(new int[] { i, j });
        } else {
          height[i][j] = -1; // Mark land cells as unvisited
        }
      }
    }

    // Define the four possible directions (right, left, down, up)
    int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    System.out.println(Arrays.toString(queue.peek()));
    // Print initial height matrix
    System.out.println("Initial height matrix:");
    printMatrix(height);

    // BFS to assign heights
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      int x = curr[0];
      int y = curr[1];
      System.out.println("x: " + x + "  y :" + y);

      for (int[] dir : directions) {
        int newX = x + dir[0];
        int newY = y + dir[1];

        if (
          newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]
        ) {
          height[newX][newY] = height[x][y] + 1;
          visited[newX][newY] = true;
          queue.offer(new int[] { newX, newY });

          // Print height matrix after each update
          System.out.println(
            "Updated height matrix after processing cell (" +
            newX +
            "," +
            newY +
            "):"
          );
          printMatrix(height);
        }
      }
    }

    return height;
  }

  private void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    MapHighestPeak sol = new MapHighestPeak();
    int[][] isWater = { { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 0 } };
    int[][] result = sol.highestPeak(isWater);

    System.out.println("Final height matrix:");
    sol.printMatrix(result);
  }
}
