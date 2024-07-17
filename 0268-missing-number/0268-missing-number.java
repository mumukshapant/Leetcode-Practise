class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0, high = n-1;
         

        while (low <= high) {
           int mid = low+( high-low) / 2;
            if (nums[mid] <= mid) 
                low = mid+1;

             else 
                high = mid -1;
            
           
        }

        return low;
    }
}
