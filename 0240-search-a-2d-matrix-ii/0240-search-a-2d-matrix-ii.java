class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            if (binarySearch(matrix[i], target) != -1) {
                return true;
            }
        }
        return false;
    }

    private int binarySearch(int[] nums, int t) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == t) {
                return mid; 
            } else if (nums[mid] < t) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1;
    }
}
