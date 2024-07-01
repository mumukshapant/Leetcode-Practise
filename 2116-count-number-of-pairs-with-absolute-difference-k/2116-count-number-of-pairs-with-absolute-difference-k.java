class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int rem = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            rem = k + nums[i];
            if (map.containsKey(rem)) {
                count+=map.get(rem); 

            }
        }

        return count;

    }
}