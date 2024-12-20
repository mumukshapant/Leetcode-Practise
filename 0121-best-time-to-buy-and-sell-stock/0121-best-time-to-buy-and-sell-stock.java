class Solution {
    public int maxProfit(int[] nums) {

        int n=nums.length; 
        if(n==0)    return 0; 
        if(n==1)    return 0;
        int buy=Integer.MAX_VALUE ; 
        int sell=0; 

        for(int i=0;i<n;i++){
            buy=Math.min(buy, nums[i]); 
            sell=Math.max(sell, nums[i]-buy);

        }
        return sell ;
        
    }
}