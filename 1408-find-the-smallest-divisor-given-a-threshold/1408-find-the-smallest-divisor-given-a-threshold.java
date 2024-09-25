class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold) return -1;
        int min = 1;
        int max = Integer.MIN_VALUE;

        for (int i : nums)
            max = Math.max(max, i);


        int sum = 0;
        int low=0; 
        int high= max;

        while(low<=high){

            int mid=low+(high-low)/2; 

            sum = 0;
            for (int i = 0; i <n; i++) {


                sum += Math.ceil((double)(nums[i]) / (double)(mid));
            }

            if (sum <= threshold)
                high=mid-1; 

            else   low=mid+1;
                

        }

       
        return low;
    }
}