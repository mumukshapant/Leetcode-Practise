class Solution {
    public int splitArray(int[] nums, int k) {
        
        int low=0; 
        int high=0; 

        for(int i:nums)
        {
            low=Math.max(low, i); 
            high+=i; 
        }

        while(low<=high){
            int mid=low+(high-low)/2; 

            for(int i=0;i<nums.length;i++){
                if(number_of_subarray(nums, mid) > k )  
                low=mid+1; // if the number of subarray count is greater than the k , means mid  ( ie the sum) is too low & we need to increase the lower bound, ie, low =mid+1;

                else   high=mid-1; 
            }
        }
        return low; 
        
    }
    private int number_of_subarray(int[] nums, int k){
        int count=1; //min 1 subarray is there
        int sum=nums[0]; 

        for(int i=1;i<nums.length;i++){
            if(nums[i]+sum> k){
                count++; 
                sum=nums[i];
            }else{
                sum+=nums[i]; 
            }
        }

        return count; 
    }
}