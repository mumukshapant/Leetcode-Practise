class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        Arrays.sort(nums, (a,b)->Integer.compare(a[1],b[1])); 
                      
// we find the number of intervals which are NOT overlapping. (say 4)
// this means out of total n=6, 2 deletions need to be made to get 4 NON Overlapping intervals

        //if same starting and ending - they are not overlapping 
        int n = nums.length; 
        int count=1; 
        int prev_ending=nums[0][1];

        for(int i=1;i<n ;i++){
            if(nums[i][0] >=  prev_ending ) {
                 count++; 
                 prev_ending=nums[i][1]; 
            }
           
            
        } return n-count; 

    }
}