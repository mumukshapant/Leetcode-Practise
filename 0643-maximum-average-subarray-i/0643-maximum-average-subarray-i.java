class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n= nums.length; 
        double sum=0.0;
       
//                i
// // [1,12,-5,-6,50,3]

        for(int i=0;i<k;i++){
            sum+=nums[i]; 
        }
        double maxsum=sum; 
        for(int i=k;i<n;i++){
            sum += nums[i] - nums[i-k]; 
            maxsum=Math.max(sum, maxsum); 
        }

        return (maxsum/k); 
    }
}