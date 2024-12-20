class Solution {
    public int minCostClimbingStairs(int[] nums) {

        int n= nums.length; 
        if(n==0)
            return 0; 
        if(n==1) return nums[0] ;
        if(n==2)  return Math.min(nums[0],nums[1]); 

        int[] dp = new int[n+1] ;
        dp[0]=0;
        dp[1]=0; 

        for(int i=2; i<=n;i++){

            dp[i] = Math.min(dp[i-2]+nums[i-2] , dp[i-1]+nums[i-1]); 

        }
        return dp[n]; 


        
    }
}