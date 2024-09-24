class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int low=0;
        int high=Integer.MIN_VALUE;
        Arrays.sort(nums);
        // for(int e:nums){
        //     high=Math.max(high,e);
        // }
        high=nums[nums.length-1];
        System.out.print(high);
        while(low<=high){
            int mid= low+(high-low)/2; 
            int totaltime=0; 


            for(int i=0;i<nums.length;i++){
                totaltime+=Math.ceil((double)(nums[i]) /(double)(mid));
            }

            if(totaltime<=h)
                high=mid-1; 
            
            else    low=mid+1; 


        }
        return low; 
    }
}