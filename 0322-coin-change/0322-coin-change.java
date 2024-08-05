class Solution {
    public int coinChange(int[] coins, int amount) {

        //ref : https://www.youtube.com/watch?v=NNcN5X1wsaw

        // dp represents the number of coins to make an amount i
        if(amount<1)
            return 0;

        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int c : coins) {
                if (c <= i && dp[i - c] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }

        if(dp[amount]==Integer.MAX_VALUE)
            return -1; 

        return dp[amount]; 

    }
}