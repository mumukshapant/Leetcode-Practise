class Solution {
    public int deleteAndEarn(int[] nums) {
        // find the max element 
        int n= nums.length; 
        int max= Integer.MIN_VALUE; 

        for(int i=0;i<n;i++)
         max= Math.max(max, nums[i]); 


        //now create a freq array with max number of elements
        int[] freq= new int[max+1]; 
        
        //calculate freq of occurence of every elenbts
        for(int i=0;i<n;i++)
            freq[nums[i]]++; 
            
        //create a dp array
         int[] dp = new int[max+1];
         dp[1]=freq[1];

         for(int i=2; i<=max; i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+i*freq[i]); 
         }
return dp[max] ;

    }
}