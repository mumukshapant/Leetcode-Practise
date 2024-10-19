class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length(); 
        int b = t.length(); 

        boolean[][] dp = new boolean[a + 1][b + 1]; 

        for (int i = 0; i <= b; i++) {
            dp[0][i] = true;
        }

        for (int i = 1; i <= a; i++) {
            dp[i][0] = false;
        }

        // Fill the DP table
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];  // Use matching characters
                } else {
                    dp[i][j] = dp[i][j - 1];  // Skip current character in `t`
                }
            }
        }

        // Return the result for the entire strings `s` and `t`
        return dp[a][b];
    }
}
