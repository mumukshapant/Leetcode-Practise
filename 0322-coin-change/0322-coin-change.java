class Solution {
    public int coinChange(int[] coins, int amount) {
        
      // dp[i] represents the minimum number of coins needed to make the  amount i

        int[] dp = new int[amount+1]; 
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[0]=0;

        // i is the current amount, c is the current coin. 
        // only if current amount>= curr coin, we will be able to use that coin to make the amount, else we just skip it 

        for(int i=1;i<=amount;i++){

            for(int c: coins){
                if(i>=c && dp[i-c] !=Integer.MAX_VALUE ){
                    
                    dp[i] = Math.min( dp[i-c]+1 ,  dp[i]);

                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)
            return -1; 
    
        return dp[amount]; 
    }
}