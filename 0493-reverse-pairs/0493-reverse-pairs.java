class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }

    public int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2 * (long) arr[right])
                right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public void merge(int[] arr, int start, int mid, int end) {

        /**
         * 1 ) use temp[] to store elements of sorted array after merging
         * 2 ) 2 pointers -- left & right where left=start & right= mid+1
         *
         * 3 ) while(left<=right && right<=end) {
         * -- select smallest el from the 2 sides
         * -- insert smallest element to temp array
         * }
         *
         * 4) Remaining els copy to temp[]
         * 5 ) Transfer el of temp[] from low to high in original array
         *
         */

        List<Integer> temp = new ArrayList<>(); // (1)

        int left = start; // ( 2 )
        int right = mid + 1;

//CHANGED TO left<=mid from left<=right
        while (left <= mid  && right <= end) { // ( 3 )

            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // ( 4 ) remaining elements--- CHANGE
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        // (5 )
        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }

    }

    public int mergesort(int[] arr, int start, int end) {

        int count = 0; // CHANGED

        if (start < end) {
            int mid = start + (end - start) / 2;

            count += mergesort(arr, start, mid);
            count += mergesort(arr, mid + 1, end);
            count += countPairs(arr, start, mid, end);

            merge(arr, start, mid, end);
        }
        return count; // CHANGED ( earlier this was void)
    }
}