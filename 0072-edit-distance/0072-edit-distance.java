class Solution {
    public int minDistance(String w1, String w2) {
        int m= w1.length();
        int n= w2.length(); 
        int[][] dp= new int[m+1][n+1]; 
        
        for(int i=0;i<=n; i++){
            dp[0][i]=i;
        }
        for(int i=0;i<=m; i++){
            dp[i][0]=i ;
        }

        for(int i=1 ;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(w1.charAt(i-1)==(w2.charAt(j-1)))
                    dp[i][j]= dp[i-1][j-1]; 
                else 
                dp[i][j]= Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;  
            }
        }



        return dp[m][n];  
    }
}