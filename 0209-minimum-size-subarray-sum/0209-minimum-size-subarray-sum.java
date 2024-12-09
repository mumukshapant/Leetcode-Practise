class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        // i j
       
        int maxlen = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum=0; 

        while (j<nums.length) {

            sum+=nums[j]; //8
            j++; 

            if(sum==t)
                maxlen=Math.min(j-i,maxlen); 

            while(sum>=t){ //sum==8 
                sum-=nums[i]; // sum=6
                maxlen=Math.min(j-i,maxlen); 
                i++;

            }

        }
        return maxlen== Integer.MAX_VALUE ? 0 : maxlen;


    }
}