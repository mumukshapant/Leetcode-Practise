class Solution {
    public int minFallingPathSum(int[][] mat) {
        int m= mat.length; 
        int n= mat[0].length ; 
    
        if(m==1 || n==1 )
            return mat[0][0]; 

        int[][] dp = new int[m][n]; 

        for(int i=0;i<n;i++)
            dp[0][i]= mat[0][i];
      
            
        int ans = Integer.MAX_VALUE;
        int up , leftdiag, rightdiag; 

        for(int i=1; i<m ;i ++){
            for(int j=0;j<n; j++){

                up = dp[i-1][j]; 

                 if(j>0 ) 
                    leftdiag= dp[i-1][j-1]; 
                else
                    leftdiag= Integer.MAX_VALUE;
                 
                
                if(j<n-1)
                    rightdiag= dp[i-1][j+1]; 
                else 
                    rightdiag= Integer.MAX_VALUE ; 
                    
                ans = mat[i][j]+ Math.min ( up, Math.min(leftdiag, rightdiag) ) ; 
                dp[i][j]=ans; 
                System.out.print("i value "+ i ); 
                System.out.print(" j value "+ j ); 

                System.out.print(" ans value "+ ans ); 
                System.out.println(""); 




                
            }
        }
        int res= Integer.MAX_VALUE; 

        for(int i=0;i<n; i++)
            res= Math.min(res, dp[m-1][i]); 

        return res; 

    }
}