class Solution {
    public int longestPalindromeSubseq(String s) {

        String s1 = s;
        String s2 = "";

        int n = s1.length();

        // reverse String s1
        for (int i = n - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else 
                    dp[i][j] =Math.max(dp[i-1][j-1], Math.max(dp[i][j-1], dp[i-1][j])); 
            }
        }

        //System.out.println(s2);

        return dp[n][n];

    }
}