public class tryout {
    public static void main(String[] args) {
        int[][] mat = {
                { 7, 2, 1 },
                { 6, 4, 2 },
                { 6, 5, 3 },
                { 3, 2, 1 },
        };

        int sum = 0;
        int k = 0;
        for (int j = 0; j < mat[0].length && k < mat.length; j++) {
            int maxVal = mat[0][k];
            // Iterate over rows for each column
            for (int i = 0; i < mat.length ; i++) {

                //System.out.print(mat[i][j] + " ");
                
                if (mat[i][j] > maxVal) {
                    maxVal = mat[i][j];  
                }
                
            }
            k++;
            sum = sum+ maxVal;
            System.out.println("");
        }
        System.out.println(sum);
    }
}