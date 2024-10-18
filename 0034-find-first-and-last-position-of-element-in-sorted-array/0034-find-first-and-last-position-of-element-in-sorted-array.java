class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] res= new int[]{lowerbound(nums, target), upperbound(nums, target)}; 

       return res; 
       
    }
    private int lowerbound(int[] nums , int t){
        int low=0; 
        int high= nums.length-1; 
        int i=-1; 
        while(low<=high){
            int mid= low+(high-low)/2; 
            if(nums[mid]==t){
                i=mid; 
                high=mid-1; 
            }else if (nums[mid]>t) {
                high=mid-1; 
            }else{low=mid+1; }
        }


        return i; 
    }

    private int upperbound(int[] nums, int t){
         int low=0; 
        int high= nums.length-1; 
        int i=-1; 
        while(low<=high){
            int mid= low+(high-low)/2; 
            if(nums[mid]==t){
                i=mid; 
                low=mid+1; 
            }else if (nums[mid]>t) {
                high=mid-1; 
            }else{low=mid+1; }
        }
        return i; 
    }
}