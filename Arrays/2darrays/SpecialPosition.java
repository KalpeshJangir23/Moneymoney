public class SpecialPosition {
    public int numSpecial(int[][] mat) {
        int countResult = 0;
        for (int i = 0; i < mat.length; i++) {
            int count =0;
            if (mat[i][0] == 1) {
                count++;
            }
            int countRow = 0;
            for (int j = 0; j < mat[i].length; j++) {
                
                for (int j2 = 0; j2 < mat.length; j2++) {
                    if (mat[j][j2] == 1) {
                        countRow++;
                    }
                }
                
            }
            if (countRow <=1 || count <=1 ) {
                countResult++;
            }
        }
        return countResult;
    }
    public static void main(String[] args) {
        
    }
}
