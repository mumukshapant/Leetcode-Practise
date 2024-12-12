class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length; 
        int n = mat[0].length; 
        
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                if (mat[i][j] == 0) 
                    setzero(mat, i, j); // Mark the entire row and column 
                    
        finalizeZeroes(mat); 
    }

    private void setzero(int[][] mat, int row, int col) {
        int m = mat.length; 
        int n = mat[0].length; 
        
        // Mark  row
        for (int i = 0; i < n; i++) {
            if (mat[row][i] != 0) 
                mat[row][i] = -1989;  // -1989 is visited
            
        }
        
        //  column
        for (int i = 0; i < m; i++) {
            if (mat[i][col] != 0) 
                mat[i][col] = -1989;  
        }
    }

    // Final pass to set all marked rows and columns to zero
    private void finalizeZeroes(int[][] mat) {
        int m = mat.length; 
        int n = mat[0].length; 
        
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                if (mat[i][j] == -1989) 
                    mat[i][j] = 0;

}


}
