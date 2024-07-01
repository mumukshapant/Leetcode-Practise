class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int d=0; 
        int mini= Integer.MAX_VALUE; 
        for(int i=0;i<nums.length; i++){

            if(nums[i]==target)
                 {
                    d= Math.abs(start-i);
                     mini= Math.min(d, mini); 
                   
                 }
        }
        return mini; 
    }
}