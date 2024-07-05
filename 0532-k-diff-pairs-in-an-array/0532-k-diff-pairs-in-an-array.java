class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if(nums[j] - nums[i] == k) {
                if(i > 0 && nums[i] == nums[i-1]) {
                    i++;
                    j++;
                }
                else {
                    ans++;
                    i++;
                    j++;
                }
            }
            else if(nums[j] - nums[i] < k) {
                j++;
            }
            else {
                if(i == j-1 && j < nums.length) {
                    i++;
                    j++;
                }
                else {
                    i++;
                }
            }
        }

        return ans;   
    }
}