class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=1; 
        int high= nums.length-2; 

        if(nums.length==0)
        return -1; 

       if(nums.length==1)
        return nums[0];

        if(nums[0]!=nums[1])
        return nums[0];

        if(nums[nums.length-2]!=nums[nums.length-1])
        return nums[nums.length-1];



        while(low<=high){
            int mid= low+(high-low)/2; 

            if(mid%2==0 && ( nums[mid]==nums[mid-1]))
                high=mid-1; 
            else if (mid%2==0 && nums[mid+1]==nums[mid])
                low=mid+1; 
            else if(mid%2==1 && nums[mid-1]==nums[mid])
                low=mid+1; 
            else 
                high=mid-1; 


            
        }
        return nums[low];
    }
}