class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length; 
        int low=1, high= n-2; 

        if(nums.length==0)
            return -1; 


        if(nums.length==1)
            return nums[0];

        if(nums[0]!=nums[1])
            return nums[0];

        if(nums[n-2]!=nums[n-1])
            return nums[n-1];


        
        while(low<=high){
            int mid= low+(high-low)/2; 
            
            //case 1 - even index 
            if(mid%2 ==0 && nums[mid]==nums[mid-1])
                high= mid-1; 
            else if(mid%2==0 && nums[mid]==nums[mid+1])
                low=mid+1; 
            else if(mid%2!=0 && nums[mid]==nums[mid-1])
                low=mid+1; 
            else 
                high = mid-1; 


        }
        return nums[low]; 
        
    }
}