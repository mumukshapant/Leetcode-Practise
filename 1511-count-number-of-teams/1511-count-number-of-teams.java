class Solution {
    public int numTeams(int[] nums) {
        // leftsmaller+leftgreater+1+rightsmaller+rightgreater=n

        int n= nums.length; 
        int count=0;
        int leftgreater=0, rightsmaller=0; 
        int countincreasingorder=0, countdecreasingorder=0;

        for(int mid = 1; mid< n-1;mid++){
            //left smaller 
            int leftsmaller=0; 
            for(int i=0;i<mid;i++){
                if(nums[i]<nums[mid])
                    leftsmaller++;
            }

            //right greater
            int rightgreater=0; 
            for(int i=mid+1;i<n;i++){
                if(nums[i]>nums[mid])
                    rightgreater++; 
            }

            count+= leftsmaller*rightgreater; 
            
            leftgreater= mid-leftsmaller; 
            rightsmaller= n-1-mid-rightgreater; 

            count += leftgreater*rightsmaller; 




        } 
       
       
        return count; 
    }
}