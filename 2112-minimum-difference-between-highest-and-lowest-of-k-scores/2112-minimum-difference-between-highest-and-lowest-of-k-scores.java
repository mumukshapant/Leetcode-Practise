class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        int diff=0;
        int mindiff=Integer.MAX_VALUE; 
    
    Arrays.sort(nums);

        for(int i=0;i<=nums.length-k;i++){

            diff=nums[i+k-1]-nums[i];
          //  System.out.print(diff+" ");
            mindiff=Math.min(diff, mindiff);
        }
        return mindiff; 
    }
}