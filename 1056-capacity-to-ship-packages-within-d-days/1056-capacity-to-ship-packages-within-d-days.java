class Solution {
    public int shipWithinDays(int[] nums, int days) {

        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            high += nums[i];
            low = Math.max(nums[i], low);
        }

        int res = high;

        while (low <= high) {
            int mid = low + (high - low) / 2; // curr selected capacity
            int sum = 0;
            int reqdays = 1;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] <= mid) {
                    sum += nums[i];
                } else {
                    reqdays++;
                    sum = nums[i];
                }
            }

            if (reqdays <= days) {
                high = mid - 1;
                res = mid;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}