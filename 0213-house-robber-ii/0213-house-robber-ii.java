class Solution {
    public int rob(int[] nums) {
        int n= nums.length; 
        if(n==1)
        return nums[0];

        int[] dpNoLastHouse= new int[n-1]; 

        int[] dpNoFirstHouse= new int[n-1];
        
        for(int i=0 ; i<n-1 ; i++){
            dpNoFirstHouse[i] = nums[i+1]; 
            dpNoLastHouse[i] = nums[i]; 
        }

        int nofirsthouse = houserobber(dpNoFirstHouse); 
        int nolasthouse= houserobber(dpNoLastHouse); 

        return Math.max(nofirsthouse, nolasthouse);
    }

    //exact code of House Robber
    // https://leetcode.com/problems/house-robber/
    private int houserobber(int[] nums) {
        int n= nums.length; 
        if(n==0)
            return 0; 
            if(n==1) return nums[0]; 
        if(n==2)
        return Math.max(nums[0],nums[1]); 
        int[] dp = new int[n+1];
        dp[0]=0; 
        dp[1]=nums[0]; 
        dp[2]=Math.max(nums[0], nums[1]) ; 

        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1]  , dp[i-2]+nums[i-1]);

        }
        return dp[n]; 
        
    }
}