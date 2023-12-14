public class transposeofMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        int col = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][col] = matrix[i][j];
            }
            col++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] maVal = transpose(matrix);

        for (int i = 0; i < maVal.length; i++) {
            for (int j = 0; j < maVal[i].length; j++) {
                System.out.print(maVal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
