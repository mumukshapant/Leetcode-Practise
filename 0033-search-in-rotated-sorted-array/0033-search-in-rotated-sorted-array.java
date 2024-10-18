class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length; 
        //find point of rotation 
        int low=0; 
        int high= n-1; 

        while(low<=high){
            int mid= low+(high-low)/2; 

            if(nums[mid]==target)
                return mid; 



            //left side unsorted BUT right sorted 
            if(nums[low]>nums[mid]){
                if(target>nums[mid] && target <= nums[high]) //means target is in left side
                    low=mid+1; 
                else//T in right
                    high=mid-1; 



            }else if(nums[mid]>nums[high]) {
            //right side unsorted, but left sorted 
            

            if (target >= nums[low] && target < nums[mid])
                high=mid-1; 
            else low=mid+1; 
                
            }
        
        // If neither side is rotated, perform normal binary search adjustments
            else {
                if (target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        
      
        
        }
        return -1;
        
    }
}