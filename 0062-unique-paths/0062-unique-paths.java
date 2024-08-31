class Solution {
    public int uniquePaths(int m, int n) {

        if(m==1 && n==1)
        return 1; 

        int[][] dp = new int[m][n];

   

        for(int i =1; i<m; i++)
            dp[i][0]=1;

        for(int j=1;j<n; j++)
            dp[0][j]=1; 
      
// why are we doing [i][j-1] & [i-1][j] when Right is j+1 and down is i+1 ? 
// because to reach the current box i,j : we will see its up & left position values.
        for(int i=1;i<m; i++){
            for(int j=1; j<n; j++){

                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
return dp[m-1][n-1]; 
        
    }
}