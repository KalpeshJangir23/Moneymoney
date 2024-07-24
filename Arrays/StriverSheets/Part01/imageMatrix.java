package arrays.StriverSheets.Part01;

public class imageMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[n - j - 1][i];
            }
        }

        // Copy the rotated matrix back to the original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = result[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 0, 1, 2, 0 },
            { 3, 4, 5, 2 },
            { 1, 3, 1, 5 }
        };
        
        rotate(matrix);
        
       
    }


}
