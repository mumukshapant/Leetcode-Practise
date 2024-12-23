class Solution {
    public int numTimesAllBlue(int[] nums) {
        int count = 0; // Counts the moments when all turned-on bulbs shine
        int maxOn = 0; // Tracks the maximum bulb index turned on

        for (int i = 0; i < nums.length; i++) {
            maxOn = Math.max(maxOn, nums[i]); // Update the maximum bulb index turned on
            
            // If the maximum bulb index equals the current moment (i + 1),
            // it means all bulbs up to this moment are on and shining
            if (maxOn == i + 1) {
                count++;
            }
        }

        return count;
    }
}
