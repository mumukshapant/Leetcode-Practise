class Solution {
    public int longestPalindromeSubseq(String s) {

        String s1 = s;
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                 
                if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;     // diagonal +1
                } else {
                    dp[i][j]=Math.max(dp[i-1][j-1], Math.max(dp[i-1][j] , dp[i][j-1])); 
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
