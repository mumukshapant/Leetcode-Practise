class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length; 
        double windowsum=0; 
        for(int i=0; i<k;i++){
            windowsum+=nums[i]; 
        }
        double maxsum=windowsum; 
        for(int start=0;start<n-k;start++){
            windowsum = windowsum - nums[start] + nums[k + start];
            maxsum=Math.max(windowsum, maxsum); 
        }
        return maxsum/k;

        
    }
}