class Solution {
    public boolean canJump(int[] nums) {

        int maxposition=0;

        for(int i=0;i<nums.length;i++){

            int currindex=i;
           
            if(currindex > maxposition)
                return false; 

            maxposition= Math.max(currindex+nums[i],maxposition);

            if(maxposition>=nums.length-1)
                return true; 
        }
        return false; 
        
    }
}