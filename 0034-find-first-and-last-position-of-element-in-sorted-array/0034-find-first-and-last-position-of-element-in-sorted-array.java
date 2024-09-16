class Solution {
    public int[] searchRange(int[] nums, int target) {
       
       int lb= lowerbound(nums, target); 
       int ub= upperbound(nums, target); 

        return new int[]{lb,ub}; 
        
    }

    private int lowerbound(int[] nums, int target){
         int low=0; 
         int i=-1; 
        int high= nums.length-1; 
        int[] res= new int[2]; 
        
        while(low<=high){
            int mid=low+(high-low)/2; 
            if(nums[mid]==target){
                i=mid;
                high=mid-1; 
               
            }else if (nums[mid]<target)
                low=mid+1; 


            else
                high=mid-1;
            

    }
        return i; }


    private int upperbound(int[] nums, int target){
         int low=0; 
         int i=-1; 
        int high= nums.length-1; 
        int[] res= new int[2]; 
        
        while(low<=high){
            int mid=low+(high-low)/2; 
            if(nums[mid]==target){
                i=mid;
                low=mid+1; 
                
               
            }else if (nums[mid]<target)
                low=mid+1; 


            else
                high=mid-1;
            

    }
        return i; 
}


}