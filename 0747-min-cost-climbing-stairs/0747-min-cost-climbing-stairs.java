class Solution {
    public int minCostClimbingStairs(int[] num) {
        int n= num.length ; 
        

        int[] dp = new int[n+1]; 
        dp[0]=0; 
        dp[1]= 0; 
        for(int i=2;i<=n;i++){
            dp[i]= Math.min(num[i-2]+dp[i-2], dp[i-1]+num[i-1]);
        }

                return dp[n];  
    }
}