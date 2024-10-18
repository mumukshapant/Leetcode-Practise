class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1]; 
   
        Arrays.fill(dp, Integer.MAX_VALUE);
     dp[0]=0; 
        for(int i=1; i<dp.length; i++){

            for(int c:coins){
                if(c<=i && dp[i-c]!=Integer.MAX_VALUE)
                {
                    dp[i]=Math.min(dp[i-c]+1, dp[i]);
                }
            }

        }if(dp[amount]==Integer.MAX_VALUE)
        return -1; 
        return dp[amount]; 
    }
}