class Solution {
    public int maxArea(int[] nums) {
        int n= nums.length; 
        int i=0; 
        int j= n-1; 
        int w=0, h=0,area=Integer.MIN_VALUE; 

        while(i<j){
            w= j-i; 
            h= Math.min(nums[i], nums[j]); 
            area = Math.max(area, w*h); 

            if(nums[i]<nums[j])
             i++; 
            
            else 
                j--; 
        }
        return area; 
    }
}