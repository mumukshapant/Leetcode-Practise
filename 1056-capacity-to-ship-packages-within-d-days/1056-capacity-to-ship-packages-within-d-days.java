class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(nums[i], low);
            high += nums[i];
        }

        int ans = high;

        while (low <= high) {
            int capacity = low + (high - low) / 2;
            int reqdays = 1;
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] + sum <= capacity) 
                    sum += nums[i]; // since curr sum capacity se kam hai, to we can add more boxes
                else {

                    reqdays++;
                    sum = nums[i]; }
                
            }// for loop closing

            // outside the FOR loop

            if (reqdays <= days) { // means capacity zyada li hai humne, issi liye required days kam hain
                ans = capacity;
                high = capacity - 1;

            } else
                low = capacity + 1;



        }

        return ans;

    }
}