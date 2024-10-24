class Solution {
    public int minCostClimbingStairs(int[] nums) {
        int n= nums.length; 
        int[] dp = new int[n+1] ; //represent min cost at each step
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=Math.min(dp[i-2]+nums[i-2], dp[i-1]+nums[i-1]);

        }
        return dp[n];
        
    }
}