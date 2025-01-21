class Solution {
    int offset; 
    public int findTargetSumWays(int[] nums, int t) {
        int n = nums.length;

        int sum = 0;
        
        for (int num : nums) {
            sum += num;
        }



        //  to handle negative indices
         offset = sum;

        // to handle [-sum, sum]
        Integer[][] memo = new Integer[n][2 * sum + 1];

        return helper(nums, t, 0, 0, memo);
    }

    private int helper(int[] nums, int t, int currsum, int i, Integer[][] memo) {
        if (i == nums.length) {
            return currsum == t ? 1 : 0;
        }

        int memoIndex = currsum + offset;

        if (memo[i][memoIndex] != null) {
            return memo[i][memoIndex];
        }

        int add = helper(nums, t, currsum + nums[i], i + 1, memo);
        int subtract = helper(nums, t, currsum - nums[i], i + 1, memo);

        memo[i][memoIndex] = add + subtract;

        return memo[i][memoIndex];
    }
}
