class Solution {
    public int maxArea(int[] nums) {
        int i=0; 
        int j=nums.length-1; 
        int area=Integer.MIN_VALUE; 

        while(i<j){
            int height= Math.min(nums[i], nums[j]); 
            area= Math.max(area, height*(j-i));
            
            if(nums[i]>nums[j])
                j--; 
            else i++; 
        }
        return area; 
    }
}