class Solution {
    public int minDays(int[] nums, int m, int k) {

        

        int n = nums.length, low=Integer.MAX_VALUE, high=Integer.MIN_VALUE,ans=-1;

        if (m * k > n) {
            return -1;
        }

        for(int i:nums){
            low= Math.min(i, low); 
            high= Math.max(i, high); 
        }

        while(low<=high){
            int count=0, bouquet=0; 
            int bloomday= low+(high-low)/2; 

            for(int i=0;i<n; i++){

                if(nums[i]<=bloomday){
                    //means the flower has bloomed 
                    count++; 

                    if(count==k)
                        {
                            bouquet++; 
                            count=0; 
                        }
                }else  
                    count=0 ;  //reset the count

                }

            if(bouquet >= m ){
                ans = bloomday; 
                high = bloomday-1; 
            }else
                low= bloomday+1; 

        }
        return ans;

        
    }
}