class Solution {
    public int minDays(int[] nums, int m, int k) {

        // If there are not enough flowers to make the required number of bouquets
        if (m * k > nums.length) {
            return -1;
        }

        // Set the binary search bounds
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        
        // Find the minimum and maximum val from array 
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        int ans = -1; 

        // Binary search
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            int count = 0; 
            int bouquet = 0; 

            // Try to create bouquets with bloom day <= mid
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;  // Count consecutive flowers that bloom by `mid`

                    if (count == k) {  // If we have enough flowers for one bouquet
                        bouquet++;
                        count = 0;  // Reset flower count for the next bouquet
                    }
                } else {
                    count = 0;  // Reset count if the flower hasn't bloomed
                }
            }

            // If we can make the required number of bouquets
            if (bouquet >= m) {
                ans = mid;  // This is a possible answer
                high = mid - 1;  // Try to find an earlier possible day
            } else {
                low = mid + 1;  // Try a later day
            }
        }

        return ans; 
    }
}
