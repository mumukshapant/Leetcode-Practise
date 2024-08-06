class Solution {
    public boolean canJump(int[] nums) {     //start from i=0;


        int maxReach = 0; 

        for (int i = 0; i < nums.length; i++) {
            
            if (i > maxReach) //curr index is beyond the max we can reach
                return false;

            maxReach = Math.max(maxReach, i + nums[i] );

            if (maxReach >= nums.length - 1) 
                return true;
            
        }
        return false;
    }
}
