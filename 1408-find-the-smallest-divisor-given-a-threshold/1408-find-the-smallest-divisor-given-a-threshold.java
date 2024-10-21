class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n= nums.length; 
        int low=1; 
        int high= Integer.MAX_VALUE;
        int sum=0;  

        for(int i:nums)
            high= Math.max(high, i); 

        while(low<=high){
            sum=0; 
            int mid= low+(high-low)/2; 
            
            for(int i=0;i<n;i++){
                sum+=Math.ceil((double)nums[i]/(double)mid); 
            }
            if(sum>threshold){
                low=mid+1; 
            }
            else    high= mid-1; 
        }return low; 
    }
}