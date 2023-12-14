package Arrays.StriverSheets.Part01;

public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
    
        int m = matrix.length;
        int n = matrix[0].length;
    
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];
    
        // Mark the rows and columns that contain 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
    
        // Set matrix elements to 0 based on the marked rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
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

        setZeroes(matrix);
    }
}
