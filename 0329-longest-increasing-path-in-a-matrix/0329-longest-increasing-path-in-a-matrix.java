class Solution {
    
    public int longestIncreasingPath(int[][] mat) {

        int m= mat.length; 
        int n= mat[0].length; 

        int[][] memo = new int[m][n];

        int res= 0; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n; j++){

               res=Math.max(res, helper(mat, i, j, -1, memo) ) ; 

            }
        }
        return res ;

        
    }
    private int helper(int[][] mat, int i, int j , int prev, int[][]memo ){

        int m= mat.length; int n= mat[0].length; 

        int up= Integer.MIN_VALUE; 
        int down=Integer.MIN_VALUE; 
        int left=Integer.MIN_VALUE; 
        int right=Integer.MIN_VALUE; 
       

        if(i<0 || j<0 || i>=m || j>=n || mat[i][j] <= prev)
            return 0; 

        // If the result is already computed, return it
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        
        up = helper(mat, i-1, j, mat[i][j] , memo );
        down= helper(mat, i+1, j, mat[i][j] , memo );
        left= helper(mat, i, j-1, mat[i][j] , memo );
        right= helper(mat, i, j+1, mat[i][j] , memo );

        memo[i][j]=  1+ Math.max(up, Math.max(down, Math.max(left, right))); 

        return memo[i][j]; 

    }
}