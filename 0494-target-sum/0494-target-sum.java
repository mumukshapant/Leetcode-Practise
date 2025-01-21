class Solution {
    int count = 0;

    public int findTargetSumWays(int[] nums, int t) {
        int n = nums.length;

        helper(nums, t, 0, 0);
        return count;
    }

    private void helper(int[] nums, int t, int currsum, int i) {
        

        if (i == nums.length) {
            if (t == currsum)
                count += 1;
        } 
        
        else {
            helper(nums, t, currsum + nums[i], i + 1);
            helper(nums, t, currsum - nums[i], i + 1);
        }

    }
}