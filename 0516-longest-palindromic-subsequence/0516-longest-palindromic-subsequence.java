class Solution {
    public int longestPalindromeSubseq(String s) {

        int n = s.length(); 
        //int i=0, j=n-1; 
        int[][] dp= new int[n+1][n+1]; 

        String s1= s; 
        String s2= ""; 

        //reverse s1
        for (int i = n - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        for (int i = 0; i <=n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 0; i <=n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] +1 ;

                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], Math.max(dp[i][j - 1], dp[i - 1][j])) ;
                }

            }
        }
        return dp[n][n] -1 ;
                       
    }
}