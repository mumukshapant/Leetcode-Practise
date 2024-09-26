class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int maxcap = 0;
        int low = 0;
       

        // Maximum capacity could be the sum of all
        for (int i : nums)
            maxcap += i;

        // lowest ::  Minimum capacity is the largest single package
        for (int i : nums)
            low = Math.max(low, i);

        int high = maxcap;
         int ans = 0; 

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int reqdays = 1;
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {

                if (sum + nums[i] > mid) {
                    reqdays++;
                    sum = 0;
                }
                sum += nums[i];
            }


                if (reqdays <= days) {
                    ans = mid;
                    high = mid - 1;

                } else
                    low = mid + 1;

            

        }


        return ans;

    }
}