class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int i = lowerbound(nums, x);
        int j = i + 1;
        List<Integer> res = new ArrayList<>();
        while (k > 0 && i >= 0 && j <= nums.length - 1) {
            int leftdiff = Math.abs(x - nums[i]);
            int rightdiff = Math.abs(x - nums[j]);
            if (leftdiff <= rightdiff) {
                res.add(nums[i]);
                i--;
            } else {
                res.add(nums[j]);
                j++;
            }
            k--;
        }

        while (k > 0 && i >= 0) {

            res.add(nums[i]);
            i--;
            k--;
        }

        while (k > 0 && j <= nums.length - 1) {

            res.add(nums[j]);
            j++;
            k--;
        }

        Collections.sort(res);

        return res;

    }

    private int lowerbound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x)
                return mid;

            if (nums[mid] > x) {
                high = mid - 1;
            } else {
                res = mid;

                low = mid + 1;
            }
        }
        return res;
    }
}