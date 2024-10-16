class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // brute
        int len = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        int i = 0;

        while (j < nums.length) {

            sum += nums[j];
            j++;

            while (sum >= target) {
                sum -= nums[i];
                len = j - i ;
                min = Math.min(min, len);
                i++;
            }

        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}