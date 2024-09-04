class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return;

        for (int i = j + 1; i < nums.length; i++) {

            // swap zero and non zero element.
            // we know nums[j] is a 0
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
            }
        }

    }
}