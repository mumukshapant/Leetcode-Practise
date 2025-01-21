class Solution {
    public int findTargetSumWays(int[] nums, int t) {
        int n= nums.length; 
        int[][] dp =new int[n][n]; 

        return helper(nums, t, 0, 0); 


        
    }
    private int helper(int[]nums, int t, int currsum, int i){
        int add=0, sub=0; 

        if(i==nums.length)
            return currsum==t? 1 : 0 ; 

        add= helper(nums, t, currsum+nums[i], i+1); 
        sub= helper(nums, t,  currsum-nums[i], i+1); 

        return add+sub; 

    }
}