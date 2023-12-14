public class differenceBetween0neAndZeros {
    public static int[][] onesMinusZeros(int[][] grid) {
        // diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
        int[] row = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            int countZ = 0;
            int countO = 0;

            for (int j = 0; j < grid[i].length; j++) { 
                if (grid[i][j] == 1) {
                    countO++;
                } else {
                    countZ++;
                }
            }


            row[i] = countO - countZ; 
        }
        int[] column = new int[grid[0].length]; 

        for (int j = 0; j < grid[0].length; j++) { 
            int countZ = 0;
            int countO = 0;
        
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) {
                    countO++;
                } else {
                    countZ++;
                }
            }
        
            column[j] = countO - countZ;
        }   
        int[][] diff = new int[grid.length][grid[0].length];
        for (int i = 0; i < diff.length; i++) {
            int rVal = row[i];
            for (int j = 0; j < diff.length; j++) {
                int cVal = column[j];
                diff[i][j] = rVal + cVal;
            }
        } 


        
        return diff;
    }

    public static void main(String[] args) {
        int[][] array = {
            {0, 1, 1},
            {1, 0, 1},
            {0, 0, 1}
        };
        int[][] maVal = onesMinusZeros(array);

        for (int i = 0; i < maVal.length; i++) {
            for (int j = 0; j < maVal[i].length; j++) {
                System.out.print(maVal[i][j] + " ");
            }
            System.out.println();
        }

    }
}
