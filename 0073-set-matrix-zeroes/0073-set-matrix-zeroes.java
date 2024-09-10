class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rowarr = new boolean[row];
        boolean[] colarr = new boolean[col];


        // STEP 1 : identify the row and col that need to be zeroed out
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowarr[i] = true;
                    colarr[j] = true;
                }
            }
        }


        //STEP 2:  Set the identified rows to zero
        for (int i = 0; i < row; i++) {
            if (rowarr[i]) { // if row is 0 
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
                
            }
        }


        // STEP 3: Set the identified cols to zero
        for (int j = 0; j < col; j++) {
            if (colarr[j]) {
                for (int i = 0; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }






    }
}