class Solution {
    public boolean search(int[] nums, int target) {

        int low=0; 
        int high=nums.length-1; 
        while(low<=high){
            int mid= low+(high-low)/2; 

             

            if(nums[mid]==target)
                return true; 

                //Edge case:
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            
            //sorted -- right side 
            else if(nums[high]>=nums[mid]){

                if(target>=nums[mid] && target<=nums[high])
                    low=mid+1; 
                else high= mid-1; 

            }

            //sorted left 
            else{
                if(target<=nums[mid] && target>=nums[low])
                    high= mid-1; 
                else 
                    low = mid+1; 
                
            }
        }
        return false;
        
    }
}