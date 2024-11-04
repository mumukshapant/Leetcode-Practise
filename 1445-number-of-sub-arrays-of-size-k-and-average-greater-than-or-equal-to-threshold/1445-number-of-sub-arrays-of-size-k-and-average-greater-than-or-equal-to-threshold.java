class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {

        int count=0; 
        int n= nums.length; 
        int sum=0; 

            //  first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        if (sum / k >= threshold) 
            count++;

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k]; 
            if (sum / k >= threshold) {
                count++;
            }
        }   


        return count; 
    }
}