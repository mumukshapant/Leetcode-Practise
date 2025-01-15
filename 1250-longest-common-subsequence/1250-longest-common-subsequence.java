class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m= s1.length(); 
        int n= s2.length(); 

        int[][] dp= new int[m+1][n+1];
        for(int i=0;i<dp.length;i++)
            dp[i][0]=1; 

        for(int i=0;i<dp[0].length;i++)
            dp[0][i]=1; 

        for(int i=1;i<dp.length;i++){

            for(int j=1;j<dp[0].length; j++){

                if(s1.charAt(i-1) == s2.charAt(j-1) ){
                    dp[i][j]=dp[i-1][j-1]+1; 
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],Math.max(dp[i-1][j], dp[i-1][j-1]) ); 
                }
            }
        }
        
        return dp[m][n]-1;
        
    }
}