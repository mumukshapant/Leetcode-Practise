class Solution {
    public int maxArea(int[] nums) {

int n=nums.length; 
        int i=0; 
        int j=n-1; 
        int maxArea=0; 
    while(i<j){
        int h=Math.min(nums[i], nums[j]); 
        int area = h*(j-i); 

        maxArea=Math.max(area, maxArea); 


        if(nums[j]>nums[i]){
            i++; 
        }
        else
        j--; 

    }
        return maxArea; 
    }
}