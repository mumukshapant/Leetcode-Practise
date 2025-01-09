import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Handle edge case for empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        int maxLength = 0;

        for (int num : hashSet) {
            // Check if the current number is the start of a sequence
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Update the maximum length
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
