class Solution {
    public int minPathSum(int[][] g) {
    
    int m= g.length; 
    int n= g[0].length; 

    int[][] dp = new int[m][n];   
    dp[0][0]= g[0][0]; 

    for(int i=1;i<n;i++) // only left
        dp[0][i]= dp[0][i-1]+g[0][i]; 

    for(int i=1;i<m;i++)
        dp[i][0]= dp[i-1][0] + g[i][0] ;  //only up

    for(int i=1; i<m;i++){
        for(int j=1 ; j<n; j++){
            int up = dp[i-1][j]; 
            int left= dp[i][j-1]; 

            dp[i][j] += Math.min(up, left)+g[i][j]; 
        }
    } 

    
    return dp[m-1][n-1]; 
    }
  
}