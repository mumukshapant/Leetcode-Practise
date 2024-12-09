class Solution {
    public int shipWithinDays(int[] nums, int days) {
        //binary search
        int low=0 ; 
        int high=0; 

        for(int i=0 ;i<nums.length; i++){
            low= Math.max(nums[i], low); 
            high+=nums[i]; 
        }
        int ans=0; 
        while(low<=high){
            int reqdays=1; 
            int totalwt=0; 
            int mid= low+(high-low)/2 ; //this is the minimum capacity
            
            for(int i=0;i<nums.length; i++){
                //totalwt += nums[i]; 
                if(totalwt+nums[i]>mid)
                {
                    reqdays++;
                    totalwt=0; 
                }
                totalwt+=nums[i]; 
            }


              if(reqdays>days){
                    low=mid+1; 

                }else if(reqdays<=days)
                {
                    ans= mid; 
                    high= mid-1; 
                }
            
        }

        return ans; 
    }
}