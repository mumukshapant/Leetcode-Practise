class Solution {
    public int findMin(int[] nums) {
        //find point of rotation 
        int high = nums.length-1; 
        int low= 0; 
        int minleft= Integer.MAX_VALUE; 
        int minrght= Integer.MAX_VALUE; 


        while(low<=high){
            int mid= low+(high-low)/2; 

            //right side sorted if 
            if(nums[high]>nums[mid]){
                minrght= Math.min(minrght, nums[mid]); 
                high= mid-1; 

            }

            //left sorted if 
            if(nums[mid]>=nums[low]){
                //if left side is sorted, the minimum will be the first element 
                minleft= Math.min(minleft, nums[low]); 
                //eliminate the left side because we already have its min
                low=mid+1; 
            }

        }
        return Math.min(minleft, minrght); 
    }
}