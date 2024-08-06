class Solution {
    public boolean canJump(int[] nums) {

//start from last
        int goal = nums.length-1; 

        for(int i=nums.length-1;i>=0; i--){
      
            int nextpos= nums[i]+i; 

            if(nextpos>=goal)
                goal=i; 


        }
        

        return goal==0; 
    }
}