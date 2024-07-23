class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

  
        int m = nums1.length;
        int n = nums2.length;
          // Ensure nums1 is the smaller array
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int length = n + m;
        int half = (length+1) / 2;
        int low = 0;
        int high = m;
        double median = 0;

        while (low <= high) {

             int mid = low + (high - low) / 2; // of smaller array
            int midlarger = half - mid;

            // Edges handling
            int l1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int l2 = (midlarger == 0) ? Integer.MIN_VALUE : nums2[midlarger - 1];
            int r1 = (mid == m) ? Integer.MAX_VALUE : nums1[mid];
            int r2 = (midlarger == n) ? Integer.MAX_VALUE : nums2[midlarger];

                  
        
            // condition satisfy l1<=r2 && l2<=r2
            if (l1 <= r2 && l2 <= r1) {

                // even length
                if (length % 2 == 0)
                    return  (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else
                    return Math.max(l1, l2);
      
            } else if (l1 > r2)
                high = mid - 1;

            else
                low = mid + 1;

        }
        return median;

    }
}