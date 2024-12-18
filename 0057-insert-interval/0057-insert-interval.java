class Solution {
    public int[][] insert(int[][] nums, int[] newinterval) {

        int[] curr = newinterval; // Start with the new interval
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0])); // Sort intervals

        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            // If current interval is completely before `newInterval`
            if (nums[i][1] < curr[0]) {
                ans.add(nums[i]);
            }
            // If current interval is completely after `newInterval`
            else if (nums[i][0] > curr[1]) {
                ans.add(curr); // Add the merged interval
                curr = nums[i]; // Move to the next interval
            }
            // If intervals overlap, merge them
            else {
                curr[0] = Math.min(curr[0], nums[i][0]); // Update start of merged interval
                curr[1] = Math.max(curr[1], nums[i][1]); // Update end of merged interval
            }
        }

        // Add the last interval
        ans.add(curr);

        return ans.toArray(new int[ans.size()][]);
    }
}
