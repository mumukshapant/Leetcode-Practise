class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int i : nums) {
            low = Math.max(low, i);
            high += i;
        }
        // mid represents the largest sum possible

        while (low <= high) {
            int mid = low + (high - low) / 2;
            for (int i = 0; i < nums.length; i++) {
                if (countsubarray(nums, mid) > k) 
                    low=mid+1; 

                else 
                    high=mid-1; 
                
            }

        }return low; 

    }

    private int countsubarray(int[] nums, int maxsum) {
        int count = 1;
        int sum = nums[0];
        // k is the max expected sum
        for (int i = 1; i < nums.length; i++) {

            if (sum + nums[i] > maxsum) {
                count++; // means another subarray
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }

        return count;
    }
}